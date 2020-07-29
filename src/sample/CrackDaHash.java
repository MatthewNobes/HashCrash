package sample;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CrackDaHash {
    private String algorithm;
    private String hash;
    private String method;
    private String list;




    public CrackDaHash(String algorithm, String hash, String method,  String list){
        /*Sets all the varaibles about the crack */
        this.algorithm = algorithm;
        this.hash = hash;
        this.method = method;
        this.list = list;
    }

    public String FindPasswd() {

        try {
            // Newreader instance
            BufferedReader br = new BufferedReader(new FileReader("Lists\\List1.txt.txt"));

            // reads each line, runs the hash function on it and compares to the user given one.
            String line;
            while ((line = br.readLine()) != null) {

                byte[] bytesOfMessage = line.getBytes("UTF-8");

                MessageDigest md = MessageDigest.getInstance(this.algorithm);
                byte[] thedigest = md.digest(bytesOfMessage);

                // Convert byte array into signum representation
                BigInteger no = new BigInteger(1, thedigest);

                // Convert message digest into hex value
                String hashtext = no.toString(16);
                while (hashtext.length() < 32) {
                    hashtext = "0" + hashtext;
                }

                //Compares the hash from file to the one provided.
                if (hashtext.equals(this.hash)){
                    return line;
                }
            }

            // close the reader
            br.close();

        } catch (IOException | NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }

        return "Not Found";
    }


}
