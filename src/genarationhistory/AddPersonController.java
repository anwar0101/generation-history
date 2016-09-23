/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genarationhistory;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Muhi
 */
public class AddPersonController implements Initializable {

    @FXML
    private TextField tfName;
    @FXML
    private TextField tfAddress;
    @FXML
    private TextField tfContact;
    @FXML
    private ComboBox<?> cbxParent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void browseImage(MouseEvent event) {
        
    }
    
}
