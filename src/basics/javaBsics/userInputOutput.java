package basics.javaBsics;

import java.util.Scanner;

public class userInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name = sc.nextLine();
        System.out.println("Welcome to Java World " + name);
    }
}
