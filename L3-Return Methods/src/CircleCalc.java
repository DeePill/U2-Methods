import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

   /*
   1. Get the input - get the radius
   2. Calculate Area
   3. Calculate Circumference
   4. Display Results
    */


    public static void main(String[] args) {

        area();
        circumference();

    }
        public static void area(){
            DecimalFormat round = new DecimalFormat("#.##");
            double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));

            double area = Math.pow(radius,2) * Math.PI;
            JOptionPane.showMessageDialog(null, "The area is" + round.format(area));


        double circumference = circumference(radius);


       return JOptionPane.showMessageDialog(null, displayResults(area, circumference));

    }
     //method to get input from user
    public static double getInput(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }



    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double radius){

       return Math.pow(radius, 2)  * Math.PI;

    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
      public static double circumference(double radius){

        return 2 * Math.PI * radius;
      }

      public static void displayResults(double area, double perimeter){

        String message = "The area is: " + area;
        message += "\nThe circumference is: " + perimeter;
      }
 
    }