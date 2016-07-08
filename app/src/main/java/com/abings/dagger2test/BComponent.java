package com.abings.dagger2test;

import dagger.Subcomponent;

/**
 * Created by HaomingXu on 2016/7/6.
 */
@Subcomponent(modules = BMoudel.class)
public interface BComponent {
    void inject(BActivity bActivity);
}
