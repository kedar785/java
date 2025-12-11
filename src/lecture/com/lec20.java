package lecture.com;

//multithreading : -
//class MyThread extends  Thread{
//    public void run(){
//        System.out.println(Thread.currentThread().getName());
//
//            for(int i=0;i<5;i++){
//                System.out.println("downloading file ....."+(i+20)+"%");
//                System.out.println(i+ "time");
//                try{
//                    Thread.sleep(2000);
//                }catch (Exception e){
//
//                }
//            }
//
//    }
//}
//public class lec20 {
//    public static void main(String[] args) {
//        MyThread t1=new MyThread();
//        t1.start();
//        try{
//            t1.join();
//        } catch (Exception e) {
//
//        }
////        System.out.println("hello");
////        System.out.println("hii");
//        for(int i=0;i<5;i++) {
//
//            System.out.println(i + "main");
//        }
//       // System.out.println(Thread.currentThread().getName());
//    }
//}


class Bank {
    int balance = 100;
    synchronized   void withdraw(int amt) {
        System.out.println(Thread.currentThread().getName() + " checking balance...");
        if (balance >= amt) {
            System.out.println(Thread.currentThread().getName() + " proceeding withdraw...");
            balance = balance - amt;
            System.out.println("Balance left: " + balance);
        } else {
            System.out.println("Not enough balance");
        }
    }
}

class MyThread extends Thread {
    Bank b;
    MyThread(Bank b) { this.b = b; }

    public void run() {
        b.withdraw(80);
    }
}

public class lec20 {
    public static void main(String[] args) {
        Bank b = new Bank();
        MyThread t1 = new MyThread(b);
        MyThread t2 = new MyThread(b);
        t1.setName("om");
        t2.setName("Aman");
        t1.start();
        t2.start();
    }
}
