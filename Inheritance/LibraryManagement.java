abstract class Book{
    String title;
    int publicationYear;

    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    public abstract void displayInfo();
}

class Author extends Book{
    String name;
    String bio;

    Author(String title, int publicationYear,String name,String bio){
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }
    @Override
    public void displayInfo(){
        System.out.println("Title: "+ title);
        System.out.println("publication year: "+ publicationYear);
        System.out.println("Author: "+name);
        System.out.println("bio: "+bio);
    }
    
}
public class LibraryManagement {
    public static void main(String[] args) {
        Author author=new Author("Gaban", 1857, "Premchand", "He is very great wriiter");
        author.displayInfo();
    }
}
