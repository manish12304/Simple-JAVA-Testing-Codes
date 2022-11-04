

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        //Lottery intro

        System.out.println("Created by Manish Chauhan");
        System.out.println("Welcome to JAVA Lottery");
        System.out.println("$10 = 20% chance, $50 = 50% chance, $100 = 70% chance");
        System.out.println("Following tickets available Buy any one");
        System.out.println("Enter Ticket Price");
        System.out.println("Connecting to GITHUB");


        //Get user ticket
        Scanner Utick = new Scanner(System.in);
        int ptick = Utick.nextInt();

        //Get user Name
        System.out.println("Enter Your Name");
        Scanner usern = new Scanner(System.in);
        String name = usern.next();

        //for 10$
        if (ptick == 10) {
            System.out.println("20% Winning Chance");
            System.out.println("TRY YOUR LUCK");
            System.out.println("Great Enter any 2 Luck numbers");
            Scanner P1 = new Scanner(System.in);
            int P1L = P1.nextInt();
            while (true) {   //If Value is true
                if (P1L > 100) {
                    System.out.println("Please Enter only two number, Refresh the page to continue");
                    break;
                }if (P1L < 10) {
                    System.out.println("Please Enter only two number, Refresh the page to continue");
                    break;
                }
                if (P1L < 100) {
                    int UL1 = P1L * P1L;
                    System.out.print("Your Lottery Number:");
                    System.out.println(UL1);
                    //User Enters ticket number
                    System.out.println("Please Enter your Lottery Number");
                    Scanner a1 = new Scanner(System.in);
                    int La1 = a1.nextInt();
                    //Lottery number condition
                    if (La1 == UL1){
                        if (La1 >= 10 && La1 <=300){
                            System.out.print("Bamboozled ");
                            System.out.println(name);
                            System.out.println("You Won 30$");
                            System.out.println("Thanks for Playing");
                        }else {
                            System.out.println("Fuck you loose");
                            System.out.print(name);
                            System.out.println(" Please Try Again");
                        }
                        break;
                    }
                }
            }
        } else if (ptick == 50) {
            System.out.println("40% Winning Chance");
            System.out.println("TRY YOUR LUCK");
            System.out.println("Great Enter any 3 Luck numbers");
            Scanner P2 = new Scanner(System.in);
            int P2L = P2.nextInt();
            while (true) {   //If Value is true
                if (P2L > 1000) {
                    System.out.println("Please Enter only Three number, Re-run the code to continue");
                    break;
                }if (P2L < 100) {
                    System.out.println("Please Enter only Three number, Re-run the code to continue");
                    break;
                }
                if (P2L < 1000) {
                    int UL2 = P2L * P2L;
                    System.out.print("Your Lottery Number:");
                    System.out.println(UL2);
                    //User Enters ticket number
                    System.out.println("Please Enter your Lottery Number");
                    Scanner b1 = new Scanner(System.in);
                    int La2 = b1.nextInt();
                    //Lottery number condition
                    if (La2 == UL2){
                        if (La2>= 100000 && La2 <=600000){
                            System.out.print("Bamboozled ");
                            System.out.println(name);
                            System.out.println("You Won 100$");
                            System.out.println("Thanks for Playing");
                        }else {
                            System.out.println("Fuck you loose");
                            System.out.print(name);
                            System.out.println(" Please Try Again");
                        }
                        break;
                    }
                }
            }
        } else if (ptick == 100) {
            System.out.println("70% Winning Chance");
            System.out.println("TRY YOUR LUCK");
            System.out.println("Great Enter any 4 Luck numbers");
            Scanner P3 = new Scanner(System.in);
            int P3L = P3.nextInt();
            while (true) {   //If Value is true
                if (P3L < 1000) {
                    System.out.println("Please Enter only Three number, Re-run the code to continue");
                    break;
                }if (P3L > 10000) {
                    System.out.println("Please Enter only Three number, Re-run the code to continue");
                    break;
                }
                if (P3L > 999) {
                    int UL3 = P3L * P3L;
                    System.out.print("Your Lottery Number:");
                    System.out.println(UL3);
                    //User Enters ticket number
                    System.out.println("Please Enter your Lottery Number");
                    Scanner c1 = new Scanner(System.in);
                    int La3 = c1.nextInt();
                    //Lottery number condition
                    if (La3 == UL3){
                        if (La3>= 100000 && La3 <=2500000){
                            System.out.print("Congratulations You WON MEGA PRIZE ");
                            System.out.println(name);
                            System.out.println("YOU WON 200$");
                            System.out.println("Thanks for Playing");
                        }else {
                            System.out.println("Fuck you loose");
                            System.out.print(name);
                            System.out.println(" Please Try Again");
                        }
                        break;
                    }
                }
            }
        }else {
            System.out.print("Seriously! ");
            System.out.println(name);
            System.out.println(" WTF are you Stupid");
            System.out.println("Please Enter Correct Ticket amount, you can buy only one ticket.");
            System.out.println("Please rerun the code to participate again");
            System.out.println("Thanks for Playing");
        }
    }
}

