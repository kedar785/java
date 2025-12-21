package Array;

public class printnegative {
    public static void main(String[] args) {
      int[] arr  ={2,-5,-4,3,4,-5};
      int sum=0;
      int max=0;
      for(int i=0;i<arr.length;i++){
         if(max<arr[i]){
             max=arr[i];

         }
      // sum +=arr[i];

          //negative value print karna hai
        // if(arr[i]<0) {
         //    System.out.print(arr[i]);
        //  }

      }
        System.out.println(max);
    }
}
