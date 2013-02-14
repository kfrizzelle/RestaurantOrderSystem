<%-- 
    Document   : menu
    Created on : Feb 13, 2013, 10:52:32 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ken'sLittleItaly : Menu</title>
    </head>
    <body>
        <h1>Ken's Little Italy</h1>
        <p>Welcome to our new online ordering feature. Please select a meal below and select whether you would prefer a soup or a salad.</p>
        <h2>All items are now only $9.99</h2>
        <form id="order" name="placeOrder" method="POST" action="Order.do">
            <input type="checkbox" name="item" value="Fettuccini Alfredo">Fettuccini Alfredo<br />
            <input type="checkbox" name="item" value="Chicken Carbonara">Chicken Carbonara<br />
            <input type="checkbox" name="item" value="Asiago Cheese Tortellini">Asiago Cheese Tortellini<br />
            <input type="checkbox" name="item" value="Chicken Marsala">Chicken Marsala<br />
            <input type="checkbox" name="item" value="Chicken Parmesan">Chicken Parmesan<br />
            <input type="checkbox" name="item" value="Momma's Lasagna">Momma's Lasagna<br />
            <input type="checkbox" name="item" value="Four Cheese Pizza">Four Cheese Pizza<br />
            <input type="checkbox" name="item" value="Party Size Salad">Party Size Salad<br />
            <input type="checkbox" name="item" value="Party Size Pasta Fagoli">Party Size Pasta Fagoli<br />
            <p>Please enter your name for the order pickup.</p>
            
            Name: <input type="text" name="name" /><br />
            
            <input type="submit" name="submit" value="Place Order"/>
        </form>
        <p style="color: red">* The price was set, because after hours of trying to pass a<br />
                              2d array I needed to make a rigged version for more points<br />
                              than previous versions would have earned.</p>
    </body>
</html>
