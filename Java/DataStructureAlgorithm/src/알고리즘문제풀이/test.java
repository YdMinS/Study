//package 알고리즘문제풀이;
//
//import java.util.*;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.LinkedBlockingQueue;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//
//public class test {
//    public static void main(String[] args) {
//        System.out.println("t");
//    }
//
//    public class Subscriber {
//        void send(String message) {
//            //....
//        }
//    }
//
//    public class NotificationService {
//        private Map<String, Set<Subscriber>> topicMap = new HashMap();
//        private ExecutorService executorService = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
//
//        void publish(String topic, String message) {
//            Set<Subscriber> subscriberList = topicMap.get(topic);
//            if(subscriberList==null){
//                System.out.println("list is null");
//            }
//            for(Subscriber sub : subscriberList){
//                Runnable runnableTask = () -> {
//                    try{
//                        System.out.println(Thread.currentThread().getName() + " start");
//                        sub.send(message);
//                        System.out.println(Thread.currentThread().getName() + " end");
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                };
//                executorService.execute(runnableTask);
//            }
//            // 실패 한 사람들 2번씩 더 send 처리한다
//        }
//
//        void subscribe(String topic, Subscriber subscriber) {
//            if(topicMap.get(topic)==null){
//                Set<Subscriber> set = new HashSet<>();
//                set.add(subscriber);
//                topicMap.put(topic, set);
//            } else {
//                Set<Subscriber> subscriberList = topicMap.get(topic);
//                if(!subscriberList.contains(subscriber)){
//                    subscriberList.add(subscriber);
//                }
//            }
//        }
//        // 토픽별 동시성
//    }
//}

//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class AccountManager {
//    private final ConcurrentHashMap<String, Account> accounts = new ConcurrentHashMap<>();
//    private final ConcurrentHashMap<String, Lock> accountLocks = new ConcurrentHashMap<>();
//
//    // 계좌 추가 메서드
//    public void addAccount(String accountId, double initialBalance) {
//        accounts.putIfAbsent(accountId, new Account(accountId, initialBalance));
//    }
//
//    // 출금 메서드
//    public void withdraw(String accountId, double amount) throws Exception {
//        Lock lock = accountLocks.computeIfAbsent(accountId, key -> new ReentrantLock());
//
//        if(!lock.tryLock()){
//            throw new Exception("x");
//        }
//        try {
//            Account account = accounts.get(accountId);
//            if (account == null) {
//                throw new Exception("Account not found");
//            }
//
//            if (account.getBalance() >= amount) {
//                account.setBalance(account.getBalance() - amount);
//                System.out.println("Withdrawn: " + amount + " from account: " + accountId);
//            } else {
//                throw new Exception("Insufficient balance");
//            }
//        } finally {
//            lock.unlock();
//        }
//
//    }
//
//    // 입금 메서드
//    public void deposit(String accountId, double amount) throws Exception {
//        Lock lock = accountLocks.computeIfAbsent(accountId, key -> new ReentrantLock());
//
//        lock.lock();
//        try {
//            Account account = accounts.get(accountId);
//            if (account == null) {
//                throw new Exception("Account not found");
//            }
//
//            account.setBalance(account.getBalance() + amount);
//            System.out.println("Deposited: " + amount + " to account: " + accountId);
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    // 간단한 Account 클래스
//    static class Account {
//        private final String accountId;
//        private double balance;
//
//        public Account(String accountId, double balance) {
//            this.accountId = accountId;
//            this.balance = balance;
//        }
//
//        public String getAccountId() {
//            return accountId;
//        }
//
//        public double getBalance() {
//            return balance;
//        }
//
//        public void setBalance(double balance) {
//            this.balance = balance;
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            AccountManager accountManager = new AccountManager();
//            accountManager.addAccount("123", 1000);
//            accountManager.addAccount("456", 2000);
//
//            accountManager.deposit("123", 500);
//            accountManager.withdraw("123", 300);
//
//            accountManager.deposit("456", 1000);
//            accountManager.withdraw("456", 2500);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}