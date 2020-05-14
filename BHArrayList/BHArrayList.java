public class BHArrayList<E>
{
    private E[] dataList;
    private int size;
    
    public BHArrayList(){
        dataList = (E[]) new Object[10];
        size = 0;
    }

    public void add(Object obj){
        int index = 0;
        for(int i =0;i<dataList.length;i++){
            if(dataList[i]==null){
                index = i;
            }
            if(i==dataList.length){
                dataList = doubleSize(dataList);
                add(obj);
            }
        }
        dataList[index] = (E) obj;
    }

    public void remove(int i) throws IndexOutOfBoundsException{
        dataList[i] = null;
        for(int j = 0;i<dataList.length-1;i++){
            dataList[j] = dataList[j+1];
            if(j==dataList.length-1){
                dataList[j+1] = null;
            }
        }
        size--;
    }

    public void clear(){
        for(int i = 0;i<dataList.length;i++){
            dataList[i] = null;
        }
    }

    public void put( Object obj, int i) throws IndexOutOfBoundsException{
        if(dataList[i] ==null){
            size++;
        }
        dataList[i] = (E) obj;
    }

    public int size(){
        //counting a size variable is more efficient
       /* int counter = 0;
            for(int i = 0;i<dataList.length;i++){
                if(dataList[i]!=null){
                    counter++;
                }
            }*/
        return size;
    }

    public void print(){
        for(int i = 0;i<dataList.length;i++){
            if(dataList[i]!=null){
                System.out.println(dataList[i]);
            }
        }
    }
    
    private E[] doubleSize(E[] list){
        E[] newList = (E[]) new Object[list.length+5];
        for(int i = 0;i<list.length;i++){
            newList[i] = list[i];
        }
        return newList;
    }
}
