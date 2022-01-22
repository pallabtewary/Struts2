<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Update user details</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
            <h2>Update user</h2>
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>

                    <form action=updateuserdetails method="post">


                        <tr>
                            <td>User Name:</td>
                            <td><input type="text" name="userName" value='<s:property value="userName"/>' readonly></td>
                        </tr>
                        <tr>
                            <td>Password:</td>
                            <td><input type="text"  name="password" value='<s:property value="password"/>'>
                                <input type="hidden" name="hdnuserName" value='<s:property value="userName"/>'>
                            </td>
                        </tr>
                        <tr>
                            <td>First Name:</td>
                            <td><input type="text" name="firstName" value='<s:property value="firstName"/>'></td>
                        </tr>
                        <tr>
                            <td>Last Name:</td>
                            <td><input type="text" name="lastName" value='<s:property value="lastName"/>'></td>
                        </tr>
                        <tr>
                            <td>Email:</td>
                            <td><input type="email" name="email" value='<s:property value="email"/>'></td>
                        </tr>
                        <tr>
                            <td>Phone Number:</td>
                            <td><input type="text" name="phoneNumber" value='<s:property value="phoneNumber"/>'></td>
                        </tr>

                        <tr>  
                            <td>
                                <button name="submitType" value="update" type="submit">Update</button>
                            </td>
                            <td>
                               <a href = "showusers"> <button name="" value="cancel" type="submit">Cancel</button></a>
                            </td>
                        </tr>
                    </form>
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
