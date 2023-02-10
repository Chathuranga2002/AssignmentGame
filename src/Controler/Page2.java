package Controler;
import Class.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Page2 {
    // pleyer A
    public CheckBox PA1Id;
    public CheckBox PA2Id;
    public CheckBox PA3Id;
    public CheckBox PA4Id;
    public CheckBox PA5Id;
    //player B
    public CheckBox PB1Id;
    public CheckBox PB2Id;
    public CheckBox PB3Id;
    public CheckBox PB4Id;
    public CheckBox PB5Id;







    public void BatleStartOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Page3.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    public void T56_A_OnAction(ActionEvent actionEvent) {
        T_56 t_56=new T_56();
        int tempStore=t_56.getScore();
        if (PA1Id.isSelected()){
            t_56.shoot();
            PleyerAWeponStore.SetValus(t_56.getScore());
            tempStore=t_56.getScore();
            countA++;

        }else {
            PleyerAWeponStore.aplayer.remove(PleyerAWeponStore.aplayer.indexOf(tempStore));
            countA--;
        }
        disableCheckBox();
    }

    public void Tank_A_OnAction(ActionEvent actionEvent) {
        Tank tank=new Tank();
        int tempStore=tank.getScore();

        if (PA2Id.isSelected()){
            tank.shoot();
            PleyerAWeponStore.SetValus(tank.getScore());
            tempStore=tank.getScore();
            countA++;

        }else{
            PleyerAWeponStore.aplayer.remove(PleyerAWeponStore.aplayer.indexOf(tempStore));
            countA--;
        }
        disableCheckBox();
    }

    public void MaltiBaral_A_OnAction(ActionEvent actionEvent) {
        Maltibaral maltibaral=new Maltibaral();

        int tempStore=maltibaral.getScore();

        if (PA3Id.isSelected()){
            maltibaral.shoot();
            PleyerAWeponStore.SetValus(maltibaral.getScore());
            tempStore=maltibaral.getScore();
            countA++;

        }else{
            PleyerAWeponStore.aplayer.remove(PleyerAWeponStore.aplayer.indexOf(tempStore));
            countA--;
        }
        disableCheckBox();

    }

    public void Pistol_A_OnAction(ActionEvent actionEvent) {
        Pistol pistol=new Pistol();
        int tempStore=pistol.getScore();


        if (PA4Id.isSelected()){
            pistol.shoot();
            PleyerAWeponStore.SetValus(pistol.getScore());
            tempStore=pistol.getScore();
            countA++;

        }else{
            PleyerAWeponStore.aplayer.remove(PleyerAWeponStore.aplayer.indexOf(tempStore));
            countA--;
        }
        disableCheckBox();

    }

    public void Bomb_A_OnAction(ActionEvent actionEvent) {
        Boomb boomb=new Boomb();
        int tempStore=boomb.getScore();


        if (PA5Id.isSelected()){
            boomb.shoot();
            PleyerAWeponStore.SetValus(boomb.getScore());
            tempStore=boomb.getScore();
            countA++;

        }else{
            PleyerAWeponStore.aplayer.remove(PleyerAWeponStore.aplayer.indexOf(tempStore));
            countA--;
        }
        disableCheckBox();
    }

    public void T56_b_OnAction(ActionEvent actionEvent) {
        T_56 t_56=new T_56();
        int tempStore=t_56.getScore();


        if (PB1Id.isSelected()){
            t_56.shoot();
            PlyerBWeponStore.SetValus(t_56.getScore());
            tempStore=t_56.getScore();
            countB++;

        }else{
            PlyerBWeponStore.bplayer.remove(PlyerBWeponStore.bplayer.indexOf(tempStore));
            countB--;
        }
        disableCheckBox();

    }

    public void Tank_B_OnAction(ActionEvent actionEvent) {
        Tank tank=new Tank();
        int tempStore=tank.getScore();


        if (PB2Id.isSelected()){
            tank.shoot();
            PlyerBWeponStore.SetValus(tank.getScore());
            tempStore=tank.getScore();
            countB++;

        }else{
            PlyerBWeponStore.bplayer.remove(PlyerBWeponStore.bplayer.indexOf(tempStore));
            countB--;

        }
        disableCheckBox();
    }

    public void Maltibaral_B_OnAction(ActionEvent actionEvent) {
        Maltibaral maltibaral=new Maltibaral();
        int tempStore=maltibaral.getScore();

        if (PB3Id.isSelected()){
            maltibaral.shoot();
            PlyerBWeponStore.SetValus(maltibaral.getScore());
            tempStore=maltibaral.getScore();
            countB++;

        }else{
            PlyerBWeponStore.bplayer.remove(PlyerBWeponStore.bplayer.indexOf(tempStore));
            countB--;
        }
        disableCheckBox();

    }

    public void Pistol_B_OnAction(ActionEvent actionEvent) {
        Pistol pistol=new Pistol();
        int tempStore=pistol.getScore();

        if (PB4Id.isSelected()){
            pistol.shoot();
            PlyerBWeponStore.SetValus(pistol.getScore());
            tempStore=pistol.getScore();
            countB++;

        }else{
            PlyerBWeponStore.bplayer.remove(PlyerBWeponStore.bplayer.indexOf(tempStore));
            countB--;
        }
        disableCheckBox();


    }

    public void Bomb_B_OnActio(ActionEvent actionEvent) {
        Boomb boomb=new Boomb();
        int tempStore=boomb.getScore();

        if (PB5Id.isSelected()){
            boomb.shoot();
            PlyerBWeponStore.SetValus(boomb.getScore());
            tempStore=boomb.getScore();
            countB++;

        }else{
            PlyerBWeponStore.bplayer.remove(PlyerBWeponStore.bplayer.indexOf(tempStore));
            countB--;
        }
        disableCheckBox();

    }


    int countA=0;
    int countB=0;
    public void disableCheckBox() {
        System.out.println(countA);
        if (countA == 3) {

            if (PA1Id.isSelected()) {
                PA1Id.setDisable(false);
            } else {
                PA1Id.setDisable(true);
            }
            if (PA2Id.isSelected()) {
                PA2Id.setDisable(false);
            } else {
                PA2Id.setDisable(true);
            }
            if (PA3Id.isSelected()) {
                PA3Id.setDisable(false);
            } else {
                PA3Id.setDisable(true);
            }
            if (PA4Id.isSelected()) {
                PA4Id.setDisable(false);
            } else {
                PA4Id.setDisable(true);
            }
            if (PA5Id.isSelected()) {
                PA5Id.setDisable(false);
            } else {
                PA5Id.setDisable(true);
            }


        } else {
            PA1Id.setDisable(false);
            PA2Id.setDisable(false);
            PA3Id.setDisable(false);
            PA4Id.setDisable(false);
            PA5Id.setDisable(false);

        }
        System.out.println(countB);
        if(countB==3){
            if(PB1Id.isSelected()){
                PB1Id.setDisable(false);
            }
            else {PB1Id.setDisable(true);
            }
            if(PB2Id.isSelected()){
                PB2Id.setDisable(false);
            }
            else {
                PB2Id.setDisable(true);
            }
            if(PB3Id.isSelected()){
                PB3Id.setDisable(false);
            }else {
                PB3Id.setDisable(true);
            }
            if(PB4Id.isSelected()){
                PB4Id.setDisable(false);
            }else {
                PB4Id.setDisable(true);
            }
            if(PB5Id.isSelected()){
                PB5Id.setDisable(false);
            }
            else {
                PB5Id.setDisable(true);
            }

        }else {
            PB1Id.setDisable(false);
            PB2Id.setDisable(false);
            PB3Id.setDisable(false);
            PB4Id.setDisable(false);
            PB5Id.setDisable(false);
        }
    }

}
