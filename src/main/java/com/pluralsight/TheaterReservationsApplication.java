package com.pluralsight;
import java.util.*;

public class TheaterReservationsApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("What date will you be attending (MM/DD/YYYY): ");
        String date = scanner.nextLine();
        System.out.println("How many tickets will you be purchasing: ");
        int ticketAmount = scanner.nextInt();
        System.out.printf("""
                Name: %s
                Date: %s
                Number of Tickets: %d
                """, name, date, ticketAmount);
        scanner.close();
    }
}
