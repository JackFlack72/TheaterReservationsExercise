package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TheaterReservationsApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        String[] nameSplit = name.trim().split(" ");

        System.out.println("What date will you be attending (MM/DD/YYYY): ");
        String dateAsString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateAsString, formatter);

        System.out.println("How many tickets will you be purchasing: ");
        int ticketAmount = scanner.nextInt();


        System.out.printf("%d ticket(s) reserved for %s under %s, %s.", ticketAmount, date, nameSplit[1], nameSplit[0]);

        scanner.close();
    }
}
