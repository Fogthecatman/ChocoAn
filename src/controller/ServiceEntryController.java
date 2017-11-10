package controller;

import model.User;
import view.ServiceEntryView;
import view.View;

public class ServiceEntryController extends Controller {

    private View serviceEntry;

    public ServiceEntryController(User login) {
        super(login);
        serviceEntry = new ServiceEntryView();
    }

    public View getView() {
        return serviceEntry;
    }

    public void run() {

    }
}
