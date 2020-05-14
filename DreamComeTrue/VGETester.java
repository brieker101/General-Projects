public class VGETester
{
    public static void main(String[] args){
           
        VideoGameEngine core1 = VideoGameEngine.getInstanceOfEngine();
        VideoGameEngine core2 = VideoGameEngine.getInstanceOfEngine();
        
        System.out.println(core1.checkEngine());
        System.out.println(core2.checkEngine());
        core1.stopEngine();
        System.out.println(core1.checkEngine());
        System.out.println(core2.checkEngine());
        
    }
}
