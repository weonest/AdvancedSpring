package com.example.advanced.pgs.collection;

import com.example.advanced.pgs.iterator.MyIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyCollection<T> {
    private List<T> list;

    public MyCollection(List<T> list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public MyCollection<T> filter(Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();
        foreach(d -> {
            if (predicate.test(d)) newList.add(d);
        });
        return new MyCollection<>(newList);
    }

    // <U> 이 메소드 내부에서만 이 U타입을 사용한다는 제너릭
    // Function 인터페이스
    // 한 개의 매개변수를 전달받아 특정 작업을 수행 후 새로운값을 반환
    public <U> MyCollection<U> map(Function<T, U> function) {
        List<U> newList = new ArrayList<>();
        foreach(d -> newList.add(function.apply(d)));
        return new MyCollection<>(newList);
    }

    public void foreach(Consumer<T> consumer) {

        for (int i = 0; i < list.size(); i++) {
            T data = list.get(i);
            consumer.accept(data);

        }
    }

    public MyIterator<T> iterator() {
        return new MyIterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public T next() {
                return list.get(index++);
            }
        };
    }
}
