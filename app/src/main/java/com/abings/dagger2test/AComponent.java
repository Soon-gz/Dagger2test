package com.abings.dagger2test;

import dagger.Subcomponent;

/**
 * Created by HaomingXu on 2016/7/6.
 */
@Subcomponent(modules = AMoudel.class)
public interface AComponent {
    void inject(AActivity aActivity);
}
