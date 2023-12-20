// 5줄로 서버 만들기
const http = require('http');
// 서버 생성
http.createServer((request, response)=>{
    response.write("Welcome"); // 응답메시지
    response.end(); // 응답 종료
}).listen(3000); // 서버가 3000번 포트에서 수신 대기