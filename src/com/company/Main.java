package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Day[] day1 = Day.values();
        for(Day i: day1)
            System.out.print(i.name() + " ");
        System.out.println();

        Day monday = Day.MONDAY;
        Day tuesday = Day.TUESDAY;
        Day wednesday = Day.WEDNESDAY;
        Day thursday = Day.THURSDAY;
        Day friday = Day.FRIDAY;
        Day saturday = Day.SATURDAY;
        Day sunday = Day.SUNDAY;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter day name: ");
        String dayInput = input.nextLine();

            try {
                if (dayInput.equalsIgnoreCase("monday"))
                    System.out.println("В " + monday.getTranslation() + " я учу Java!");
                else if (dayInput.equalsIgnoreCase("tuesday"))
                    System.out.println("Вo " + tuesday.getTranslation() + " я учу Soft Skills!");
                else if (dayInput.equalsIgnoreCase("wednesday"))
                    System.out.println("В " + wednesday.getTranslation() + "у я снова учу Java!");
                else if (dayInput.equalsIgnoreCase("thursday"))
                    System.out.println("В " + thursday.getTranslation() + " я учу English!");
                else if (dayInput.equalsIgnoreCase("friday"))
                    System.out.println("В " + friday.getTranslation() + "у я учу JAVA Lang!");
                else if (dayInput.equalsIgnoreCase("saturday"))
                    System.out.println("В " + saturday.getTranslation() + "у я смотрю фильм");
                else if (dayInput.equalsIgnoreCase("sunday"))
                    System.out.println("В " + sunday.getTranslation() + " я отдыхаю");
            }
            catch (IllegalArgumentException i) {
                System.out.println(i.getMessage());
            }


    }
}
