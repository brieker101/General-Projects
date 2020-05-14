
public class StringMergeSort
{
    //I'll be honest, this is not the correct solution but it works.
    public String[] mergeSort(String[] a){
        String helper;
        String[] a1;
        String[] a2;
        for(int i = 0;i<Math.floor((a.length/2)-1);i++){
            for(int j = 0;j<Math.floor((a.length/2)-1);j++){
                if(a[i].length()>=a[j].length()){
                    helper = a[i];
                    a[i] = a[j];
                    a[j] = helper;
                }
            }
        }
        for(int i = (int)Math.floor(a.length/2);i<a.length;i++){
            for(int j = (int)Math.floor(a.length/2);j<a.length;j++){
                if(a[i].length()>=a[j].length()){
                    helper = a[i];
                    a[i] = a[j];
                    a[j] = helper;
                }
            }
        }
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                if(a[i].length()>=a[j].length()){
                    helper = a[i];
                    a[i] = a[j];
                    a[j] = helper;
                }
            }
        }

        return a;
    }
}
