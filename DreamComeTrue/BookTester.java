public class BookTester
{
    public static void main(String[] args){
        BookWithWords words1 = new AddWords();
        BookWithTitle title1 = new AddTitle();
        BookWithCover cover1 = new AddCover();
    
        Book book1 = new Book();
        System.out.println(book1.hasTitle() + " " + book1.hasCover() + " " + book1.hasWords());
        
        book1 = words1.addWords(book1);
        
        System.out.println(book1.hasTitle() + " " + book1.hasCover() + " " + book1.hasWords());
        
        book1 = cover1.addCover(book1);
        
        System.out.println(book1.hasTitle() + " " + book1.hasCover() + " " + book1.hasWords());
        
        book1 = title1.addTitle(book1);
        
        System.out.println(book1.hasTitle() + " " + book1.hasCover() + " " + book1.hasWords());
    
    }
}
