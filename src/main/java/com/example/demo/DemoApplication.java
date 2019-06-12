package com.example.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a name for Your Sim:");
        String imie = scan.nextLine();
        System.out.println("Podaj nazwisko sima:");
        String nazwisko = scan.nextLine();
        System.out.println("Podaj wiek sima:");
        int wiek = scan.nextInt();
        Sim sim = new Sim(wiek, nazwisko, imie);
        System.out.println("Hi " + sim.getFirstName() + " " + sim.getSurname());
        System.out.println(sim + " what budget do you have?");
        double budget = scan.nextDouble();
        sim.changeBudget(budget);
        System.out.println("Do you want to go to cinema for comedy,horror or other?(true, false)");
        if (doYouWannaGo(scan)) {
            System.out.println("For which type of movie comedy, horror or other?");
            scan.nextLine();
            String movie = scan.nextLine();
            System.out.println("How many tickets do you need?");
            int tickets = scan.nextInt();
            Cinema goToCinema = new Cinema(tickets);
            goToCinema.setMovie(movie);
            goToCinema.setTotal();
            System.out.println(goToCinema.ifCanGoToCinema(sim.getBudget()));
        } else {
            System.out.println("Maybe next time...");
        }
    }



    private static boolean doYouWannaGo(Scanner scan) {
        boolean doYouWannaGo;
        try {
            doYouWannaGo = scan.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Please answer: true or false");
            scan.next();
            doYouWannaGo = doYouWannaGo(scan);
        }
        return doYouWannaGo;
    }
}
