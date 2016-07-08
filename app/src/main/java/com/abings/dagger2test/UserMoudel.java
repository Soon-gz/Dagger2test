package com.abings.dagger2test;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HaomingXu on 2016/7/6.
 */
@Module
public class UserMoudel {
    private User user;

    public UserMoudel(User user){
        this.user = user;
    }

    @Provides
    @UserScope
    User provideUser(){
        return user;
    }
}
