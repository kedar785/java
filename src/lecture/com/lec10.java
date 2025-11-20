package lecture.com;

//abstraction
//abstract class Animal{
//    abstract void eat();
//}
//class Cat extends Animal{
//    void eat(){
//        System.out.println("kitkat");
//    }
//}
//
//public class lec10 {
//    public static void main(String[] args){
//        Cat s1=new Cat();
//        s1.eat();
//    }
//
//}

//assignment
abstract class Shape{
    abstract void area();
}
  class circle extends Shape {
      void area() {
          System.out.println("3");
      }

      class Rectangle extends Shape {
          void area() {
              System.out.println("4");
          }
      }
  }

public class lec10 {
    public static void main(String[] args) {
        circle s1=new circle();
        s1.area();
    }
}