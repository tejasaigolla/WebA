package com.ltts.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import com.ltts.configuration.MyConnection;
import com.ltts.model.team;

public class TeamDao {
	public List<team> getAllTeams(){
		List<team> li=new ArrayList<team >();
		
		return li;
		}
	public team getTeamById(int id) {
		team t = new team();
			
		return t;
	}
	public boolean insertTeam(team t) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into team values(?,?,?,?)");
		ps.setInt(1,t.getTeam_id());
		ps.setString(2, t.getTeamname());
		ps.setString(3, t.getOwnername());
		ps.setString(4, t.getCoachname());
		return ps.execute();
}
}
	
	