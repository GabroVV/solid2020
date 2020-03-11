package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class Printer {

    private Book book;

    /**
     * Prints the current page.
     */
    public void printCurrentPage() {
        System.out.println(book.getCurrentPageContents());
    }

    /**
     * Prints all pages
     * @return
     */
    public String printAllPages() {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return allPages;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
