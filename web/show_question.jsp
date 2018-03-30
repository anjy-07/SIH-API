<%-- 
    Document   : show_question
    Created on : 30 Mar, 2018, 2:22:35 PM
    Author     : ashima
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@include file="Connection.jsp" %>
<%
int tid = Integer.parseInt(request.getParameter("tid"));
String sql = "SELECT * FROM `question` WHERE TID = "+tid+"";
Statement stm = con.createStatement();
ResultSet rs = stm.executeQuery(sql);
int qid;
String question=null, description=null, format=null, required=null;
String text = "";
while(rs.next()){
    qid = rs.getInt("qid");
    question = rs.getString("question");
    description = rs.getString("Description");
    format = rs.getString("format");
    required = rs.getString("required");
    
text += question;
text += description;
text += format;
text += required;
}


response.getWriter().println(text);

%>

