public class Tester
{
   public static void main(String[] args){
       BHArrayList list = new BHArrayList<>();    
       
       list.print();
       
       System.out.println(list.size());
       System.out.println();
       
       list.add("1");
       list.add("2");
       list.add("3");
       list.put("4", 3);
       list.print();
       
       System.out.println();
       System.out.println(list.size());
       
       
       
    
    }
}
