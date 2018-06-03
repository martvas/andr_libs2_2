package ru.geekbrains.android3_1.model;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class CounterModelRx {
    List<Integer> counters;
    public Observer<Integer> intObserver;

    public CounterModelRx() {
        counters = new ArrayList<>();
        counters.add(0);
        counters.add(0);
        counters.add(0);

        intObserver = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer index) {
                int value = counters.get(index) + 1;
                counters.set(index, value);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }

    public String getValue(Integer index) {
        return counters.get(index).toString();
    }
}
