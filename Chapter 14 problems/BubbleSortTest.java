
public class BubbleSortTest
{

    public static void main(String[] args){

        BubbleSort b = new BubbleSort();
        int[] a = new int[]{4, 2, 6, 7, 32, 9, 0, 3, 4};
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        b.bubbleSort(a);

        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }

    }

}
