/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import struts2.test.beans.Product;

/**
 *
 * @author PALLAB
 */
public class ProductServicesTest {
    
    public ProductServicesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addProduct method, of class ProductServices.
     */
    @Test
    public void testAddProduct() throws Exception {
        System.out.println("addProduct");
        String productName = "DemoProduct";
        String productMake = "Not For Sale";
        double productPrice = 000.0;
        int productAvailability = 00;
        ProductServices instance = new ProductServices();
        int expResult = 1;
        int result = instance.addProduct(productName, productMake, productPrice, productAvailability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of reportProduct method, of class ProductServices.
     */
    @Test
    public void testReportProduct() throws Exception {
        System.out.println("reportProduct");
        ProductServices instance = new ProductServices();
        List expResult = null;
        List result = instance.reportProduct();
//        assertEquals(expResult, result);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchProductDetails method, of class ProductServices.
     */
    @Test
    public void testFetchProductDetails() throws Exception {
        System.out.println("fetchProductDetails");
        int productId = 1;
        ProductServices instance = new ProductServices();
        Product expResult = null;
        Product result = instance.fetchProductDetails(productId);
//        assertEquals(expResult, result);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProductDetails method, of class ProductServices.
     */
    @Test
    public void testUpdateProductDetails() throws Exception {
        System.out.println("updateProductDetails");
        int productId = 67;
        String productName = "Milk";
        String productMake = "UpdateTest";
        double productPrice = 25.0;
        int productAvailability = 0;
        ProductServices instance = new ProductServices();
        int expResult = 1;
        int result = instance.updateProductDetails(productId, productName, productMake, productPrice, productAvailability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProductDetails method, of class ProductServices.
     */
    @Test
    public void testDeleteProductDetails() throws Exception {
        System.out.println("deleteProductDetails");
        int productId = 69;
        ProductServices instance = new ProductServices();
        int expResult = 1;
        int result = instance.deleteProductDetails(productId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
