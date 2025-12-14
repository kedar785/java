package DSA_practice;

class Fraction{
    int num;
    int den;
    Fraction(int num,int den){
        this.num=num;
        this.den=den;
    }
    void print(){
        System.out.println(num+" /"+den+" ");
    }
void add(Fraction F){
        num=num*F.den + den*F.num;
                den=num*F.den;
}
void divide(Fraction F){
        num=num*F.den;
        den=den*F.num;
}
}
public class prac10 {
    public static void main(String[] args) {
        Fraction F=new Fraction(3,7);
        F.print();
        Fraction F1=new Fraction(2,5);
        F.add(F1);
        F.print();
        F.divide(F1);
        F.print();
    }
}
