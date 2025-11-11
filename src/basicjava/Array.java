package basicjava;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        //sum of number
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter size of array: ");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        int sum=0;
//        System.out.println("Enter element : ");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//
//        sum+=arr[i];
//        }
//        System.out.println("sum= "+sum);

        //Given number is negative positive and zero

//        int num=5;
//        if(num>0){
//            System.out.println("positive");
//        }
//        else if(num<0){
//            System.out.println("negative");
//        }
//        else{
//            System.out.println("zero");
//        }
        //print largest number out of two number

//        int num1=3,num2=8;
//        if(num1>num2){
//            System.out.println(num1);
//        }
//        else{
//            System.out.println(num2);
//        }

        //check character is vowel or consonant using switch case

//        char c='e';
//        switch(c){
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println(c +" is vowel");
//                break;
//            default:
//                System.out.println(c +" is consonant");
//        }

        //print sum of 1 to 10

//        int sum=0;
//        for(int i=0;i<=100;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);

//5 ka table print

//        int num=5;
//        for(int i=1;i<=10;i++){
//            System.out.println(i*num);
//        }

       // num is divisible  by 5 and 11

//        int num=50;
//        if(num%5==0 && num%11==0){
//            System.out.println("num is 5 and 11 to divisible");
//        }else{
//            System.out.println("numis not divisible is 5 and 11");
//        }

        //change float to int

//        float f=3.08f;
//        int i;
//        i=(int)Math.floor(f);
//        System.out.println(i);

//        int num=78;
//        if(num%3==0){
//            System.out.println("num is multiple of 3");
//
//        }else{
//            System.out .println("not multiple is 3");
//        }
         //ASCII value of a character
//        char c='t';
//        int n;
//        n=c;
//        System.out.println(n);

        //factorial is a number

//        int n =10;
//        int fact=1;
//        for(int i=1;i<=3;i++){
//            fact=fact*i;
//        }
//        System.out.printf("The factorial is %d",fact);

//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int rev=0;
//        while(num>0){
//           rev= rev*10+num%10;
//            num=num/10;
//        }
//        System.out.println(rev);

        //chack the num is prime or not, using if else

//        int num=8;
//        int count=0;
//        for(int i=1;i<=num;i++){
//            if(num%i==0){
//                count++;
//            }
//        }if(count==2) {
//            System.out.println("prime");
//        }else{
//        System.out.println("not prime");}

        //switch cse me simple calculator "+,_,*,/"

        int operator,n1,n2;
        System.out.println("1 - Add\n2 - subtract \n3 - multiply\n4 - divide");
        System.out.print("Choose Operator: ");
        Scanner sc=new Scanner(System.in);
        operator=sc.nextInt();
        System.out.print("Enter first number: ");
        n1=sc.nextInt();
        System.out.print("Enter second number");
        n2=sc.nextInt();
        int result=0;
        switch(operator){
            case 1:
                result=n1+n2;
                break;
            case 2:
                result=n1-n2;
                break;
            case 3:
                result=n1*n2;
                break;
            case 4:
                result=n1/n2;
                break;
            default:
                System.out.println("Enterd operator is not valid");
        }
        System.out.println("Result is: "+result);
    }
}
