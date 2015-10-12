package com.liferay4u;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class PlayerTest extends MVCPortlet {
       
public void actionMethod(ActionRequest actionRequest, ActionResponse actionResponse) throws SQLException {
	
	int idplayer = ParamUtil.getInteger(actionRequest,"idplayer");    	   
	String fName = ParamUtil.getString(actionRequest,"fName");
	String lName = ParamUtil.getString(actionRequest,"lName");
	dbConnector db = new dbConnector();
	
	String query = "INSERT INTO player (idplayer, fName, lName)" + " VALUES (?, ?, ?)";
	PreparedStatement st = db.conn.prepareStatement(query);
	st.setInt(1, idplayer);
	st.setString(2, fName);
	st.setString(3, lName);
	st.execute();

    actionResponse.setRenderParameter("mvcPath","/html/playertest/success.jsp");
       }
}