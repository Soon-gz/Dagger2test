package com.abings.dagger2test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by HaomingXu on 2016/7/6.
 */
@Singleton
@Component(modules = AppMoudel.class)
public interface AppComponent {
    UserComponent plus(UserMoudel userMoudel);
}
