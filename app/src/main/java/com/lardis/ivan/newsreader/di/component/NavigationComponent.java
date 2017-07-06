package com.lardis.ivan.newsreader.di.component;

import com.lardis.ivan.newsreader.di.model.NavigationModule;
import com.lardis.ivan.newsreader.presentation.navigation.NavigationActivity;
import com.lardis.ivan.newsreader.presentation.news.LTechNewsFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by black-sony on 28.05.17.
 */
@Singleton
@Component(modules = {NavigationModule.class})
public interface NavigationComponent {
    void inject(NavigationActivity activity);
    void inject(LTechNewsFragment lTechNewsFragment);
}
