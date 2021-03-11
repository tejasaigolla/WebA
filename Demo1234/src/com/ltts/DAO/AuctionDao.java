package com.ltts.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltts.configuration.MyConnection;
import com.ltts.model.Auction;



public class AuctionDao {
	
	public boolean insertAuction(Auction a) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into auction values(?,?,?,?,?)");
		ps.setInt(1, a.getAuction_id());
		ps.setInt(2, a.getPlayer_id());
		ps.setInt(3, a.getTeam_id());
		ps.setInt(4,a.getYear());
		ps.setInt(5, a.getAmount());

		return ps.execute();
		//return false;

		
	}

}