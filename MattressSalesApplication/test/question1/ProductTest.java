/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package question1;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class ProductTest {
    
    //Test 1 - Total Product Sales
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue(){
        
        String[] namesOfProdcucts = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        
        // Object created
        Product product = new Product(namesOfProdcucts, sales);
         
        assertEquals(153, product.GetTotalProductsSold());
    }
    
    //Test 1 - Average product sales
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue(){
        
        String[] namesOfProdcucts = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        
        // Object created
        Product product = new Product(namesOfProdcucts, sales);
         
        assertEquals(17.0, product.GetAverageProductsSold(), 0.001);
    }
}
