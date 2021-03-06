package com.lardis.ivan.newsreader.presentation;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import ru.terrakok.cicerone.Router;

/**
 * Created by black-sony on 25.05.17.
 */
@InjectViewState
public class NavigationPresenter extends MvpPresenter<NavigationsView> {

    public NavigationPresenter(final Router router) {
        this.router = router;
    }

    private Router router;

    public void onExit() {
        if (router != null) {
            router.exit();
        }
    }

    public void onBack() {
        if (router != null) {
            router.backTo(null);
        }
    }
    public void onNewRootCommandClick(String nameScreen) {
        if (router != null) {
            router.newRootScreen(nameScreen);
        }
    }
}
