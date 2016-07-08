package com.abings.dagger2test;

import dagger.Subcomponent;

/**
 * Created by HaomingXu on 2016/7/6.
 */
@UserScope
@Subcomponent(modules = UserMoudel.class)
public interface UserComponent {
    AComponent plus(AMoudel aMoudel);
    BComponent plus(BMoudel bMoudel);
    CComponent plus(CMoudel cMoudel);
}
