<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Report</title>
        <style>
            table, td, th {border: 1px solid black;}
            table {border-collapse: collapse;width: 60%;}
            th {height: 30px;}
            .button-update {background-color: #008CBA;color: white;}
            .button-delete {background-color: red;color: white;}
            body{
                overflow-wrap: break-word;
            }

        </style>
        <link href="./css/table.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">


                <div class="btn-toolbar mb-2 mb-md-0">
                    <div class="btn-group me-2">
                        <a href="addProduct.jsp"><button type="button" class="btn btn-sm btn-outline-secondary">Add New Product</button></a>
                        <a href=""><button type="button" class="btn btn-sm btn-outline-secondary">Export</button></a>
                    </div>
                    <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle">
                        <span data-feather="calendar"></span>
                        This week
                    </button>
                </div>


            </div>
            <h2>Products List</h2>
            <s:if test="isDeleted>0">

                <span style="color: red;"><s:property value="msg" /></span>
            </s:if>
            <s:elseif test="ctr>0">
                <span style="color: red;"><s:property value="msg" /></span>
            </s:elseif>
            <s:else>
                <span style="color: green;"><s:property value="msg" /></span>
            </s:else>
            <div class="table-responsive">

                <s:if test="noData==false">
                    <div id="table-scroll" class="table-scroll">
                        <table class="table table-striped table-sm">
                            <thead>
                                <tr>
                                    <th scope="col">Product Id</th>
                                    <th scope="col">Product Name</th>
                                    <th scope="col">Product Make</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Availability</th>
                                    <th scope="col">Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                <s:iterator value="productList">
                                    <tr>
                                        <td><s:property value="productId" /></td>
                                        <td><s:property value="productName" /></td>
                                        <td><s:property value="productMake" /></td>
                                        <td><s:property value="productPrice" /></td>
                                        <td><s:property value="productAvailability" /></td>

                                        <td>
                                            <a href="fetchproductdetails.action?submitType=updatedata&productId=<s:property value="productId"/>">
                                                <button class="button-update">Update</button>
                                            </a>
                                            <a href="deleteproductrecord.action?productId=<s:property value="productId"/>">
                                                <button class="button-delete">Delete</button>
                                            </a>
                                        </td>
                                    </tr>
                                </s:iterator>
                            </tbody>
                        </table>
                    </div>
                </s:if>
                <s:else>
                    <div style="color: red;">No Data Found.</div>
                </s:else>
            </div>

        </div>
</body>
</html>