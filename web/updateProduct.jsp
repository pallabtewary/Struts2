<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Update Product</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
            <h2>Update Product</h2>
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th scope ="col">
                                <s:form action = "updateproductdetails" method="post">
                            </tr> 

                            <tr>
                                <td>Product Name:</td>
                                <td><input type="text" name="productName" value='<s:property value="productName"/>'></td>
                            </tr>
                            <tr>
                                <td>Product Make:</td>
                                <td><input type="text"  name="productMake" value='<s:property value="productMake"/>'>
                                    <input type="hidden" name="productId" value='<s:property value="productId"/>'>
                                </td>
                            </tr>
                            <tr>
                                <td>Product Price:</td>
                                <td><input type="text" name="productPrice" value='<s:property value="productPrice"/>'></td>
                            </tr>
                            <tr>
                                <td>Product Availability:</td>
                                <td><input type="text" name="productAvailability" value='<s:property value="productAvailability"/>'></td>
                            </tr>

                            <tr> 

                                <td>
                                    <button name="submitType" value="update" type="submit">Update</button>
                                </td>
                                <td>
                                   <a href="showproducts"> <button name="" value="cancel" type="submit">Cancel</button></a>
                                </td>
                            </tr>
                        </s:form>
                        <s:if test="ctr>0">
                        <span style="color: red;"><s:property value="msg" /></span>
                    </s:if>
                    <s:else>
                        <span style="color: red;"><s:property value="msg" /></span>
                    </s:else>
                    </thead>  
                </table>
            </div>
        </main>
    </body>
</html>
