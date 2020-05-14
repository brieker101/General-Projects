public class AddTitle extends Book implements BookWithTitle
{
   public Book addTitle(Object obj){
        ((Book)obj).setTitle(true);
        ((Book)obj).setCover(((Book)obj).hasCover());
        ((Book)obj).setWords(((Book)obj).hasWords());
        return ((Book)obj);
    }
}
