package de.tum.in.ase.eist;


import java.util.List;

public class BinarySearch implements SearchStrategy {

    public int performSearch(List<Chapter> book, String chapterName) {

        int leftEdge = 0;
        int rightEdge = book.size() - 1;
        while (leftEdge <= rightEdge) {
            int middleIndex = (leftEdge + rightEdge) / 2;
            if (book.get(middleIndex).getName().equals(chapterName)) {
                return book.get(middleIndex).getPageNumber();
            } else if (book.get(middleIndex).getName().compareTo(chapterName) < 0) {
                leftEdge = middleIndex + 1;
            } else {
                rightEdge = middleIndex - 1;
            }

            //if (book.get(middleIndex).getName().compareTo(chapterName) < 0) {
            // leftEdge = middleIndex + 1;
            //} else if (book.get(middleIndex).getName().compareTo(chapterName) > 0) {
            //  rightEdge = middleIndex - 1;
            //} else {
            //  return middleIndex;
            //}
        }
        return -1;
    }
}
