package ru.geekbrains.android3_1.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import io.reactivex.Observable;
import ru.geekbrains.android3_1.model.CounterModelRx;
import ru.geekbrains.android3_1.view.MainView;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {
    CounterModelRx counterModelRx;

    Observable<Integer> justObservable;

    public MainPresenter(CounterModelRx counterModelRx) {
        this.counterModelRx = counterModelRx;
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

    public void btnOneClick() {
        justObservable = Observable.just(0);
        justObservable.subscribe(counterModelRx.intObserver);
        getViewState().setButtonOneText(counterModelRx.getValue(0));
    }

    public void btnTwoClick() {
        justObservable = Observable.just(1);
        justObservable.subscribe(counterModelRx.intObserver);
        getViewState().setButtonTwoText(counterModelRx.getValue(1));
    }

    public void btnThreeClick() {
        justObservable = Observable.just(2);
        justObservable.subscribe(counterModelRx.intObserver);
        getViewState().setButtonThreeText(counterModelRx.getValue(2));
    }
}
