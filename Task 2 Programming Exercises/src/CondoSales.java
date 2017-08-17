import javax.swing.*;

public class CondoSales {

    public static void main (String[] args) {
        int PARKVIEW = 150000;
        int GOLFCOURSE = 170000;
        int LAKEVIEW = 210000;
        int price = 0;
        String output;

        int userChoice = Integer.parseInt(JOptionPane.showInputDialog("Choose:\n1 - Park view\n2 - Golf course view\n3 - Lake view"));
        if (userChoice == 1) {
            price = PARKVIEW;
            output = "Park view condominiums cost: $" + price;
        }
        else if (userChoice == 2){
            price = GOLFCOURSE;
            output = "Golf course view condominiums cost: $" + price;
        }
        else if (userChoice == 3) {
            price = LAKEVIEW;
            output = "Lake view condominiums cost: $" + price;
        }
        else {
            output = "Invalid input. Price is $" + price;
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
