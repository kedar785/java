package lecture.com;

public class lec5 {
    public static void main(String[] args){
        //StringBuilder str=new StringBuilder("hello");
//        str.insert(1,"byee");
//        System.out.println(str);
//
//        str.replace(1,4,"hello");
//        System.out.println("replace():"+str);
//
//        str.reverse();
//        System.out.println("reverse:"+str);
//     str.length();
//        System.out.println("length():"+str);
//String str="i love java";
//String a[]=str.split(" ");
//       StringBuilder result=new StringBuilder();
//       for(String i:a){
//           StringBuilder data=new StringBuilder(i);
//           result.append(data.reverse()).append(" ");
//       }
//        System.out.println(result);
        String str="aabbc";//a2b2c1
        StringBuilder result= new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                result.append(str.charAt(i-1)).append(count);
                count=1;
            }

        }
        result.append(str.charAt(str.length()-1)).append(count);
        System.out.println(result);

    }
}
