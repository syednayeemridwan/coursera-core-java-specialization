package com.learnquest.generics;

public class GenericBox<T> implements GenericInterface<T> {
    private T t;

    @Override
    public T getT() {
        return t;
    }

    @Override
    public void setT(T t) {
        this.t = t;
    }

}
