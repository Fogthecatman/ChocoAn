package controller;

import view.View;

/**
 * Created by Jacob on 11/6/17.
 */
public interface Controller {
    View getView();
    void run();
}
