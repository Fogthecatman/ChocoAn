package controller;

import model.User;
import view.OperatorView;
import view.View;

public class OperatorController extends ViewController {

    private View operatorView;

    public OperatorController(User login) {
        super(login);
        operatorView = new OperatorView(login);
    }

    public View getView() {
        return operatorView;
    }

    public void run() {

    }
}
