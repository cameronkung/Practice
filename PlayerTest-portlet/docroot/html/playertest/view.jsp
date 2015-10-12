<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<script src="http://cdn.alloyui.com/3.0.1/aui/aui-min.js"></script>

<link href="http://cdn.alloyui.com/3.0.1/aui-css/css/bootstrap.min.css" rel="stylesheet"></link>

<portlet:defineObjects />

<portlet:actionURL name="actionMethod" var="actionURLVar"> </portlet:actionURL>

<aui:form method="POST" action="<%=actionURLVar%>">
<b> Player ID</b>
<aui:input name="idplayer" type="text"> </aui:input> <br/>
<b> First Name </b>
<aui:input name="fName" type="text" ></aui:input> <br/>
<b> Last Name </b>
<aui:input name="lName" type="text"></aui:input> <br/>
<aui:input name="submit" type="submit" value="add player"></aui:input>
</aui:form>