package com.example.dashnoardd;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.fxml.Initializable ;
import javafx.scene.layout.HBox;
import model.Suggested;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    private HBox cardLayout;
    private List<Suggested> PostsSuggested;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        PostsSuggested = new ArrayList<>(PostsSuggested());
        try {
        for (int i =0 ; i<PostsSuggested.size() ; i++){
            FXMLLoader fxmlLoader = new FXMLLoader() ;
            fxmlLoader.setLocation(getClass().getResource("card.fxml"));
                HBox cardBox = fxmlLoader.load();
                CardController cardController = fxmlLoader.getController();
                cardController.setData(PostsSuggested.get(i));
                cardLayout.getChildren().add(cardBox);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private List<Suggested> PostsSuggested(){
        List<Suggested> ls = new ArrayList<>();
        Suggested suggested = new Suggested();
        suggested.setName("Name Name");
        suggested.setImageSrc("/img/20160727_200829_hdr1600x1200.jpg");
        ls.add(suggested);



            suggested = new Suggested();
            suggested.setName("Name2 Name2");
            suggested.setImageSrc("/img/20160727_200829_hdr1600x1200.jpg");
            ls.add(suggested);
        return ls;




    }
}
