/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genarationhistory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Muhi
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TreeView<String> treeView;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        TreeItem<String> root = new TreeItem<>("Root Node");
        root.setExpanded(true);
        root.getChildren().addAll(
                new TreeItem<>("Item 1"),
                new TreeItem<>("Item 2")
        );
        
        treeView.setRoot(root);
    }    

    @FXML
    private void addPerson(ActionEvent event) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("AddPerson.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root1);
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(GenarationHistory.stage);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void viewAsTree(ActionEvent event) {
    }

    @FXML
    private void ViewAsGraph(ActionEvent event) {
    }
    
}
