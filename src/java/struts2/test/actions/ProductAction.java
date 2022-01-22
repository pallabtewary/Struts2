/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import struts2.test.beans.Product;
import struts2.test.dao.ProductServices;

/**
 *
 * @author PALLAB
 */
public class ProductAction extends ActionSupport {

    private int productId;
    private String productName;
    private String productMake;
    private double productPrice;
    private int productAvailability;
    private String msg = "";
    ProductServices p = null;
    private int ctr = 0;
    ResultSet rs = null;
    Product product = null;
    private List<Product> productList = null;
    private boolean noData = false;
    private String submitType;
    private int isDeleted = 0;

    public String createProduct() throws Exception {
        p = new ProductServices();
        try {
            setCtr(p.addProduct(productName, productMake, productPrice, productAvailability));
            if (getCtr() > 0) {
                setMsg("Product Added Successfully!");
            } else {
                setMsg("Some error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "REGISTERPRODUCT";
    }

    public String showProducts() throws Exception {
        p = new ProductServices();
        try {
            setProductList(new ArrayList<>());
            setProductList(p.reportProduct());

            if (!productList.isEmpty()) {
                setNoData(false);
                System.out.println("Products retrieve = " + getProductList().size());
                System.out.println("setting nodata=false");
            } else {
                setNoData(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "REPORT";
    }

    public String updateProduct() throws Exception {
        p = new ProductServices();
        try {
            if (submitType.equals("updatedata")) {
                System.out.println("Yes pallab I am here in the Fetch details section");
                Product product = p.fetchProductDetails(productId);
                if (product != null) {
                    productId = product.getProductId();
                    productName = product.getProductName();
                    productMake = product.getProductMake();
                    productPrice = product.getProductPrice();
                    productAvailability = product.getProductAvailability();
                }
            } else {
                int i = p.updateProductDetails(productId, productName, productMake, productPrice, productAvailability);
                if (i > 0) {
                    msg = "Record Updated Successfuly";
                } else {
                    msg = "error";
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "UPDATE";
    }

    public String deleteProduct() throws Exception {
        p = new ProductServices();
        try {
            setIsDeleted(p.deleteProductDetails(productId));
            if (getIsDeleted() > 0) {
                msg = "Record deleted successfully";
            } else {
                msg = "Some error";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "DELETE";
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the productList
     */
    public List<Product> getProductList() {
        return productList;
    }

    /**
     * @param productList the productList to set
     */
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    /**
     * @return the noData
     */
    public boolean isNoData() {
        return noData;
    }

    /**
     * @param noData the noData to set
     */
    public void setNoData(boolean noData) {
        this.noData = noData;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productMake
     */
    public String getProductMake() {
        return productMake;
    }

    /**
     * @param productMake the productMake to set
     */
    public void setProductMake(String productMake) {
        this.productMake = productMake;
    }

    /**
     * @return the productPrice
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return the productAvailability
     */
    public int getProductAvailability() {
        return productAvailability;
    }

    /**
     * @param productAvailability the productAvailability to set
     */
    public void setProductAvailability(int productAvailability) {
        this.productAvailability = productAvailability;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the ctr
     */
    public int getCtr() {
        return ctr;
    }

    /**
     * @param ctr the ctr to set
     */
    public void setCtr(int ctr) {
        this.ctr = ctr;
    }

    /**
     * @return the productName
     */
    public String getSubmitType() {
        return submitType;
    }

    /**
     * @param submitType the submitType to set
     */
    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

    /**
     * @return the isDeleted
     */
    public int getIsDeleted() {
        return isDeleted;
    }

    /**
     * @param isDeleted the isDeleted to set
     */
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
