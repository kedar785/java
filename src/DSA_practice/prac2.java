package DSA_practice;
import java.util.*;
//import java.sql.SQLOutput;
//import java.util.Scanner;

//public class prac2 {
//
//
//
//    public static class Student{
//        String name;
//        int rno;
//        double cgpa;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//Student s1=new Student();
//s1.name="rupa";
//s1.rno=123;
//s1.cgpa=8.5;
//        Student s2=new Student();
//        s2.name="rupa";
//        s2.rno=sc.nextInt();
//        s2.cgpa=7.5;
//        System.out.println(s1.name+" ,"+s1.rno+" ,"+s1.cgpa);
//        System.out.println(s2.name+" ,"+s2.rno+" ,"+s2.cgpa);
//    }
//}

//public class prac2 {
//    public static class Car {
//        int seats;
//        String name;
//        double length;
//        String type;
//        int torque;
//        void print(){
//            System.out.println(seats+" "+name+" "+type+" "+torque+"nm ");
//        }
//    }
//    public static void main(String[] args) {
//        Car c = new Car();
//        c.length = 647.8;
//        c.name = "kia sonet";
//        c.seats = 5;
//        c.torque = 32;
//        c.type = "SUV";
//               c.print();
//
//    }
//}

//polymorphism

//public class prac2 {
//    public static class Dog{
//        void  speak(){
//System.out.println("bhau bhau");
//        }
//    }
//    public static class Cat{
//        void speak(){
//            System.out.println("Meou Meou");
//        }
//    }
//    public static class Lion{
//void speak(){
//    System.out.println("dahadta hai");
//        }
//    }
//    public static void main(String[] args) {
//Dog d=new Dog();
//Cat c=new Cat();
//Lion l=new Lion();
//
//d.speak();
//c.speak();
//l.speak();
//    }
//}

//private
// class Student{
//    String name;
//    private int rno;
//    double cgpa;
//}
//public class prac2 {
//
//    public static void main(String[] args) {
//       Student s=new Student();
//       s.cgpa=8.6;
//        System.out.println(s.cgpa);
//       //s.rno=56;
//        //System.out.println(s.rno);
//    }
//}

  //constructor  :
  public class prac2 {
      public static class Car{
          int seats;
          String name;
          double length;
          Car(int x,String s,double d){
              seats =x;
              name=s;
              length=d;

          }
          void print(){
              System.out.println(seats+" "+name+" "+length);
          }
      }

      public static void main(String[] args) {
          Car c1=new Car (5,"kia sonet",3.99);
          c1.print();
          Car c2=new Car(4,"lord alto",3.56);
          c2.print();

      }
  }