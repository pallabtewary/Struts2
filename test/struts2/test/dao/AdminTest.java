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
import struts2.test.beans.User;

/**
 *
 * @author PALLAB
 */
public class AdminTest {

    public AdminTest() {
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
     * Test of registerUser method, of class Admin.
     */
    @Test
    public void testRegisterUser() throws Exception {
        System.out.println("registerUser");
        String userName = "Pallab112233";
        String password = "1234";
        String firstName = "Pallab";
        String lastName = "Tewary";
        String email = "p@gmail.com";
        String phoneNumber = "9632585632";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.registerUser(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of report method, of class Admin.
     */
    @Test
    public void testReport() throws Exception {
        System.out.println("report");
        Admin instance = new Admin();
        List expResult = null;
        List result = instance.report();
//        assertEquals(expResult, result);
        assertNotNull(result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of fetchUserDetails method, of class Admin.
//     */

    @Test
    public void testFetchUserDetails() throws Exception {
        System.out.println("fetchUserDetails");
        String userName = "";
        Admin instance = new Admin();
        User expResult = null;
        User result = instance.fetchUserDetails(userName);
//        assertEquals(expResult, result);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of updateUserDetails method, of class Admin.
//     */

    @Test
    public void testUpdateUserDetails() throws Exception {
        System.out.println("updateUserDetails");
        String userName = "a";
        String password = "pa";
        String firstName = "a";
        String lastName = "a";
        String email = "a";
        String phoneNumber = "200";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.updateUserDetails(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of deleteUserDetails method, of class Admin.
//     */

    @Test
    public void testDeleteUserDetails() throws Exception {
        System.out.println("deleteUserDetails");
        String userName = "sss";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.deleteUserDetails(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
