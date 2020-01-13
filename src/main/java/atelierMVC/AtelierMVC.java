package atelierMVC;

import ateliermvc.controller.Controller;
import ateliermvc.model.Model;
import ateliermvc.view.View;

public class AtelierMVC {
    public static void main(String args[]) {
        Controller c=new Controller(new Model(), new View()); c.run();
    }
}
