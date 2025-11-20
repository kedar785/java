package lecture.com;

//interface me abstract hoga hi chahe abstract lagao ya nhi
// constracter usi ka banega jiske Aage class key word laga ho
//interface A{
//    abstract void login();
//}
//class B implements A {
//    public void login(){
//        System.out.println("hello");
//
//}
//
//
//}
//public class lec11 {
//    public static void main(String[] args){
//B s1=new B();
//s1.login();
//    }
//}

//interface A{
//    abstract void login();
//    default void read(){
//
//    }
//}
//class B implements A{
//    public void login (){
//        System.out.println("hiiii");
//    }
//}
//public class lec11 {
//   public static void main(String[] args){
//
//         B s1=new B();
//         s1.login();
//       }
//   }

//interface A{
//    abstract void display();
//}
//interface B{
//    abstract void display();
//}
//class Demo implements A,B{
//    @Override
//    public void display() {
//        System.out.println("Jaisalmer");
//    }
//}
//public class lec11 {
//    public static void main(String[] args) {
//        Demo s1=new Demo();
//        s1.display();
//
//    }
//}

//interface Walkable{
//    abstract void walk();
//}
//interface Runnable{
//    abstract void run();
//}
//class Human implements Walkable, Runnable{
//    public void walk(){
//        System.out.println("human is walking");
//
//    }
//    public void run(){
//        System.out.println("human is running .");
//
//    }
//}
//public class lec11 {
//    public static void main(String[] args) {
//        Human s1=new Human();
//        s1.walk();
//        s1.run();
//
//    }
//
//    }

interface Animal{
    abstract void makeSound();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println(" bark");
    }
}
public class lec11 {
   public static void main(String[] args) {
       Dog d=new Dog();
       d.makeSound();
   }
   }



