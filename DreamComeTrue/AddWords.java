public class AddWords extends Book implements BookWithWords
{
  public Book addWords(Object obj){
        
        ((Book)obj).setTitle(((Book)obj).hasTitle());
        ((Book)obj).setCover(((Book)obj).hasCover());
        ((Book)obj).setWords(true);
        return ((Book)obj);
    }
}
