package controller;

import view.LoginView;
import view.View;

/**
 * Created by Jacob on 11/6/17.
 */
public class LoginController implements Controller {

    private View loginView;

    public LoginController() {
        loginView = new LoginView();
    }


    public View getView() {
        return loginView;
    }

    public void run() {

    }

}
