import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] unitS;
        String [] UnitName =new String[7];
        for (int i=0; i<UnitName.length; i++)
        {
            System.out.println("Enter the unit name: "+ (i+1));
            UnitName[i] = keyboard.nextLine();
        }
        System.out.println();
        for(int i=0; i<UnitName.length; i++)
        {
            System.out.println("Number"+ (i+1)+ "" +UnitName[1]);
        }

    }
}
