package Array;

public class mergeTowSortArr {
    public static void main(String[] args) {
        int [] a={2,3,5,11,67};
        int [] b={4,6,10,14,20,22,90};
        int [] c=new int [a.length+b.length];
        for(int ele :c) System.out.print(ele +" ");
        System.out.println();
        merge(c,a,b);
        for(int ele :c) System.out.print(ele +" ");
        System.out.println();

    }

    private static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]){
                c[k] = a[i];
            i++;}
            else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }

    }
}
