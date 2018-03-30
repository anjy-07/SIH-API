<%-- 
    Document   : question_form
    Created on : 30 Mar, 2018, 10:03:24 AM
    Author     : ashima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/question_form.js"></script>
        <link rel = "stylesheet" type = "text/css" href = "css/question_form.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Question Form</title>
        
    </head>
    <body>
        <%
        int tid = Integer.parseInt(request.getParameter("tid"));
        System.out.println(tid);
        %>
    <center><div id="heading"><h1>QUESTIONNAIRE</h1></div></center>
    
    <div id="added_question">
        Q) hey how are you<br>
        description<br>
        question format : multichoice<br>
        no. of options : 4<br>
        options :- <br>
        good<br>
        bad<br>
        
    </div>
    <div class="conatiner">
        <div class="jumbotron" style="width: 60%; margin-left: 23%; padding: 20px; background-color: gray; ">
            <form>
               <div class="form-group">
                 <label for="Question">Question</label>
                 <input type="text" name="question" id="question" class="form-control" Placeholder="Question">
               </div>
               <div class="form-group">
                 <label for="inputType">Select type</label>
                 <select name="question_format" id="question_format" class="form-control" onchange="quest_opt()">
                        <option value="Short Text">Short Text</option>
                        <option value="Paragraph">Paragraph</option>
                        <option value="Multiple Choice">Multiple Choice</option>
                        <option value="Check Boxes">Check Boxes</option>
                        <option value="Drop Down">Drop Down</option>
                        <option value="Date">Date</option>
                        <option value="Linear Scale">Linear Scale</option>
                 </select>
                </div>
                <div class="form-group">
                    <label >Description</label>
                    <textarea class="form-control"  name="question_description" id="question_description" placeholder="Description..."></textarea>
                </div>  
                <div class="form-group" id="question_option">
                     <label >No. of options</label>
                     <input class="form-control" type="text" name="no_of_option" id="no_of_option" placeholder="no_of_option" value="1" onkeyup="change_opt(this.value)" />
                     <label >Options :-</label>
                     <div class="form-group" id="option">
                         <input placeholder="1)" class="form-control" type="text" name="option1" id="option1"/>
                        </div>
                </div>
                
                <span><input class="form-control btn-primary" style="width: 100px;" type="button"  name="create" value="create" id="create" onclick="create_question(<%= tid %>)"/></span>
                <span ><input class="form-control btn-primary" style="width: 100px;" type="button"  name="cancel" value="cancel" id="cancel"/></span>
                <div>
                     Required
                    <label style="margin-top: 2px;" class="switch">
                        <input style="margin-top: 2px;" type="checkbox" id="required" name="required">
                        <span style="margin-top: 2px;" class="slider round"></span>
                    </label> 
                </div>
            </form>
        </div>
    </div>
    </body>
</html>
