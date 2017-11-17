package controller;

import model.User;

public abstract class ViewController {

    public abstract void run();

    protected User login;

    public ViewController(User login) {
        this.login = login;
    }
}
