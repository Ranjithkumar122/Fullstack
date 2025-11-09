package EmployeeDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Connector.Getcon;
import employeeDTO.Employee;
public class EmployeeImpl implements EmployeeDao {

	@Override
	public int addEmployee(Employee emp) {
		int row=0;
		
		try {
			String query="insert into employee1 values(?,?,?,?)";
			Connection con=Getcon.getconnection();
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2,emp.getName());
			pstmt.setString(3,emp.getEmail());
			pstmt.setString(4, emp.getAddress());
			row=pstmt.executeUpdate();
			System.out.print("welcome");
			System.out.print("welcome");
			System.out.print("welcome");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return row;
	}

}
