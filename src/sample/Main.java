package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a password hash:");
        String passwdHash =  in.nextLine();

        String Algorithm = "";
        String attackType = "";
        String List = "";

        

        /* Inputs not coded for yet.
        System.out.println("Please enter the Algorithm used:");
        String Algorithm =  in.nextLine();

        System.out.println("Please enter the attack type:");
        String attackType =  in.nextLine();

        System.out.println("Please enter the list to use:");
        String List =  in.nextLine();

         */

        CrackDaHash cw = new CrackDaHash(Algorithm, passwdHash, attackType, List);


        System.out.println("The Password is " + cw.FindPasswd());


        /*launch(args);*/
    }
}
