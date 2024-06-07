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

public class AlexaAndBalexisMerchants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("Product\tSum\tMaximum");
        System.out.println(product + "\t" + sum + "\t" + max);
    }
}

