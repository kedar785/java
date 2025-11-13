package lecture.com;
//class jeep{
//    public jeep(){
//        this(5);
//        System.out.println("hello");
//    }
//    public jeep(int a){
//        this(5,6);
//        System.out.println(a);
//    }
//        public jeep(int a,int b){
//            System.out.println("a "+a +" b "+b);
//    }
//}
//public class lec8 {
//    public static void main(String[] args){
//jeep s1=new jeep();
//      jeep s2=new jeep(5);
//        jeep s3=new jeep(5,6);
//    }
//}

//inheritance.
//class Animal{
//    void eat(){
//        System.out.println("pizza");
//    }
//
//}
//class Dog extends Animal{
//    void bark(){
//      System.out.println("hello");
//    }
//}
//class puppy extends Dog{
//    void sleep(){
//        System.out.println("koi kam nhi");
//    }
//}
//class Main{
//    public static void main(String[] args){
////       puppy s1=new puppy();
////       s1.eat();
//       puppy s1=new puppy();
//       s1.sleep();
//       s1.eat();
//       s1.bark();
//    }
//}

class parent{
    int x=10;
    parent(){
        System.out.println("parent constructor: x="+x);
    }
}
class child extends parent {
    int x = 20;

    child() {
        //this.x refrsh to child
        System.out.println("child this.x= " + this.x);
        //supper.x refrsh to parent's x
        System.out.println("child super.x= " + super.x);
    }

    void show() {
        int x = 30;
        System.out.println("local.x =" + x);
        System.out.println("this.x =" + this.x);
        System.out.println("super.x =" + super.x);
    }
}
public class lec8 {
    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}