package Controler;
import Class.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Page3 implements Initializable {
    public Label ScoreId;
    public Label PlayerId;

    public void PlayAgainOnAction(ActionEvent actionEvent) throws IOException {

            Parent root = FXMLLoader.load(getClass().getResource("/FXML/Page2.fxml"));
            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int a=PleyerAWeponStore.GetValus();
        int b=PlyerBWeponStore.GetValus();
        if (a>b){
            PlayerId.setText("A");
            ScoreId.setText(String.valueOf(a));
        }else {
            PlayerId.setText("B");
            ScoreId.setText(String.valueOf(b));
        }

        PleyerAWeponStore.aplayer.clear();
        PlyerBWeponStore.bplayer.clear();
        PlyerBWeponStore.tatal=0;
        PleyerAWeponStore.tatal=0;
    }
}
