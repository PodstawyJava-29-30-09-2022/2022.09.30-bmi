package com.comarch.bmi;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        BMI[] bmis = new BMI[0];

        while (true) {

            System.out.println("1. Wylicz BMI");
            System.out.println("2. Przypomnij BMI");

            Scanner scanner = new Scanner(System.in);
            String choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Podaj wzrost:");
                    String height = scanner.nextLine();
                    System.out.println("Podaj wage:");
                    String weight = scanner.nextLine();
                    double heightInDouble = Double.parseDouble(height);
                    int weightInInt = Integer.parseInt(weight);
                    double bmi = weightInInt / (heightInDouble / 100 * heightInDouble / 100);
                    Random random = new Random();
                    int id = random.nextInt(100000);
                    BMI bmiObject = new BMI(heightInDouble, weightInInt, bmi, id);
                    for (int i = 0; i < 10; i++) {
                        if (bmis[i] == null) {
                            bmis[i] = bmiObject;
                            break;
                        }
                    }
                    System.out.println("BMI: " + bmi);
                    System.out.println("Id: " + id);
                    break;
                case "2":
                    System.out.println("Podaj id:");
                    String readId = scanner.nextLine();
                    for (int i = 0; i < 10; i++) {
                        BMI bmiFromArray = bmis[i];
                        if (bmiFromArray != null && bmiFromArray.id == Integer.parseInt(readId)) {
                            System.out.println("Waga: " + bmiFromArray.weight);
                            System.out.println("Wzrost: " + bmiFromArray.height);
                            System.out.println("BMI: " + bmiFromArray.bmi);
                            break;
                        }
                    }
                    break;

                default:
                    break;
            }
        }
    }
}
