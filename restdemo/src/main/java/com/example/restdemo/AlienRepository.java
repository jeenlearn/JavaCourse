package com.example.restdemo;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AlienRepository {
	
	//List<Alien> aliens
Connection con= null;
	
	public AlienRepository(){
//		aliens = new ArrayList();
//		
//		Alien a1 = new Alien();
//		a1.setId(101);
//		a1.setName("Jeena");
//		a1.setPoints(50);
//		System.out.println("You are here");
//		Alien a2 = new Alien();
//		a2.setId(102);
//		a2.setName("Gokul");
//		a2.setPoints(50);
//		
//		aliens.add(a1);
//		aliens.add(a2);
		String url ="jdbc:mysql://localhost:3306/restdb";
		String username ="root";
		String password = "admin";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public List<Alien> getAliens(){
		List<Alien> aliens = new ArrayList<>();
		String sql = "select * from alien";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				aliens.add(a);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return aliens;
	}
	
	public Alien getAlien(int id) {
		
//		Alien a1 = null;
//		for(Alien a: aliens) {
//			if(a.getId()==id) {
//				return a;
//			}
//			
//				
//			
//		}
//		return null;
		Alien a = new Alien();
		String sql = "select * from alien where id="+id;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return a;
	}

	public void create(Alien a1) {
		
		//aliens.add(a1);
		String sql = "insert into alien values(?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, a1.getId());
			st.setString(2,a1.getName());
			st.setInt(3, a1.getPoints());
			
			st.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}
	
public void update(Alien a1) {
		
		//aliens.add(a1);
		String sql = "update alien set name=?,points=? where id=?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1,a1.getName());
			st.setInt(2, a1.getPoints());
			st.setInt(3, a1.getId());
			st.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}

public void delete(int id) {
	String sql = "delete from alien where id=?";
	try {
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, id);
		st.executeUpdate();
		
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
}
