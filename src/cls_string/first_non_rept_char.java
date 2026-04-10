package cls_string;

public class first_non_rept_char {
    public static void main(String[] args) {

        String str1="12";
        String str2="3";
        int num1=0;
        int num2=0;
        for(int i=0;i<str1.length();i++){
            num1=num1*10+(str1.charAt(i)-'0');
        }
        for(int i=0;i<str2.length();i++){
            num2=num2*10+(str2.charAt(i)-'0');
        }
        System.out.println(num1*num2);

//        String str1="aabbbccaaffee";
//        String result="";
//        result +=str1.charAt(0);
//        for(int i=1;i<str1.length();i++){
//            if(str1.charAt(i)!=str1.charAt(i-1)){
//                result +=str1.charAt(i);
//            }
//        }
//        System.out.println(result);


//        String str1="a2b5c7d3e9";
//         char max='0';
//        for(int i=0;i<str1.length();i++){
//            char ch=str1.charAt(i);
//            if(ch>='0' && ch<='9' && ch>max){
//                max=ch;
//
//            }
//        }
//        System.out.println(max);

//        String str1="abcdef";
//        char remove='c';
//        for(int i=0;i<str1.length();i++){
//            if(str1.charAt(i)!=remove){
//                System.out.print(str1.charAt(i));
//            }
//        }
//        String str1= "abc";
//         int count=0;
//         for(int i=0;i<=str1.length();i++){
//           for(int j=i;j<str1.length();j++){
//               if(str1.charAt(i)==str1.charAt(j)){
//                   count++;
//               }
//           }
//         }
//        System.out.println(count);
    }
}
