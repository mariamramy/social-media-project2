package com.example.dashnoardd;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import model.Suggested;

public class CardController {
    @FXML
    private VBox box;

    @FXML
    private ImageView userimage;

    @FXML
    private Label namedesc;

    private String [] colors = {"B9E5FF","BDB2FE","FB9AA8","FF5056"};
    public void setData(Suggested suggested) {
        Image image = new Image(getClass().getResourceAsStream(suggested.getImageSrc()));

        userimage.setImage(image);
        namedesc.setText(suggested.getName());
        box.setStyle("-fx-background-color: "+ Color.web(colors[(int)Math.random()*colors.length]));

    }

}
