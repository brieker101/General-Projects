//Brian Hauck
public class DefaultClock{
    private String time;
    private String hour;
    private String minute;
    private int placeholder;

    public DefaultClock(){  

    }
    
    public void getTime(){
        System.out.println(getHours() + ":" + getMinutes());   
    }
    public void getTime(int timeZone){
        System.out.println(getHours(timeZone) + ":" + getMinutes());
    
    }

    public String getMinutes(){

        time = (String)java.time.LocalTime.now().toString(); 
        minute = time.substring(3,5);

        return minute;
    }

    public String getHours(){
        time = (String)java.time.LocalTime.now().toString(); 
        hour = time.substring(0,2);

        return hour;
    }

    public String getHours(int timeZone){
        time = java.time.LocalTime.now().toString(); 
        hour = time.substring(0,2);
        placeholder = Integer.parseInt(hour);
        placeholder = (placeholder + timeZone);
        if(placeholder<0){
            placeholder = 24 + placeholder;
        }
        hour = Integer.toString(placeholder);

        return hour;
    }

}
