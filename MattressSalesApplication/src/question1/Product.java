/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question1;

/**
 *
 * @author Student
 */
public class Product implements IProduct{
    // Declarations
    
    // One-dimensional arra
    private String[] mattressType;
    
    // Two-dimensional array
    private int[][] sales;
    
    // Constructor
    public Product(String[] mattressType, int[][] sales) {
        this.mattressType = mattressType;
        this.sales = sales;
    }
    
    // Calculate the total products sold
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        
        for (int i = 0; i < sales.length; i++) {
            for (int p = 0; p < sales[i].length; p++) {
                
                total += sales[i][p];
            }
        }
        
        return total;
    }
    
    // Calculate the average products sold
    @Override
    public double GetAverageProductsSold() {
        int total = GetTotalProductsSold();
        int salesCount = 0;
        
        for (int i = 0; i < sales.length; i++) {
                salesCount += sales[i].length;
            }
        
        
        if (salesCount == 0) {
            return 0;
        }
        
        return (double) total / salesCount;
    }
    
    @Override
    public String GetMostPopularProduct() {
        int highest = 0;
        String popularProduct = "";
        
        for (int i = 0; i < sales.length; i++) {
            for (int p = 0; p < sales[i].length; p++) {
            
                if (sales[i][p] > highest) {
                    highest = sales[i][p];
                    popularProduct = mattressType[i];
                }
            }
        }
        
        return popularProduct + " (" + highest + ") ";
    }
}
