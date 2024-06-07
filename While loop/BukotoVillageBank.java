/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bukotovillagebanklimited;

/**
 *
 * @author Alvihn-PC
 */
import java.util.Scanner;

public class BukotoVillageBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter interest rate (in %): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter time period (in years): ");
        int timePeriod = scanner.nextInt();

        double investmentValue = principal;
        int year = 0;

        while (year < timePeriod) {
            investmentValue += (investmentValue * (interestRate / 100));
            year++;
        }

        System.out.println("Value of investment after " + timePeriod + " years: " + investmentValue);
    }
}
