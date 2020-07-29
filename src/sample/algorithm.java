package sample;

public class algorithm {
    /*Sets a string for the parts of the pizza */

    private String hash;





    public algorithm(String hash) {
        /*Sets all the varaibles about the pizza */
        this.hash = hash;
    }

    public String FindAlgorithm() {

        if (this.hash.length() == 32)  {
            return "MD5";
        }
        if (this.hash.length() == 40) {
            return "SHA1";
        }
        if (this.hash.length() == 64) {
            return "SHA256";
        }
        if (this.hash.length() == 128) {
            return "SHA512";
        }
        return null;
    }

}
