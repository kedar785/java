package p2;

//Access modifiers :-
// class ,package,subclass,dusra package.
// private ko sabhi me use kar sakte ho.
//protected ko dusre package bus me use nahi kar sakte ho.
// default(bina keyword) ko keval  class and package me usr kar sakte ho.
// private ko keval class bus me use kar sakte ho.
 class S{
     public int x=5;
     protected int y=6;
     int z=3;
     private int v=7;
     public void math(){
         System.out.println(y);
     }
 }
public class data {
      public static void main(String[] args) {
          S m1 = new S();
          System.out.println(m1.y);
      }
 }






