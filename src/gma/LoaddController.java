/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gma;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 * FXML Controller class
 *
 * @author zaytona
 */
public class LoaddController implements Initializable {
     @FXML
    private ProgressBar progress;
    public static ProgressBar statBrogressBar;
    @FXML
    private Label progressLabel;
    public static Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         label=progressLabel;
        statBrogressBar= progress;
    }    
    
}
