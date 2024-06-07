/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bukotovillagebanklimited;

/**
 *
 * @author Alvihn-PC
 */
import java.util.Scanner;

public class bukotovillagebanklimited {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter interest rate (in %): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter time period (in years): ");
        int timePeriod = scanner.nextInt();

        double investmentValue = principal;

        for (int i = 0; i < timePeriod; i++) {
            investmentValue += (investmentValue * (interestRate / 100));
        }

        System.out.println("Value of investment after " + timePeriod + " years: " + investmentValue);
    }
}
