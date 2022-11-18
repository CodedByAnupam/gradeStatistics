
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();
        Ui ui = new Ui(scanner, points);
        ui.start();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
       
    }
}
