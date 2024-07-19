package com.example.springannotations.cope;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean {

    public SingletonBean() {
        System.out.println("SingletonBean Constructor");
    }
}
