/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.ViewCsv;
import models.ModelCsv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *llama las variables y metodos hechos en model
 * @author Edgar
 */
public class ControllerCsv implements ActionListener{
    ViewCsv viewCsv;
    ModelCsv modelCsv;
    public ControllerCsv(ViewCsv viewCsv, ModelCsv modelCsv) {
        this.viewCsv = viewCsv;
        this.modelCsv = modelCsv;
        this.viewCsv.jb_guardar.addActionListener(this);
        this.viewCsv.jb_limpiar.addActionListener(this);
        initComponents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == viewCsv.jb_limpiar){
            clean();
        } 
        else if(e.getSource() == viewCsv.jb_guardar){
            save();
        }
    }
    /**
     * manda un texto vacio para limpiar los jtf en el view
     */
    public void clean(){
        viewCsv.jtf_nombre.setText("");
        viewCsv.jtf_email.setText("");
    }
    /**
     * guarda los cambios ingresados y los manda a el documento
     */
    public void save(){
        modelCsv.setNombre(viewCsv.jtf_nombre.getText());
        modelCsv.setEmail(viewCsv.jtf_email.getText());
        modelCsv.writeFile();
    }
    private void initComponents(){
        viewCsv.setVisible(true);
        modelCsv.readFile();
        viewCsv.jtf_nombre.setText(modelCsv.getNombre());
        viewCsv.jtf_email.setText(modelCsv.getEmail());
        
    }
}
