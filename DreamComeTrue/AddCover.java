public class AddCover extends Book implements BookWithCover
{

    public Book addCover(Object obj){
        
        ((Book)obj).setWords(((Book)obj).hasWords());
        ((Book)obj).setTitle(((Book)obj).hasTitle());
        ((Book)obj).setCover(true);
        return ((Book)obj);
    }

}
