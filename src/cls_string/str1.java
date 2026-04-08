package cls_string;

import java.util.Arrays;

public class str1 {
    public static void main(String[] args) {

        String str1="listen";
        String str2="silent";
        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("not Anagram");
        }


//       String str1="naman";
//       String rev="";
//       for(int i=str1.length()-1;i>=0;i--){
//           rev=rev+ str1.charAt(i);
//       }
//        if(str1.equals(rev)){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("nhi hai");
//        }

//       String str2= new String("hi");
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str1.length());
//        System.out.println(str1.substring(0,2));
//        System.out.println(str1.replace('l','z'));


    }
}
