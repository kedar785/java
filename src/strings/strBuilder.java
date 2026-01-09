package strings;

public class strBuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder(("raghav")); //empty string ki capacity 16 hoti hai
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.append("garg");
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.setCharAt(1,'o');
        System.out.println(s);
    }
}
