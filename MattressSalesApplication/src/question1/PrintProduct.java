/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question1;

/**
 *
 * @author Student
 */
public class PrintProduct {
    
    // Printing the total product sales
    public void printProductSales(Product product) {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }
    
    // Print average product sales
    public void printAverageSales(Product product) {
        System.out.println("AVERAGE PRODUCT SALES: " + product.GetAverageProductsSold());
    }
    
    // Print the most popular 
    public void printPopularProduct(Product product) {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
    
}
