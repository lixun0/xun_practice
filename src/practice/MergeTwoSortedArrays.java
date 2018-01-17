package practice;

public class MergeTwoSortedArrays {
    public static void merge2SortedArray(int[] a , int[] b , int[] c){
        int i=0;
        int j=0;
        int k=0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        while(i < a.length){
            c[k++] = a[i++];
        }
        while(j < b.length){
            c[k++] = b[j++];
        }
    }
}

