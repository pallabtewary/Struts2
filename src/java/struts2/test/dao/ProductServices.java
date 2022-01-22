/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import struts2.test.beans.Product;
import struts2.test.beans.User;
import struts2.test.core.ConnectionManager;


/**
 *
 * @author PALLAB
 */
public class ProductServices {
    public int addProduct(String productName, String productMake, double productPrice, int productAvailability) throws Exception {
        int i = 0;
        Connection con = null;
        try {
            con = ConnectionManager.getConnection();
            String sql = "INSERT INTO products(productName,productMake,productPrice,productAvailability,status)VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, productName);
            ps.setString(2, productMake);
            ps.setDouble(3, productPrice);
            ps.setInt(4, productAvailability);
            ps.setInt(5, 1);
            System.out.println("SQL for insert="+ps);
            i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
    public List reportProduct() throws SQLException, Exception {
        ResultSet rs = null;
        Connection con = null;
        List<Product> productList = new ArrayList<>();
        try {
            String sql = "SELECT productId,productName,productMake,productPrice,productAvailability FROM products WHERE status = ?";
            con = ConnectionManager.getConnection();
            System.out.println("Connection is " + con);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            rs = ps.executeQuery();
            while (rs.next()) {

                Product product = new Product();
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setProductMake(rs.getString("productMake"));
                product.setProductPrice(rs.getDouble("productPrice"));
                product.setProductAvailability(rs.getInt("productAvailability"));

                productList.add(product);
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
    public Product fetchProductDetails(int productId) throws SQLException, Exception {
        ResultSet rs = null;
        Connection con = null;
        Product product = new Product();
        try {
            con = ConnectionManager.getConnection();
            String sql = "SELECT productId, productName, productMake, "
                    + "productPrice,productAvailability FROM products WHERE productId =? AND status = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println("productId = " + productId);
            ps.setInt(1, productId);
            ps.setInt(2, 1);
            System.out.println("Select SQL = " + ps);

            rs = ps.executeQuery();
            if (rs.next()) {
                
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setProductMake(rs.getString("productMake"));
                product.setProductPrice(rs.getDouble("productPrice"));
                product.setProductAvailability(rs.getInt("productAvailability"));
            }
            return product;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
    public int updateProductDetails(int productId, String productName, String productMake, double productPrice,
            int productAvailability) throws SQLException, Exception {

        Connection con = ConnectionManager.getConnection();
        int i = 0;
        try {
            String sql = "UPDATE products SET productName = ?, productMake = ?, "
                    + "productPrice = ?, productAvailability = ? "
                    + "WHERE productId = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, productName);
            ps.setString(2, productMake);
            ps.setDouble(3, productPrice);
            ps.setInt(4,productAvailability);
            ps.setInt(5, productId);
            
            System.out.println("Select SQL = " + ps);
            i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public int deleteProductDetails(int productId)throws SQLException, Exception {
        Connection con = ConnectionManager.getConnection();
        int i = 0;
        try{
            String sql = "UPDATE products SET status = 0 WHERE productId = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, productId);
            i = ps.executeUpdate();
            return i;
        }
        catch(Exception e){
            e.printStackTrace();
            return 0;
        }
        finally {
            if (con != null) {
                con.close();
            }
        }
        
        
    }


    
}
