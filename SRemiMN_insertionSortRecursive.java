package inserionsortrecursive;

/**
 *
 * @author SMN Remi
 */
public class InserionSortRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]arr={2,91,52,4,3,1,34};
        int index=-1;
        for(int i=1; i<arr.length; i++){
            arr=check(arr,i);
            //int temp=arr[index];
            //arr[i]=temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] check(int[]arr, int i){
        if(arr[i-1]<arr[i]){
            return arr;
        }
        else{
            int temp = arr[i];
            arr[i] = arr[i-1];
            temp=arr[i-1];
            return check(arr,i-1);
        }
    }
}
