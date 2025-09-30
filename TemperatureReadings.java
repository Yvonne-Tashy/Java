import java.util.Scanner;

public class TemperatureReadings {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
         double[] temperature;
         temperature = new double[7];
         for (int i=0; i<temperature.length; i++)
        {
        System.out.println("Enter the max temperature of the day"+ (i+1));
        temperature[1] = keyboard.nextDouble();
        }
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println();
        for(int i=0; i<temperature.length; i++)
        {
            System.out.println("day"+ (i+1)+ "" +temperature[1]);
        }

    }
}