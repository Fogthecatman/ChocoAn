package controller;

import model.User;
import view.OperatorView;
import view.View;

public class OperatorController extends Controller {

    private View operatorView;

    public OperatorController(User login) {
        super(login);
        operatorView = new OperatorView();
    }

    public View getView() {
        return operatorView;
    }

    public void run() {

    }
}
