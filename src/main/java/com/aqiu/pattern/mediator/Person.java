package com.aqiu.pattern.mediator;

public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
