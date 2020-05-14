
public class SortTester
{
    public static void main(String[] args){
        SelectionSort s1 = new SelectionSort();
        int[] a = new int[]{5, 3, 2, 1, 4};
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        s1.sort(a);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }

    }
}
