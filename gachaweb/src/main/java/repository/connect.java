package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import value.ID;
import value.Name;
import value.Rerity;

public class connect {
	
	public static List<entity.Character> connection() {
		List<entity.Character> charalist = new ArrayList<entity.Character>();
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
 
	    try {
	    	Class.forName("com.mysql.jdbc.Driver").newInstance();

	      con = DriverManager.getConnection(
	        "jdbc:mysql://localhost:3306/gacha",
	        "root",
	        "Y0u3m0e3"
	      );// "password"の部分は，各自の環境に合わせて変更してください。

	      pstmt = con.prepareStatement("select * from characterinfo ");

	      rs = pstmt.executeQuery();

	      while (rs.next()) {
	    	ID rsid = new ID(rs.getInt("id"));
	    	Rerity rsrerity = new Rerity(rs.getString("rerity"));
	    	Name rsname = new Name(rs.getString("name"));
	    	
	    	entity.Character rschara = new entity.Character(rsid, rsrerity, rsname);
	    	
	    	charalist.add(rschara);
	        //System.out.println(rs.getInt("id"));
	        //System.out.println(rs.getString("rerity"));
	        //System.out.println(rs.getString("name"));
	      }

	    } catch (SQLException e) {
	      e.printStackTrace();
	    } catch (InstantiationException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
	      if (rs != null) {
	        try {
	          rs.close();
	        } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	      if (pstmt != null) {
	        try {
	          pstmt.close();
	        } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	      if (con != null) {
	        try {
	          con.close();
	        } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	    }
	    return charalist;
	  }
	
	//public List<entity.Character> getcharalist(){
		//return charalist;
//}
	
}

