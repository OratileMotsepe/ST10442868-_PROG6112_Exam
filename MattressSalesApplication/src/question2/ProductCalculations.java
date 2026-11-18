/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author Student
 */
public class ProductCalculations implements IProductCalculations{
    
    @Override
    public double GetVat() {
        
    }
    
    @Override
    public double GetCommission() {
        
    }
    
    @Override
    public double GetTotal() {
        int total = 0;
        
        for (int i = 0; i < sales.length; i++) {
            for (int p = 0; p < sales[i].length; p++) {
                total += sales[i][p];
            }
        }
        
        return total;
    }
}
