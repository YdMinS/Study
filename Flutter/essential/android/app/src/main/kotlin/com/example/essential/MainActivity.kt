package com.example.essential

import android.util.Log
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.BasicMessageChannel
import io.flutter.plugin.common.EventChannel
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.StringCodec
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine)

        // message channel
        val messageChannel = BasicMessageChannel<String>(
            flutterEngine.dartExecutor,
            "messageChannelA",
            StringCodec.INSTANCE
        )
        messageChannel.setMessageHandler { message, reply ->
            Log.d("msg", "receive : $message")
            reply.reply("Reply from Android")
            messageChannel.send("Hello from Android") { reply ->
                Log.d("msg", "reply : $reply")
            }
        }

        // method channel
        val methodChannel =
            MethodChannel(flutterEngine.dartExecutor.binaryMessenger, "methodChannelA")
        methodChannel.setMethodCallHandler { call, result ->
            io.flutter.Log.d("flutter", call.toString())
            if (call.method == "methodA") {
                val map = call.arguments as Map<String, String>
                io.flutter.Log.d("flutter", "${map.get("Username")}, ${map.get("Password")}")
                result.success(mapOf("one" to 10, "two" to 20))

                methodChannel.invokeMethod("methodB", "Hello from Android",
                    object : MethodChannel.Result {
                        override fun success(result: Any?) {
                            io.flutter.Log.d("flutter", "${result as String}")
                        }

                        override fun error(
                            errorCode: String,
                            errorMessage: String?,
                            errorDetails: Any?
                        ) {}
                        override fun notImplemented(){}
                    })
            } else {
                result.notImplemented()
            }
        }

        // event channel
        val eventChannel = EventChannel(flutterEngine.dartExecutor, "eventChannel")
        eventChannel.setStreamHandler(
            object : EventChannel.StreamHandler{
                override fun onListen(
                    p0: Any?,
                    p1: EventChannel.EventSink?
                ){
                    io.flutter.Log.d("platform", "onListen ...")
                    p1?.success("send event data..from native...")
                }
                override fun onCancel(p0: Any?){
                }
            }
        )
    }
}
