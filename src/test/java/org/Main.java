package org;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Date d = new Date ();
        int year = d.getYear() + 1900;
        System.out.println("What is your current age?");
        String age_response = scanner.nextLine();
        System.out.println("At what age would you like to retire?");
        String age_retire_response = scanner.nextLine();
        int age =Integer.parseInt(age_response);
        int age_retire = Integer.parseInt(age_retire_response);
        int years_left = age_retire - age;
        if(years_left > 0) {
            System.out.println("You have " +years_left+ " years until you can retire");
            System.out.println("It's "+year+", so you can retire in "+(year+years_left));
        }
        else{
            System.out.println("You can already retire.");
        }
    }
}
