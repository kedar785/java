package clas_DSA;

public class arr_1 {

    public static void main(String[] args) {
       int[][] arr = {{1,2,3},{45,46,22},{12,23,45}};
  int top=0;
  int bottom=arr.length-1;
  int left=0;
  int right=arr[0].length-1;
  while(top<=bottom && left<=right){
      for(int i=left;i<=right;i++){
          System.out.print(arr[top][i] + " ");
      }
      top++;
      for(int i=top;i<=bottom;i++){
          System.out.print(arr[i][right] + " ");
      }
      right--;
      for(int i=right;i<=left;i++){
          System.out.print(arr[i][bottom] + " ");
      }
      bottom--;
      for(int i=bottom;i<=top;i++){
          System.out.print(arr[left][i] + " ");
      }
      left++;
  }
    }
}
