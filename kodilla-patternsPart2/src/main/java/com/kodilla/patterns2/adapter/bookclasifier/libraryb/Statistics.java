package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Statistics implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, NewBook> books) {
        if (books.size() == 0) return 0;

        return (int)books.entrySet().stream().mapToInt(x -> x.getValue().getYearOfPublication()).average().orElse(0);


//        int sum = 0;
//        for (Map.Entry<BookSignature, NewBook> entry : books.entrySet()) {
//            sum += entry.getValue().getYearOfPublication();
//        }
//        return sum / books.size();
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, NewBook> books) {
        if (books.size() == 0) return 0;
        List<Integer> bookList = books.entrySet().stream().
                map(x -> x.getValue().getYearOfPublication()).sorted().collect(Collectors.toList());
        return findMedian(bookList);
    }

    private int findMedian(List<Integer> bookList) {
        int size = bookList.size();
        return size % 2 != 0 ? bookList.get(size / 2) : getAverage(bookList, size);
    }

    private int getAverage(List<Integer> bookList, int size) {
        return (bookList.get(size / 2)+bookList.get(size / 2 - 1)) /2;
    }
}

//        int[] years = new int[books.size()];
//        int n = 0;
//        for (Map.Entry<BookSignature, NewBook> entry : books.entrySet()) {
//            years[n] = entry.getValue().getYearOfPublication();
//            n++;
//        }
//        Arrays.sort(years);
//        if (years.length % 2 == 0) {
//            return years[(int)(years.length / 2 + 0.5)];
//        } else {
//            return years[years.length / 2];
//        }
