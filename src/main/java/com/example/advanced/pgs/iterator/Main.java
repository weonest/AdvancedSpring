package com.example.advanced.pgs.iterator;

import com.example.advanced.pgs.collection.MyCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("하이", "방가", "바바");
        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        MyIterator<String> iter2 =
                new MyCollection<>(Arrays.asList("하이", "방가", "바바"))
                        .iterator();

        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }

    }
}
