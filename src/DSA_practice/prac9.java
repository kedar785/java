package DSA_practice;

import java.util.concurrent.Callable;

class ComplexNum{
    int x;
    int y;
    ComplexNum(int x,int y){
        this.x=x;
        this.y=y;

    }
    void print(){
        if(y>=0)System.out.println(x+"  + "+y+"i");
        else System.out.println(x+" -"+(-y)+"i");
    }
    void add(ComplexNum z2){
       // z2.x=8;
       x  += z2.x;
         y+=z2.y;
    }
    void multiply(ComplexNum z){
        x +=z.x;
        y +=z.y;
    }
}
public class prac9 {
    public static void main(String[] args) {
                ComplexNum z1=new ComplexNum(3 ,-7);
        ComplexNum z2=new ComplexNum(2 ,5);
               z1.print(); z2.print();
             z1.add(z2);
         z2.print();
         z2.multiply(z1);
         z1.print();
    }
}
