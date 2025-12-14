package DSA_practice;

class Cricketer{ //final and static
    //final String country="India";
    static String country;  //static:- country ka common box hai,
    int runs;
    String name;
    double avg;
   void print(){
        System.out.println(country+" "+name+" "+runs+" "+" "+avg+" ");
    }

}

public class prac8 {
    public static void main(String[] args) {
        Cricketer c=new Cricketer();
       // c.country="usa";  ERROR
        //System.out.println(c.country);
        Cricketer c1=new Cricketer();
        c.country="india";

        System.out.println(c1.country);


 }

}
