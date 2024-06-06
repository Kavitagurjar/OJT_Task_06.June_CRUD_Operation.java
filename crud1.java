package crud;
import java.sql.*;

public class crud1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {		
		
				// TODO Auto-generated method stub
				//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//				Class.forName("com.mysql.cj.jdbc.Driver");
//					
//					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
//				
//				System.out.println("Connection Done");
//				
//				
//				Statement st = conn.createStatement();
//				ResultSet rs = st.executeQuery("show databases");
//				System.out.println("database are:"+rs);
//				while(rs.next()){
//					System.out.println(rs.getString(1));
//			}

				
		
				
//				SECOND METHOD
//		
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
////		Remove this Driver when We get error
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url = "jdbc:mysql://localhost:3306";
//		String user ="root";
//		String pass="";
//		Connection conn=DriverManager.getConnection(url,user,pass);
//		System.out.println("Connected"+conn);
//		Statement st =conn.createStatement();
//		ResultSet rs = st.executeQuery("show databases");
//		System.out.println("databases are:"+rs);
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
		
		
		
		
//	3rd Create  DataBase

	
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url = "jdbc:mysql://localhost:3306";
//		String user="root";
//		String pass="";
//		Connection conn =DriverManager.getConnection(url,user,pass);
//		System.out.println("Connected:"+conn);
//		Statement st = conn.createStatement();
//		ResultSet rs =st.executeQuery("show databases");
//		System.out.println("database Done");		
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
		
		
		
//	Create Table

		
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/aditdb","root","");
//	String sql ="Create table adit(name varchar(30), address varchar(100) ,age int)";
//	Statement st = conn.createStatement();
//	st.executeUpdate(sql);
//	System.out.println("Table Created");
	
	
	
	
	
//	INSERT DATA
	
//	String sqll = "Insert into adit values('Ramakant', 'Bareilly',22)";
//	Statement st = conn.createStatement();
//	st.executeUpdate(sqll);
//	System.out.println("Data Inserted");
//	String sql = "select * from adit";
//	Statement trail = conn.createStatement();
//	ResultSet res = trail.executeQuery(sql);
//	while(res.next()) {
//		System.out.println(res.getString("name") +  "-" + res.getString("address")+ "-"+ res.getString("age"));
//	}

	
	
//	DELETE QUERY
	
	String kav = "delete from adit where name = 'Kunjesh'";
	Statement sttt = conn.createStatement();
	 sttt.executeUpdate(kav);
	System.out.println("Deleted");
	
	
		
				
				
				
		}}

		
		
		
		
		

	


