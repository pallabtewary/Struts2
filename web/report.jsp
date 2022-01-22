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
        </style>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">


                <div class="btn-toolbar mb-2 mb-md-0">
                    <div class="btn-group me-2">
                        <a href="register.jsp"><button type="button" class="btn btn-sm btn-outline-secondary">Add New User</button></a>
                        <a href=""><button type="button" class="btn btn-sm btn-outline-secondary">Export</button></a>
                    </div>
                    <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle">
                        <span data-feather="calendar"></span>
                        This week
                    </button>
                </div>


            </div>
            <h2>User</h2>
            <s:if test="ctr>0">
                        <span style="color: red;"><s:property value="msg" /></span>
                    </s:if>
                    <s:else>
                        <span style="color: green;"><s:property value="msg" /></span>
                    </s:else>

            <s:if test="noData==false"> 
                <table class="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th scope="col">User Name</th>
                            <th scope="col">Password</th>
                            <th scope="col">First Name</th>
                            <th scope="col">Last Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Phone Number</th>
                            <th scope="col">Actions</th>
                        </tr>
                                        </thead>

                    <tbody>
                        <s:iterator value="userList">
                            <tr>
                                <td><s:property value="userName" /></td>
                                <td><s:property value="password" /></td>
                                <td><s:property value="firstName" /></td>
                                <td><s:property value="lastName" /></td>
                                <td><s:property value="email" /></td>
                                <td><s:property value="phoneNumber" /></td>
                                <td>
                                    <a href="fetchuserdetails.action?submitType=updatedata&userName=<s:property value="userName"/>">
                                        <button class="button-update">Update</button>
                                    </a>
                                    <a href="deleteuser.action?userName=<s:property value="userName"/>">
                                        <button class="button-delete">Delete</button>
                                    </a>
                                </td>
                            </tr>
                        </s:iterator>
                            
                    </tbody>
                </table>
            </s:if>
            <s:else>
                <div style="color: red;">No Data Found.</div>
            </s:else>


        </main>
    </body>
</html>