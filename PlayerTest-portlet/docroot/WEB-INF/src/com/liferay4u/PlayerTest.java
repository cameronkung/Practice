package com.liferay4u;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class PlayerTest extends MVCPortlet {
       
public void actionMethod(ActionRequest actionRequest, ActionResponse actionResponse) throws SQLException {
	
	String firstName = ParamUtil.getString(actionRequest,"firstName");
	String lastName = ParamUtil.getString(actionRequest,"lastName");
	//Date birthdate = (Date) ParamUtil.getDate(actionRequest,"birthdate", null);
	String gender = ParamUtil.getString(actionRequest,"gender");
	String phone = ParamUtil.getString(actionRequest,"phone");
	String firstNameOne = ParamUtil.getString(actionRequest,"firstNameOne");
	String lastNameOne = ParamUtil.getString(actionRequest,"lastNameOne");
	String pOnePhone = ParamUtil.getString(actionRequest,"pOnePhone");
	String emailOne = ParamUtil.getString(actionRequest,"emailOne");
	String occupationOne = ParamUtil.getString(actionRequest,"occupationOne");
	String firstNameTwo = ParamUtil.getString(actionRequest,"firstNameTwo");
	String lastNameTwo = ParamUtil.getString(actionRequest,"lastNameTwo");
	String pTwoPhone = ParamUtil.getString(actionRequest,"pOnePhone");
	String emailTwo = ParamUtil.getString(actionRequest,"emailTwo");
	String occupationTwo = ParamUtil.getString(actionRequest,"occupationTwo");
	Double cost = ParamUtil.getDouble(actionRequest,"leagueFee");
	dbConnector db = new dbConnector();
	
	
	String query = "INSERT INTO player (user_ID, league_ID, f_name, l_name, gender, phone, parent1_f_name, parent1_l_name, parent1_phone, parent1_email, parent1_occupation,parent2_f_name, parent2_l_name, parent2_phone, parent2_email, parent2_occupation, cost)" + 
			" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement st = db.conn.prepareStatement(query);
	st.setInt(1, 0);
	st.setInt(2, 0);
	st.setString(3, "asdf");
	st.setString(4, "asdf");
	st.setString(5, "m");
	st.setString(6, "2052609144");
	st.setString(7, "asdf");
	st.setString(8, "ddddd");
	st.setString(9, "2052609144");
	st.setString(10, "cameronkung@yahoo.com");
	st.setString(11, "asdf");
	st.setString(12, "asdfff");
	st.setString(13, "asdsd");
	st.setString(14, "2052609144");
	st.setString(15, "cameronkung@yahoo.com");
	st.setString(16, "asdfser");
	st.setDouble(17, 25);
	
	
	/*st.setString(4, firstName);
	st.setString(5, lastName);
	st.setDate(6, birthdate);
	st.setString(7, gender);
	st.setString(8, phone);
	st.setString(9, firstNameOne);
	st.setString(10, lastNameOne);
	st.setString(11, pOnePhone);
	st.setString(12, emailOne);
	st.setString(13, occupationOne);
	st.setString(14, firstNameTwo);
	st.setString(15, lastNameTwo);
	st.setString(16, pTwoPhone);
	st.setString(17, emailTwo);
	st.setString(18, occupationTwo);
	st.setDouble(19, cost);*/
	
	st.execute();

    actionResponse.setRenderParameter("mvcPath","/html/playertest/success.jsp");
       }
}