package ateliermvc.controller;

import ateliermvc.model.IModel;
import ateliermvc.view.IView;

import java.awt.image.IndexColorModel;


public class Controller {
    private IModel model;
    private IView view;

    public Controller(IModel n_model, IView n_view){
        this.model = n_model;
        this.view= n_view;
    }

    public void run(){
        this.view.display(this.model.getMessage());
    }
}
