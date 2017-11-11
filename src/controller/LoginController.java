package controller;

import model.User;
import view.LoginView;
import view.View;

/**
 * Created by Jacob on 11/6/17.
 */
public class LoginController extends ViewController {

    private View loginView;

    public LoginController(User login) {
        super(login);
        loginView = new LoginView();
    }

    public View getView() {
        return loginView;
    }


    public void run() {

    }

}
