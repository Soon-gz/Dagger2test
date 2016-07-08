package com.abings.dagger2test;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HaomingXu on 2016/7/6.
 */
@Module
public class AppMoudel {
    private Application application;
    public AppMoudel(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApp(){
        return application;
    }
}
