/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Service.Service_Planing;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author aziz
 */
public class Modifie_planingController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private TextField titre;
    @FXML
    private TextArea description;
    @FXML
    private Button modif_planning;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void jj(ActionEvent event) {
        Service_Planing sp =new Service_Planing();
        int ss = Integer.parseInt(id.getText()) ;
         String tt = titre.getText();
        String dd = description.getText();
        sp.modifPlaning(ss,tt,dd);
    }
    
}
