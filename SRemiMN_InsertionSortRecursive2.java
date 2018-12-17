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
        int[]arr={22,91,5,4,3,1,34};
        int index=-1;
        for(int i=1; i<arr.length; i++){
            index=smallest(arr,i,i);
            System.out.println(index);
            for(int k=index; k<=0; k--){
                arr[index-1]=arr[index];
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int smallest(int[]arr, int index, int k){
        if(index==arr.length-1){
            return arr[index]<arr[k]?index:k;
        }
        if(arr[index]<arr[k]){
            return smallest(arr,index+1,index);
        }
        else{
            return smallest(arr,index+1,k);
        }
    }
}
