//Brian Hauck
public class WorldClock extends DefaultClock
{
    public WorldClock(int timeZone){
        System.out.println(getHours(timeZone) + ":" + getMinutes());
    }
}
