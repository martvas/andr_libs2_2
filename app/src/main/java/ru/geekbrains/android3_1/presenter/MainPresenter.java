package ru.geekbrains.android3_1.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import ru.geekbrains.android3_1.model.CounterModel;
import ru.geekbrains.android3_1.view.MainView;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {
    CounterModel model;

    public MainPresenter(CounterModel model) {
        this.model = model;
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }


    public void btnOneClick() {
        getViewState().setButtonOneText(model.calculate(0) + "");
    }

    public void btnTwoClick() {
        getViewState().setButtonTwoText(model.calculate(1) + "");
    }

    public void btnThreeClick() {
        getViewState().setButtonThreeText(model.calculate(2) + "");
    }
}
