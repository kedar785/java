package strings;

public class passStrToMethod {
    public static void change(String x){
        x="sachin";
    }
    public static void main(String[] args) {
        String x="kedar";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
