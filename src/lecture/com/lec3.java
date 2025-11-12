package lecture.com;

public class lec3 {
//    public static void main(String[] args){
//        String str="hello";
//        System.out.println(str.length());
//        System.out.println(str.charAt(index:1));
//        System.out.println(str.toUppererCase());
//
//       System.out.println(str.toLoverCase());
//
public static void main(String[] args){
    //String str="hello";
    //String str1="hello";
//    String str=new String("hello");
//    String str1=new String("hello");
//    System.out.println(str==str1);
//    System.out.println(str.equals(str1));

//    String a="aba";
//    String b="";
//    for(int i=a.length()-1;i>=0;i--){
//        b+=a.charAt(i);
//    }
//    if(a.equals(b)){
//        System.out.println("palindrome hai");
//    }else{
//        System.out.println("palindrome nhi hai");
//    }
//    String str="java cpp c php js";
//    String a[]=str.split("");
//    for(String val:a){
//        System.out.println(val);
//    }


//

    String str="hello";
    String newStr="";
    for(char ch:str.toCharArray()){
        if(newStr.indexOf(ch)==-1){
            newStr+=ch;
        }
    }
    System.out.println(newStr);
}
    }