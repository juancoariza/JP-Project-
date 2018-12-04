package sample;

//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // creates an ArrayList of products
        List<Product> tester = new ArrayList<Product>();

        // call the testCollection and assign to the ArrayList
        tester = testCollection();

        // sort the previously created ArrayList
        Collections.sort(tester);

        // print the ArrayList
        print(tester);
    }


    /*  Step 15: Choose an appropriate Java Collection and create a driver class that demonstrates its use. You should also
        demonstrate the Collections.sort method. */
    public static ArrayList<Product> testCollection() {

        AudioPlayer audio1 = new AudioPlayer("iPod Mini", "MP3");
        AudioPlayer audio2 = new AudioPlayer("Walkman", "WAV ");
        MoviePlayer movie1 = new MoviePlayer("DBPOWER MK101",
                new Screen(" 720x480", 40, 22), MonitorType.LCD);
        MoviePlayer movie2 = new MoviePlayer("Pyle PDV156BK",
                new Screen("1366x768", 40, 22), MonitorType.LED);

        ArrayList<Product> products = new ArrayList<Product>();

        products.add(audio1);
        products.add(audio2);
        products.add(movie1);
        products.add(movie2);
        return products;
    }


    /* Step 16: Create a method called print that would take your collection and list all of the contents. It should handle
       all of your classes*/
    private static <T> void print(List<T> sortedList) {

        // prints elements of the sorted list. By keeping the method parameters generic,
        // any class can print the data types within their methods, provided that there is a sorted list of said elements
        for (T P : sortedList) {
            System.out.println(P);
        }


    }
}