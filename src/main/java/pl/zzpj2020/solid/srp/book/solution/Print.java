package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class Print {

    private Book book = new Book();

    private int currentPage = 0;

    public String getCurrentPageContents() {
        return book.getPages().get(currentPage);
    }

    public void turnPage() {
        currentPage ++;
    }


    public void printCurrentPage() {
        System.out.println(book.getPages().get(currentPage));
    }

    public String printAllPages() {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
