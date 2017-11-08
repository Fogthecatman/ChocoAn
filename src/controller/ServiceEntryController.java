package controller;

import view.ServiceEntryView;
import view.View;

public class ServiceEntryController implements Controller {

    private View serviceEntry;

    public ServiceEntryController() {
        serviceEntry = new ServiceEntryView();
    }

    public View getView() {
        return serviceEntry;
    }

    public void run() {

    }
}
