package pl.sda.javakrk25.day1;

import java.util.Scanner;

public class ConditionsExercise {

    // Stwórz program który generuje historię z losowych liczb
    // test changes - master
    // test change 1

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type one digit:");
        int digit = scanner.nextInt();
        // zmjkdlsaia

        switch (digit) {
            case 1: {
                System.out.println("!");
                break;
            }
            case 2: {
                System.out.println("@");
                break;
            }
            case 3: {
                System.out.println("#");
                break;
            }
            default: {
                System.out.println("unknown number!");
                break;
            }
        }


    }
}
