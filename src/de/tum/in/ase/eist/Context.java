package de.tum.in.ase.eist;

import java.util.Iterator;
import java.util.List;

public class Context {


    private List<Chapter> book;
    private SearchStrategy searchAlgorithm;

    public boolean isChaptersSortedByName() {
        Iterator<Chapter> stringIterator = book.iterator();
        Chapter current = stringIterator.next();
        Chapter previous = stringIterator.next();
        while (stringIterator.hasNext()) {
            current = stringIterator.next();
            if (previous.getName().compareTo(current.getName()) > 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }

    public int search(String name) {
        return searchAlgorithm.performSearch(book, name);
    }

    public List<Chapter> getBook() {
        return book;
    }

    public void setBook(List<Chapter> book) {
        this.book = book;
    }

    public SearchStrategy getSearchAlgorithm() {
        return searchAlgorithm;
    }

    public void setSearchAlgorithm(SearchStrategy searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }

}
