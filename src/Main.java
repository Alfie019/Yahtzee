import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Begin ?");

        Scanner input = new Scanner(System.in);
        input.next();
        Random ranNum = new Random();
        System.out.println("You rolled: ");

        int diceOne = 0; 
        int diceTwo = 0; 
        int diceThree = 0; 
        int diceFour = 0; 
        int diceFive = 0; 
        
        for (int i = 0; i < 6; i++ ) {
            int randomNumber = ranNum.nextInt(6) + 1 ;

            if (i == 0) {
                diceOne = randomNumber;
            } else if (i == 1) {
                diceTwo = randomNumber;
            }else if (i == 2) {
                diceThree = randomNumber;
            }else if (i == 3) {
                diceFour = randomNumber;
            }else if (i == 4) {
                diceFive = randomNumber;
            }

        }
        System.out.println("diceOne : " + diceOne);
        System.out.println("diceTwo : " + diceTwo);
        System.out.println("diceThree : " + diceThree);
        System.out.println("diceFour : " + diceFour);
        System.out.println("diceFive : " + diceFive);

        //Task1 : user selects what score they want to use (some calcualtions)
        //Task2 : can i simplyfy with functions
        //task3 : ability to re roll dice before score selection




        System.out.println("Finished");
    }
}