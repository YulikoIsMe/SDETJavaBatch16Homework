package HW12;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is mom's first name?");
        String momName = scanner.next();
        System.out.println("What is dad's first name?");
        String dadName = scanner.next();
        System.out.println("Are you expecting boy or a girl?");
        String gender = scanner.next();

        String suggestedName;

        if (gender.equalsIgnoreCase("boy")) {
            suggestedName = dadName.substring(0, 3) + momName.substring(momName.length() - 2);
            System.out.println(suggestedName);
        } else if (gender.equalsIgnoreCase("girl")) {
            suggestedName = momName.substring(0, 2) + dadName.substring(dadName.length() - 3);
            System.out.println(suggestedName);
        }
    }
}