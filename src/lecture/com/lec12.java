package lecture.com;

//class Atm{
//    private int TotalBalance=10000;
//    public void getB(){
//        System.out.println(TotalBalance);
//    }
//    public void setBalance(int amount){
//        if(amount>0){
//            TotalBalance=TotalBalance+amount;
//        }
//        System.out.println( TotalBalance);
//    }
//}
//public class lec12 {
//    public static void main(String[] args){
//
//        Atm s1=new Atm();

import java.nio.channels.Channel;

////        s1.getB();
//      s1.setBalance(786);
//    }
//}


class YouTube{
    private String ChannelName;
    private int SubscriberCount;
    public YouTube(String ChannelName){
        this.ChannelName=ChannelName;
        this.SubscriberCount=0;
    }
    public void getNmae(){
        System.out.println(ChannelName);
    }

    public void getSubscriberCount() {

            System.out.println(SubscriberCount);
        }

    public void setSubscriberCount() {
        SubscriberCount++;}
    public void setunSubscriberCount() {
        if(SubscriberCount>0){

         SubscriberCount--;}
        else{
            System.out.println("galt h");
        }
    }

}
    public class lec12 {
 public static void main(String[] args) {
     YouTube s1=new YouTube("max");
     s1.getNmae();

     s1.setSubscriberCount();
     s1.setSubscriberCount();
     s1.setSubscriberCount();
     s1. getSubscriberCount();

 }
 }