package com.zingfeng.wanandroid.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author zingfeng
 * @date On 2021-12-26
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
