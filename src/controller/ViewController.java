package controller;

import model.User;
import view.View;

public abstract class ViewController {

    public abstract View getView();
    public abstract void run();

    protected User login;

    public ViewController(User login) {
        this.login = login;
    }
}