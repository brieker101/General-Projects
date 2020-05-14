
public class printSort
{
    public static void main(String[] args){
        
        int[] random100 = new int[100];
        
        for(int i = 0;i<100;i++){
            random100[i] = (int)Math.round(Math.random()*99);
        }
        
        for(int i = 0;i<100;i++){
            System.out.print(random100[i] + " ");
        }
        System.out.println();
        
        random100 = selectionSort.selectionSort(random100);
        
        for(int i = 0;i<100;i++){
            System.out.print(random100[i] + " ");
        }
        System.out.println();
    
    }
}
