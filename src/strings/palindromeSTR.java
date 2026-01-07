package strings;

import javax.swing.*;

public class palindromeSTR {
    public static void main(String[] args) {
        String sc= "malayalam";
      int i=0, j=sc.length()-1;
      boolean isPalindrome=true;
      while(i<=j){
          if(sc.charAt(i)!=sc.charAt(j)){
              isPalindrome=false;
          }
              i++;
              j--;


      }
      if( isPalindrome){
          System.out.println("palindrome hai");
      }
      else System.out.println("palindrome nhi hai");
    }
}