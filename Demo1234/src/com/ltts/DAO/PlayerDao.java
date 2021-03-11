package com.ltts.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.MyConnection;
import com.ltts.model.player;


public class PlayerDao {
	public List<player> getAllPlayers()
	{
		List<player> li= new ArrayList<player>();
		return li;
	}
	public player getPlayerById(int id)
	{
		player p=new player();
		return p;
	}
	
	public boolean insertPlayer(player p) throws Exception
	{
		Connection c= MyConnection.getConnection();
		PreparedStatement ps= c.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getPlayer_id());
		ps.setString(2, p.getName());
		ps.setString(3, p.getDateOfBirth());
		ps.setString(4, p.getNationality());
		ps.setString(5, p.getSkills());
		ps.setInt(6, p.getRuns());
		ps.setInt(7, p.getWickets());
		ps.setInt(8, p.getNumber_of_matches());
		ps.setInt(9, p.getTeam_id());
		System.out.println("Data Inserted Succesfully");
		return ps.execute();
		
	}
	public List<player> getAllplayers() throws Exception{
		List<player> li=new ArrayList<player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from player");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new player(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9)));
			
		}
		return li;
		
	}public player getplayerById(int id) throws Exception {
		player p=new player();
		List<player> li=getAllPlayers();
		for(player p1:li) {
			if(p1.getPlayer_id() == id) {
				p.setPlayer_id(id);
				p.setName(p1.getName());
				p.setDateOfBirth(p1.getDateOfBirth());
				p.setNationality(p1.getNationality());
				p.setSkills(p1.getSkills());
				p.setRuns(p1.getRuns());p.setWickets(p1.getWickets());
				p.setNumber_of_matches(p1.getNumber_of_matches());
				p.setTeam_id(p1.getTeam_id());
			}
		}
		
		return p;
	}

}
