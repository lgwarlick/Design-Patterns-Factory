import java.util.Scanner;

public class MakingUnits {

    public static void main(String[] args) {

        Barracks firstBarrack = new Barracks();

        BioUnit firstUnit = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please select a unit for production.");
        System.out.println("Marine, Medic, or Firebat");

        if (userInput.hasNextLine()){
            String typeOfUnit = userInput.nextLine();

            firstUnit = firstBarrack.makeBioUnit(typeOfUnit);

            if (firstUnit != null) {
                System.out.println(firstUnit.enterPlay());
            } else
                System.out.println("You entered an invalid unit");

        }

    }

}
