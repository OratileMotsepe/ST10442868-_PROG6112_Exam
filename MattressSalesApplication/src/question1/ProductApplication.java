/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question1;

import java.util.Scanner;
/**
 *
 * @author Student
 */
public class ProductApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaration
        final int PRODUCT_NUMBER = 3;
        
        final String stars = "****************************************";
        
        // One-dimensional array
        String[] namesOfProdcucts = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        
        // Two-dimensional array
        int[][] sales = new int[3][3];
        
        for (int i = 0; i < namesOfProdcucts.length; i++) {
            for (int p = 0; p < PRODUCT_NUMBER; p++) {
                
                System.out.print("Enter number of sales for month " + (p + 1) + " for " + namesOfProdcucts[i] + " mattress: ");
                sales[i][p] = input.nextInt();
            }
        }
        
        System.out.println();
        
        // Class objects created
        Product product = new Product(namesOfProdcucts, sales);
        
        PrintProduct print = new PrintProduct();
        
        // Report heading
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println(stars);
        
        print.printProductSales(product);
        print.printAverageSales(product);
        print.printPopularProduct(product);
        
        input.close();
    }
}
