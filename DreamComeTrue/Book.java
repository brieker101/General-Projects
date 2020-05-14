public class Book
{   
    private boolean hasTitle = false;
    private boolean hasCover = false;
    private boolean hasWords = false;

    public Book(){
       /* hasTitle = false;
        hasCover = false;
        hasWords = false;*/
    }

    public boolean hasTitle(){
        return hasTitle;
    }
    
    public void setTitle(boolean u){
        hasTitle = u;
    }

    public boolean hasCover(){
        return hasCover;
    }
    
    public void setCover(boolean u){
        hasCover = u;
    }

    public boolean hasWords(){
        return hasWords;
    }
    
    public void setWords(boolean u){
        hasWords = u;
    }
}
