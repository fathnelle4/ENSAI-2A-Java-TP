package fr.ensai.library;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;


public class Library {
    // Attributes
    private String name; // le nom de la librairie
    private List<Book> books; // une liste de livres

    // Constructor
    public Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
        
    }

    // Method
    public void addBook(Book book) {
        book.addBook(books)
    }
    public void displayBooks(){
        if (books.size()!=0){
            for (Book books : books) {
                System.out.println(books);
            }
        } else{
            System.out.println();
        }
        
    }

    public void loadBooksFromCSV(String filePath) {

        URL url = getClass().getClassLoader().getResource(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(url.getFile()))) {
            Map<String, Author> authors = new HashMap<>();
            String line;
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 5) {
                    String isbn = data[0].trim();
                    String title = data[1].trim();
                    String authorName = data[2].trim();
                    int year = Integer.parseInt(data[3].trim());
                    int pageCount = Integer.parseInt(data[4].trim());

                    // Check if author already exists in the map
                    Author author = authors.get(authorName);
                    if (author == null) {
                        author = new Author(authorName);
                        authors.put(authorName, author);
                        System.out.println(author.toString());
                    }
                    Book book = new Book(isbn, title, author, year, pageCount);

                    this.addIem(book);
                }
            }
        } catch (

        IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
    public void getBooksByAuthor(Author author) -> ArrayList<Book>{
        //Attributes
        List<book> = Object foo = new Object();
        for
        
    }
}
