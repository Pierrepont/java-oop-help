package mergesortrecursive;

/**
 *
 * @author emilylo
 */
public class MergeSortRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {9,7,8,3,2,1};
        sort(array, 0, array.length-1);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }     
    }
    public static void merge(int[] array, int left, int mid, int right){
        int[] helper = new int[array.length];
        for (int i = left; i <= right; i++){
            helper[i] = array[i];
        }
        int helperleft = left;
        int helperright = mid+1;
        int current = left; 
        while(helperleft <= mid && helperright <= right){
            if(helper[helperleft] <= helper[helperright]){
                array[current] = helper[helperleft];
                helperleft++;
            }
            else{
                array[current] = helper[helperright];
                helperright++;
            }
            current++;
        }
        int remaining = mid-helperleft;
        for(int i = 0; i <= remaining; i++){
            array[current+i] = helper[helperleft+i];
        }
    }
    
    public static void sort(int[] array, int left, int right){
        if(left < right){
            int mid = (left+right)/2;
            sort(array,left,mid);
            sort(array,mid+1,right);
            merge(array,left,mid,right); 
        }
    }
}
