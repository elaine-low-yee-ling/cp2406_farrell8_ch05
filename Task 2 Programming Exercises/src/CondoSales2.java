import javax.swing.*;

public class CondoSales2 {
    public static void main (String[] args) {
        int PARKVIEW = 150000;
        int GOLFCOURSE = 170000;
        int LAKEVIEW = 210000;
        int price = 0;
        boolean success;
        String output;

        int userChoice = Integer.parseInt(JOptionPane.showInputDialog("Choose:\n1 - Park view\n2 - Golf course view\n3 - Lake view"));
        if (userChoice == 1) {
            success = true;
            price = PARKVIEW;
            output = "Park view condominiums cost: $";
        }
        else if (userChoice == 2){
            success = true;
            price = GOLFCOURSE;
            output = "Golf course view condominiums cost: $";
        }
        else if (userChoice == 3) {
            success = true;
            price = LAKEVIEW;
            output = "Lake view condominiums cost: $";
        }
        else {
            success = false;
            output = "Invalid input. Price is $" + price;
        }

        if (success) {
            userChoice = Integer.parseInt(JOptionPane.showInputDialog("Choose:\n1 - Garage\n2 - Parking space"));

            if (userChoice == 1) {
                price += 5000;
                output += price;
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid input.");
                output += price;
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
