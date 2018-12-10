package inserionsortrecursive;

/**
 *
 * @author SMN Remi
 */
              //spelling - riley
public class InserionSortRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]arr={2,91,52,4,3,1,34};
        int index=-1;
        for(int i=1; i<arr.length; i++){
          arr=check(arr,i);
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
  //returns array with one element sorted  
  public static int[] check(int[]arr, int i){
      //checks to se if the element needs to be moved again  
      if(arr[i-1]<arr[i]){
            return arr;
        }
      //moves element and runs method again if it can be moved
       else{
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1]=temp;
            if(i>0){
              return check(arr,i-1);
            }  
            else{
              return arr;
            }
            
        }
    }
}
