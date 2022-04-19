/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entite.Planning;
import Service.Service_Planing;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author aziz
 */
public class Add_Planing_controller implements Initializable {

    @FXML
    private TextField Titre;
    @FXML
    private Button add_planing;
    @FXML
    private Label Nullable_warn;
    @FXML
    private TextArea Description;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void add_planing(ActionEvent event) {
        String titre = Titre.getText();
        String description = Description.getText();
        Planning p = new Planning(titre,description) ;
        Service_Planing sp =new Service_Planing() ;
          System.out.print("gggg");
        sp.ajouterPlaning(p) ;
    }
    
}
