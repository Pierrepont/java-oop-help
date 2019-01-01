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
            if(arr[i]<arr[i-1]){
                index=sort(arr,i);
                int temp=arr[i];
                for(int k=i; k>index; k--){
                    arr[k-1]=arr[k];
                }
                arr[index]=temp;
            }
            //System.out.println(index);
            
        }
        //System.out.println(arr[index]);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int sort(int[]arr,  int k){
        if(k==0){
            return k;
        }
        else if(arr[k-1]<arr[k]){
            return k;
        }
        else{
            return sort(arr,k-1);
        }
    }
}
