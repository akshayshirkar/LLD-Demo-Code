package JavaGeneric;

import java.util.ArrayList;
import java.util.List;

public class BookStore<T> {
    List<T> books = new ArrayList<>();

    public void addBook(T newBook){
        books.add(newBook);
    }

    public List<T> printAllBooks(){
        List<T> allBooks = new ArrayList<>();
        for(T ele : books){
            allBooks.add(ele);
        }
        return allBooks;
    }

    public void findBookByTitle(T title){
        for(T ele : books){
            if(title.equals(ele)){
                System.out.println("Book is present");
            }
        }
    }

    public void removeBookByTitle(T title){
        books.removeIf(book -> title.equals(book));
    }
}
