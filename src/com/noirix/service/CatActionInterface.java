package com.noirix.service;

public interface CatActionInterface {
    String CAT_ACTION = "Meow";

    String CAT_ACTION_RUN = "RUN";

    public static final String CAT_ACTION_SPECIAL = "Meow!!";

    public abstract void meow();

    public abstract void run();

    public abstract void jump();

    public abstract void eat();
}
