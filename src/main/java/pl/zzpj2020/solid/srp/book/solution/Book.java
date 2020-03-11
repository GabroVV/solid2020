package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {

    private Map<Integer, String> pages = new HashMap<>();
    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;
    private int currentPage = 0;


    public String getTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "John Doe";
    }

    public String getCurrentPageContents() {
        return getPages().get(currentPage);
    }

    /**
     * Gives the library name
     *
     * @return
     */
    public String libraryRoomName() {
        return libraryRoomName;
    }

    /**
     * Gives the row location of the book.
     * @return
     */
    public String getLocationRowLocator() {
        return rowLocator;
    }

    /**
     * Gives the number from shelf.
     * @return
     */
    public int getIndexOnShelf() {
        return indexOnShelf;
    }


    public void turnPage() {
        currentPage ++;
    }

    public Map<Integer, String> getPages() {
        return pages;
    }
}
