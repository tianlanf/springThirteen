package com.thoughtworks.yafei;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Email {
    private String body;

    @PostConstruct
    public void onInit() {
        System.out.println("The onInit method is called after construct of the bean.");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("The onDestroy method is called before the bean is destroyed.");
    }

    public void setBody(String body) {
        this.body = body;
    }
}
