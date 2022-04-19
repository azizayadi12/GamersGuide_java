/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Service.Service_Séance;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author aziz
 */
public class modifie_seance_controller implements Initializable {

    private TextField Date;
    private TextField Durée;
    private TextField Prix;
    private TextField nb_place;
    private TextField id;
    @FXML
    private TextField titre;
    @FXML
    private TextArea description;
    @FXML
    private Button modifie_planing;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

  
    private void modif_seance(ActionEvent event) 
         {
        Service_Séance ss =new Service_Séance();
        int a = Integer.parseInt(id.getText()) ;
        String b= Date.getText();
        float c =Float.parseFloat(Durée.getText());
        float d=Float.parseFloat(Prix.getText());
        int e = Integer.parseInt(nb_place.getText()) ;
        ss.modifSeance(a,b,c,d,e);
    }

        
       
    }
    

