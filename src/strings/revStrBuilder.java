package strings;

public class revStrBuilder {
    public static void main(String[] args) {
        String s="raghav";
       StringBuilder sb=new StringBuilder(s);

       // sb.reverse();
//        sb.deleteCharAt(1);
//        sb.insert(1,'e');
//        sb.delete(2,6);
//        System.out.println(sb);
//        int i=0 , j=sb.length()-1;
//        while(i<=j){
//            char temp1 =sb.charAt(i);
//            char temp2 = sb. charAt(j);
//            sb.setCharAt(i,temp2);
//            sb.setCharAt(j,temp1);
//            i++;
//            j--;
//        }
//        System.out.println(sb);
        String a="Aditya";
        StringBuilder as =new StringBuilder(s);
        as.reverse();
        a=as.toString();
        System.out.println(a);
    }
}
