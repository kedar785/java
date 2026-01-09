package strings;

public class internigNew {
    public static void main(String[] args) {
        String s="raghav";
        String n=new String("raghav");

       // s+="harsh";
        s=s.substring(0,2)+'d'+s.substring(3,5);
        System.out.println(s.equals(n));
    }
}
