package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
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

        System.out.println("Welcome to HashCrash!\n");

        System.out.println("Please enter a password hash:");
        String passwdHash =  in.nextLine();

        algorithm ab = new algorithm(passwdHash);

        String usedAlgorithm = ab.FindAlgorithm();

        System.out.println("Your hash is being processed. Please wait.");


        String attackType = "";
        String List = "";

        

        /* Inputs not coded for yet.
        System.out.println("Please enter the attack type:");
        String attackType =  in.nextLine();

        System.out.println("Please enter the list to use:");
        String List =  in.nextLine();

         */

        CrackDaHash cw = new CrackDaHash(usedAlgorithm , passwdHash, attackType, List);


        System.out.println("\nThe Password is " + cw.FindPasswd());


        /*launch(args);*/
    }
}
