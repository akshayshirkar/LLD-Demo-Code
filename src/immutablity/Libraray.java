package immutablity;

import java.util.ArrayList;
import java.util.List;

public final class Libraray {
    private final List<book> books;

    public Libraray(List<book> books) {
        this.books = new ArrayList<>(books);
    }

    public List<book> getBooks() {
        return books;
    }

}
