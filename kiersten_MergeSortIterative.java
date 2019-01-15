import java.util.Scanner;
public class MergeSortIterative {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("How long is the list?");
        int length=input.nextInt();
        int list[]=new int[length];
        System.out.println("Enter the numbers in the list: ");
        for(int i=0;i<list.length;i++){           
            list[i]=input.nextInt();
        }
        mergeArray(list, list.length/2);
        //merge(0, list.length/2, list.length, list);
        System.out.println("This is not the sorted array:");
        for(int i=0;i<list.length;i++){ 
            System.out.println(list[i]);
        }
    }
    public static void mergeArray(int [] list, int n){
        int currSize=1;
        int leftStart;
        while(currSize<n){
            leftStart=0; 
            for(; leftStart<n-1; leftStart+=(2*currSize)){
                int rightEnd= leftStart+ (2*currSize);
                if(rightEnd>n){
                    rightEnd= n-1;
                }
                int mid= leftStart + currSize-1;
                merge(leftStart, mid, rightEnd, list);
            }
            currSize*=2;
        }                                                 
    }
    public static void merge(int start1, int start2, int end, int [] list){
        int[]leftHalf= new int[start2];
        for(int i= start1; i<leftHalf.length;i++){
            leftHalf[i]= list[i];
        }
        int [] rightHalf= new int[end-start2];
        for(int i=0; i<rightHalf.length;i++){
            rightHalf[i]= list[i+start2];
        }
        int i=0;
        start2= 0;
        while(start2<rightHalf.length&&start1<leftHalf.length){
            if(leftHalf[start1]<rightHalf[start2]){
                list[i]= leftHalf[start1];
                start1++;
            }else{
                list[i]= rightHalf[start2];
                start2++;
            }
            i++;
        }                        
        while(start2< rightHalf.length){
            list[i]= rightHalf[start2];
            i++;
            start2++;
        }
    }
}
