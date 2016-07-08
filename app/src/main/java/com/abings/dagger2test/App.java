package com.abings.dagger2test;

import android.app.Application;
import android.content.Context;

/**
 * Created by HaomingXu on 2016/7/6.
 */
public class App extends Application {

   private AppComponent appComponent;
   private UserComponent userComponent;

    public static App get(Context context){
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appMoudel(new AppMoudel(this)).build();
    }

    public UserComponent createUserComponent(User user){
        userComponent = appComponent.plus(new UserMoudel(user));
        return userComponent;
    }

    public UserComponent getUserComponent(){
        return userComponent;
    }

    public void releaseUserComponent(){
        userComponent = null;
    }
}
