package lec1.com;
import java.util.Scanner;
public class lec2 {
    public static void main(String[] args) {
        String str="madam";
        int count = 0;
        for(int i =1 ;i<=str.length()/2;i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-i))
            {
                count++;
                break;
            }

            if(count == 0)
            {
                System.out.println("Pelindrome");
            }
            else
            {
                System.out.println("Not Pelindrome");
            }
        }
        // ['h','e','l']


        // for(int i=0;i<str.length();i++){
        //     System.out.println(str.charAt(i));
        // }
        // System.out.println(str.charAt(str.length()-1));
        // str.concat("hii");
        // System.out.println(str);



        // int arr[]={1,2,4567,45};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // System.out.println(arr.length);



        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter you int value");
        // int a =sc.nextInt();
        // System.out.println(a);
        // System.out.println("Enter you float value");
        //  float b=    sc.nextFloat();
        // String str="hello";
        // System.out.println("Enter you String  value");
        //     String str=    sc.nextLine();
        //     System.out.println(str);

        // System.out.prit("Enter integer: ");
        // int a = sc.nextInt();

        // System.out.print("Enter double: ");
        // double b = sc.nextDouble();

        // System.out.print("Enter single word: ");
        // String c = sc.next();  // single word

        // sc.nextLine(); // buffer clear karne ke liye

        // System.out.print("Enter full line: ");
        // String d = sc.nextLine();  // full line input

        // System.out.println("Integer: " + a);
        // System.out.println("Double: " + b);
        // System.out.println("Word: " + c);
        // System.out.println("Line: " + d);

   // }



// // class lec2{
// //     public static void main(String[] args) {
// //         String s = "Hello";
// //         System.out.println(s.indexOf("H"));
// //         // for(int i =0;i<s.length();i++){
// //         //     System.out.print(s.charAt(i));
// //         // }
// //         // System.out.println(s.charAt(1));
// //         // s.concat(" World");
// //         // System.out.println(s);  // Output: Hello


// //         // String s2="hello";
// //         // String s1=new String("hello");


// //         // System.out.println(s1==s2);
// //     }
// // }

// import  java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//           int a=  sc.nextInt();

//     }
// }
//    byte
//    short



// class  lec2{
//     public static void main(String[] args) {
//         String str="hello";

//       char[] ch=   str.toCharArray();
//       for(int i =ch.length-1;i>=0;i--){
//         System.out.println(ch[i]);
//       }

//     //   ch.toString()

//     //  String str=new String("hello");



    // String str1
    // String str1="hello";
    // System.out.println(str==str1);
    // String str=new String("hello");
    // String str1=new String("hello");
    // System.out.println(str==str1);
    // str.charAt(0);
    // System.out.println( str.charAt(0));
    // String str1;
    // str1.concat("hii");
    // System.out.println(str);
    // for(int i=0;i<str.length();i++){
    //     System.out.println(str.charAt(i));
    // }
    // for(int i=str.length()-1;i>=0;i--){
    //     System.out.println(str.charAt(i));
    // }
    // System.out.println(str.charAt(1));
    // int arr[]={1,2,3,4,5};
    // for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i]);
    // }
    // System.out.println(arr[0]);
    // byte a=5;
    // short b=a;
    // int c=b;
    // short a=130;
    // byte b=(byte)a;
    // System.out.println(b);


     }
 }

