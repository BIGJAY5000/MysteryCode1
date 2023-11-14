public class Main {
    //Ben taught me how to make a function
    static String orgi = "programming is easy";
    static String func = "";
    static String nu; //supposed to be new
    public static void main(String[] args) {

        //add spaces between each letter
        spaces();

        //makes the even letters uppercase and the rest lowercase
        for (int i = 1; i <= orgi.length(); i++) {
            nu = orgi.substring(i - 1, i);
            if (i % 2 == 0) {
                nu = nu.toUpperCase();
            } else {
                nu = nu.toLowerCase();
            }
            func += nu + " ";
        }

        orgi = func;
        func = "";

        System.out.println(orgi);

        //Removes the added spaces between each letter
        spaces();

        System.out.println(orgi);

        // removes every other letter until there is only one letter left
        while (orgi.length() > 1) {
            for (int j = 0; j < orgi.length(); j+=2) {
                func += orgi.substring(j, j + 1);
            }
            orgi = func;
            func = "";
            System.out.println(orgi);
        }
    }
    static void spaces() {
        for (int j = 0; j < orgi.length(); j++) {
            if(!orgi.substring(j, j+1).equals(" ")){
                func += orgi.substring(j, j + 1);
            }
        }

        orgi = func;
        func = "";
    }
}
