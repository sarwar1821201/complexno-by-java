package com.example.complexnooperation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComplexOperationViewController {

    @FXML
    private Button addComNoButton;

    @FXML
    private TextField img1stcomplexno;

    @FXML
    private TextField img2ndcomplexno;

    @FXML
    private TextField real1stcomplexno;

    @FXML
    private TextField real2ndcomplexno;

    @FXML
    private Label resultLabel;

    @FXML
    private Button subComNoButton;

    ComplexNo c1,c2,c3;

    @FXML
    void addComNoButtonOnAction(ActionEvent event) {
      c1=new ComplexNo(
              Integer.parseInt(real1stcomplexno.getText()),
              Integer.parseInt(img1stcomplexno.getText())
      );
        c2=new ComplexNo(
                Integer.parseInt(real2ndcomplexno.getText()),
                Integer.parseInt(img2ndcomplexno.getText())
        );

        c3=c1.add(c2);

        resultLabel.setText(c3.toString());
    }

    @FXML
    void subComNoButtonOnAction(ActionEvent event) {

    }

}
