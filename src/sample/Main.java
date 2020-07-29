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
        //Used to accept input from the terminal.
        Scanner in = new Scanner(System.in);

        //Displays welcome message and asks for input from user.
        System.out.println("Welcome to HashCrash!\n\nPlease enter a password hash:");
        String passwdHash =  in.nextLine();

        algorithm ab = new algorithm(passwdHash);
        String usedAlgorithm = ab.FindAlgorithm();

        System.out.println("Your " + usedAlgorithm + " password hash is being processed. Please wait.");

        //These are place holders for future development.
        String attackType = "";
        String List = "";

        /* Inputs not coded for yet.
        System.out.println("Please enter the attack type:");
        String attackType =  in.nextLine();

        System.out.println("Please enter the list to use:");
        String List =  in.nextLine();
         */

        CrackDaHash cw = new CrackDaHash(usedAlgorithm , passwdHash, attackType, List);

        //Outputs the password found.
        System.out.println("\nThe Password is " + cw.FindPasswd());

        /*launch(args);*/
    }
}
