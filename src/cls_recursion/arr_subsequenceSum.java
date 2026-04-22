package cls_recursion;

public class arr_subsequenceSum {
      static int Arrsum(int [] arr ,int i,int sum){
          if(i==arr.length){
              return sum;
          }
          int x=Arrsum(arr,i+1, sum+arr[i]);
          int y=Arrsum(arr,i+1,sum);
          return x+y;
      }
    public static void main(String[] args) {
int [] arr={1,2,3};
int sum=0;
int i=0;
        System.out.println(Arrsum(arr,i,sum));
    }
}
