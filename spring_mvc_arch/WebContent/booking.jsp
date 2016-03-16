<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MVC ARCH</title>
</head>
<body bgcolor="green">
<h1>Railway Booking</h1>
<form action="ticket" method="post">
<pre>
From:		<input type="text" name="from"/>
To:		<input type="text" name="to"/>
Date:		<input type="text" name="date"/>
ClassType:	<input type="text" name="classType"/>
Seats:		<input type="text" name="seats"/>
		<input type="submit" value="Book Ticket"/>
</pre>
</form>
</body>
</html>