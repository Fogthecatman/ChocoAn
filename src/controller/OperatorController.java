package controller;

import view.OperatorView;
import view.View;

public class OperatorController implements Controller {

    private View operatorView;

    public OperatorController() {
        operatorView = new OperatorView();
    }

    public View getView() {
        return operatorView;
    }

    public void run() {

    }
}
