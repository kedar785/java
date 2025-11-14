package lecture.com;
//class Employee{
//    void work(){
//        System.out.println("project work");
//
//    }
//}
//class Manager extends Employee{
//    void meeting(){
//      System.out.println("Attending meeting");
//    }
//}
//public class lec9 {
//    public static void main(String[] args){
//Manager s1=new Manager();
//s1.work();
//s1.meeting();
//    }
//}

//class person{
//    void displayName(){
//        System.out.println("ram");
//    }
//}
//class Student extends person{
//    void displayClasss(){
//        System.out.println("second");
//    }
//}
//class Monitor extends Student{
//    void checkDiscipline(){
//        System.out.println("check");
//    }
//}
//public class lec9{
//    public static void main(String[] args){
//        Monitor s1=new Monitor();
//        s1.displayName();
//        s1.displayClasss();
//        s1.checkDiscipline();
//    }
//}
//class shape{
//    void draw(){
//        System.out.println("yes");
//    }
//}
//class circle extends shape{
//    void Area(){
//        System.out.println("54");
//    }
//}
//public class lec9 {
//    public static void main(String[] args) {
//        circle c = new circle();
//        c.draw();
//        c.Area();
//    }
//}

//class Device{
//    void powerOn(){
//        System.out.println("haa");
//    }
//}
//class Laptop extends Device{
//    void boot(){
//        System.out.println("hp");
//    }
//}
//class GamingLaptop extends Laptop{
//    void startGame(){
//        System.out.println("victus");
//    }
//}
//public class lec9 {
//    public static void main(String[] args) {
//        GamingLaptop G=new GamingLaptop();
//        G.startGame();
//        G.boot();
//        G.powerOn();
//    }
//}
//class book{
//    void read(){
//        System.out.println("neetu");
//    }
//}
//class Novel extends book{
//    void storyLine(){
//       System.out.println("front");
//    }
//}
//public class lec9 {
//    public static void main(String[] args) {
//        Novel n = new Novel();
//        n.storyLine();
//        n.read();
//    }
//}

//overloading
//public class lec9 {
//    public static void main(String[] args) {
//
//        Main m=new Main();
//        m.add(3,5,6);
//    }
//}
//class Main {
//    void add(int a) {
//        System.out.println(a);
//    }
//
//    void add(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    void add(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }
//}

//over Riding
class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("roti");
    }
}
public class lec9 {
    public static void main(String[] args) {

        Animal A = new Animal();
        A.eat();
    }
}