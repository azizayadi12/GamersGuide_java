/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Entite.Planning;
import Service.Service_Planing;
import datasource.Connexion;
import java.io.IOException;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author aziz
 */
public class Aff_planing implements Initializable {

    @FXML
    private TableView<Planning> table;
    @FXML
    private TableColumn<Planning,String > titre;
   
    @FXML
    private Button but2;
    @FXML
    private Button but1;
    @FXML
    private Button but3;
   public ObservableList<Planning> data =FXCollections.observableArrayList();
    @FXML
    private TableColumn<Planning, String> description;
    /**
     * Initializes the controller class.
     */
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadplaninig();
        //id.setCellValueFactory(new PropertyValueFactory<>("id"));
        titre.setCellValueFactory(new PropertyValueFactory<>("titre"));
       description.setCellValueFactory(new PropertyValueFactory<>("description"));
      
    }    
    
    public void loadplaninig(){
        
         Service_Planing s = new Service_Planing();
        ArrayList<Planning> stand = s.selectAllPlaning();
        ObservableList observableList = FXCollections.observableArrayList(stand);
        table.setItems(observableList);
        
    }

    @FXML
    private void modif_planing(ActionEvent event)throws IOException,ParseException {
       // s = stands.getSelectionModel().getSelectedItem();
        

    }

    @FXML
    private void supp_planing(ActionEvent event) {
    }

    @FXML
    private void detail_planing(ActionEvent event) {
    }
    
}
