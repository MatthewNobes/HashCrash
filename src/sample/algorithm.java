package sample;

public class algorithm {

    private String hash;

    public algorithm(String hash) {
        this.hash = hash;
    }

    public String FindAlgorithm() {
        //Compares the length of the user hash to determine the algorithm used.
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
