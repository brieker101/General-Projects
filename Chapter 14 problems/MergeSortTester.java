
public class MergeSortTester
{
    public static void main(String[] args){
    StringMergeSort sms = new StringMergeSort();
    String[] a = new String[]{"dfsafr", "fr4q", "freqa", "reg"};
    for(int i = 0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }
    sms.mergeSort(a);
    for(int i = 0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }
    
    
    }
}
