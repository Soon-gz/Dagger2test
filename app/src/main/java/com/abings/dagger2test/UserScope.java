package com.abings.dagger2test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by HaomingXu on 2016/7/6.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {
}
