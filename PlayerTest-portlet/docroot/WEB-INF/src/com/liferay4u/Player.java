package com.liferay4u;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;


public class Player {
 
	private int idplayer;
	private String fName;
	private String lName;
	private dbConnector db = new dbConnector();

public Player(){
}

public int getIdplayer(){
	return this.idplayer;
}
public void setIdplayer(int idplayer){
	this.idplayer = idplayer;
}
public String getFName(){
	return this.fName;
}
public void setFName(String fName){
	this.fName = fName;
}
public String getLName(){
	return this.lName;
}
public void setLName(String lName){
	this.lName = lName;
}
public void insertPlayer(){
	try {
		String query = "INSERT INTO player (idplayer, fName, lName)" + " VALUES (?, ?, ?)";
		PreparedStatement st = (PreparedStatement) db.conn.prepareStatement(query);
		st.setInt(1, this.getIdplayer());
		st.setString(2, this.getFName());
		st.setString(3, this.getLName());
		
		st.execute();
		
	}catch(SQLException e){
		e.printStackTrace();
	}
	}
}