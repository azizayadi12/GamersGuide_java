/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author aziz
 */
public class Add_SC_controller implements Initializable {

    @FXML
    private Label Nullable_warn;
    @FXML
    private TextField date;
    @FXML
    private TextField durée;
    @FXML
    private ChoiceBox<?> planing;
    @FXML
    private TextField nb_place;
    @FXML
    private Button add_seance;
    @FXML
    private TextField prix;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void add_seance(ActionEvent event) {
        
    }
    
}
