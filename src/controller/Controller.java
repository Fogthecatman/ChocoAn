package controller;

import model.User;
import view.View;

/**
 * Created by Jacob on 11/6/17.
 */
public abstract class Controller {

    public abstract View getView();
    public abstract void run();

    protected User login;

    public Controller(User login) {
        this.login = login;
    }
}
