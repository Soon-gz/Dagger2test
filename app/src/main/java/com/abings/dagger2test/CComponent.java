package com.abings.dagger2test;

import dagger.Subcomponent;

/**
 * Created by HaomingXu on 2016/7/6.
 */
@Subcomponent(modules = CMoudel.class)
public interface CComponent {
    void inject(CActivity cActivity);
}
