/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azizpidev;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author aziz
 */
public class AZIZPIDEV extends Application {
   
    @Override
    public void start(Stage primaryStage) {
         Parent root;
        try {
             root= FXMLLoader.load(getClass().getResource("/GUI/Add_Planing.fxml"));
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            //System.out.println(ex.getMessage());
             Logger.getLogger(AZIZPIDEV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
        
    }   
    
}
