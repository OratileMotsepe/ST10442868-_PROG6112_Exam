/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author Student
 */
public class ProductApplication {
    
    // Declarations
    String customerName;
    String productName;
    private double commissionAmount;
    private int totalSaleAmmount;
    
    private double VAT = 0.15;
    
    public ProductApplication(String customerName, String productName, double commissionAmount, int totalSaleAmmount) {
        this.customerName = customerName;
        this.productName = productName;
        this.commissionAmount = commissionAmount;
        this.totalSaleAmmount = totalSaleAmmount; 
    }
    
    // Getter methods
    public String getCustomerName(){
        return customerName;
    }
    
    public String getProductName(){
        return productName;
    }
    
    public double getCommissionAmount(){
        return commissionAmount;
    }
    
    public int getTotalSaleAmmount(){
        return totalSaleAmmount;
    }
    
    
    
}
