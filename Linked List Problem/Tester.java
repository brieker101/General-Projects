public class Tester
{
    public static void main(String[] args){
        BHLinkedList list = new BHLinkedList();

        list.addNode("Tom");
        list.addNode("Dick");
        list.addNode("Harry");
        list.addNode("Tom");
        list.addNode("Dick");
        list.addNode("Harry");
        list.addNode("Tom");
        list.addNode("Dick");
        list.addNode(5, "Harry");
        
        list.addInFront("Front");
        
        list.printArray();
        System.out.println();
        
        list.remove(1);
        
        list.printArray();
    
    }
}
