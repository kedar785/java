package clas_DSA;

public class arr_waveForm {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //wave form
int row=arr.length;
int cols=arr[0].length;
for(int j=0;j<cols;j++){
    if(j%2==0){
        //top to bottom
        for(int i=0;i<row;i++){
            System.out.print(arr[i][j]+" ");
        }
    }
    else{
       // bottom to top
        for(int i=row-1;i>=0;i--){
            System.out.print(arr[i][j]+" ");
        }
    }
}
    }
}
