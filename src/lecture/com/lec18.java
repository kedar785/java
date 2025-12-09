package lecture.com;

public class lec18 {
    public static void main(String[] args) {
        // exception handling(error handling).
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("main me handal hua:  " + e);
        }
        System.out.println("program continue...");
    }
    static void  riskyMethod() throws ArithmeticException{
        System.out.println("riskyMethod start");
        int result =10/0;
        System.out.println("result: "+ result);
        }
}
//try{
//    voteAge(15);
//}catch(Exception e){
//    System.out.println(e);
//}
//try{
//    voteAge(19);
//}catch(Exception e){
//
//}
//    }
//static  void voteAge(int age){
//    System.out.println("chec for vate");
//    if(age<18){
//        throw new IllegalArgumentException("Aap vote nhi de sakte");
//    }
//    }
//}
       // System.out.println("hello");


//        try{
//            int a=5;
//            int b=0;
//            int c=a/b;
//            System.out.println(c);
//        }
      //  try{
//            int arr[]={1,2,3};
//            System.out.println(arr[5]);

//            String str=null;
//            System.out.println(str);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }finally{
//            System.out.println("finally hamesha chalega");
//        }
//        System.out.println("buye!!");
//        int a=4;
//        int b=0;
//        int c=a/b;
//        System.out.println(c);
//        System.out.println("buye!!");

