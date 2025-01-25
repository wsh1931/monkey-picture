package com.wusihao.monkeypicturebackend.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 针对方法生效
@Target(ElementType.METHOD)
// 在项目运行时生效
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {

    /**
     * 必须有某个角色: mustRole 输入参数, 默认为空
     */
    String mustRole() default "";
}
