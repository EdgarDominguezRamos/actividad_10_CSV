/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.ViewCsv;
import models.ModelCsv;
import controllers.ControllerCsv;
/**
 *llama a los componentes de otros package para trabajar en conjunto
 * @author Edgar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewCsv viewCsv = new ViewCsv();
        ModelCsv modelCvs = new ModelCsv();
        ControllerCsv controllerCsv = new ControllerCsv(viewCsv,modelCvs);
    }
    
}
