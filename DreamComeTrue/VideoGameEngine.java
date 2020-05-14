public class VideoGameEngine
{
    private static VideoGameEngine core;
    private boolean isRunning = false;

    private VideoGameEngine()
    {
        isRunning = true;
    }

    public boolean checkEngine(){

        return isRunning;
    }

    public void stopEngine(){
        this.isRunning = false;
    }

    public static VideoGameEngine getInstanceOfEngine(){
        if(core == null){
            core = new VideoGameEngine();
        }

        return core;
    }

}
