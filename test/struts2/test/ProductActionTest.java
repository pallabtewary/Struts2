/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test;

import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsTestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.Assert.*;
import struts2.test.actions.ProductAction;

/**
 *
 * @author PALLABpublic class ProductActionTest extends StrutsTestCase {
    @Test
    public void testNoData() throws Exception {
        ActionProxy actionproxy = getActionProxy("/addproduct.action");
        ProductAction action = (ProductAction) actionproxy.getAction();
        System.out.println(action);
        assertNotNull("The action is null but should not be",action);
        String result = actionproxy.execute();
        assertEquals("The Execute method did not return"+ ActionSupport.INPUT + "but should have",ActionSupport.INPUT,result);
    }
    
 */
public class ProductActionTest extends StrutsTestCase {
    @BeforeClass
    public static void setUpClass(){
        
    }
    @AfterClass
    public static void tearDownClass(){
        
    }
    @Test
    public void testNoData() throws Exception {
        
        ActionProxy actionproxy = getActionProxy("/addproduct.action");
        ProductAction action = (ProductAction) actionproxy.getAction();
        System.out.println(action);
        assertNotNull("The action is null but should not be",action);
        String result = actionproxy.execute();
        assertEquals("The Execute method did not return"+ ActionSupport.INPUT + "but should have",ActionSupport.INPUT,result);
    }
//    @Test
//    public void testData() throws Exception{
//        request.setParameter("accountBean.userName", "Bruce");
//        ActionProxy actionproxy = getActionProxy("/addproduct.action");
//        ProductAction action = (ProductAction) actionproxy.getAction();
//        System.out.println(action);
//        assertNotNull("The action is null but should not be",action);
//        String result = actionproxy.execute();
//        assertEquals("The Execute method did not return"+ ActionSupport.SUCCESS + "but should have",ActionSupport.SUCCESS,result);
//    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
