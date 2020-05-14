
public class SelectionSort
{
    public int[] sort(int[] a){
        //Pretty Simple, I used this a lot of other places too
        int helper = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                if(a[j]<= a[i]){
                    helper = a[i];
                    a[i] = a[j];
                    a[j] = helper;
                }
            }
        }

        return a;
    }
}
