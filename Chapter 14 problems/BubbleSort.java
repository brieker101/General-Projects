
public class BubbleSort
{

    public int[] bubbleSort(int[] a){
        //What is bubble sort???
        int helper = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = 1;j<a.length;j++){
                if(a[j]<a[j-1]){
                    helper = a[j-1];
                    a[j-1] = a[j];
                    a[j] = helper;
                }
            }
        }
        return a;
    }
}
