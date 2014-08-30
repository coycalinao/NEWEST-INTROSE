/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseCodes;
import ProgramCodes.Admin;
import ProgramCodes.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Jan
 */
public class StudentDAO {
    Connection connection = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	private Connection getConnection() throws SQLException {
            Connection conn;
            conn = ConnectionFactory.getInstance().getConnection();
            return conn;
	}
        
        public Student getStudent(String i){
            Statement x = null;
            ResultSet b = null;    
            Student a = new Student();
            try{
                connection = getConnection();
                System.out.println("1");
                x = connection.createStatement();
                System.out.println("11");
                b = x.executeQuery("SELECT * FROM STUDENT WHERE idStudent = '"+ i +"' ");
                if(b.wasNull()){
                    System.out.println("x");
                }
                else{
                    System.out.println(b.getString(1));
                    a.setIdNum( b.getString(1) );
                    a.setLastName(  b.getString(4));
                    a.setFirstName(  b.getString(2));
                    a.setMidName(  b.getString(3));
                    a.setGender(  b.getString(5));
                    a.setDOB(  b.getString(6));
                    a.setGradeLvl(  b.getInt(7));
                }
            }catch(SQLException g){
            }
            return a;
        }
        
        public ArrayList<String> getStudents(){
            ArrayList<String> s = new ArrayList();
            Statement st = null;
            try{
                connection = getConnection();
                st = connection.createStatement();
                rs = st.executeQuery("SELECT * FROM STUDENT");
                while(rs.next()){
                    s.add(rs.getString("idStudent"));
                }
            }catch(SQLException e){
                System.out.println(e.getMessage() + e.getErrorCode());
            }
            return s;
        }
        
        public ArrayList<String> getStudents(int x){
            ArrayList<String> s = new ArrayList();
            Statement st = null;
            try{
                connection = getConnection();
                st = connection.createStatement();
                rs = st.executeQuery("SELECT * FROM STUDENT WHERE yearLevelSt = "+x+"");
                while(rs.next()){
                    s.add(rs.getString("lastNameSt"));
                }
            }catch(SQLException e){
                System.out.println(e.getMessage() + e.getErrorCode());
            }
            return s;
        }
        
        public String getStudentID(String x){
            Statement st = null;
            String a = "";
            try{
                connection = getConnection();
                st = connection.createStatement();
                rs = st.executeQuery("SELECT idStudent FROM STUDENT WHERE lastNameSt LIKE '"+x+"%'");
                while(rs.next())
                    a = rs.getString("idStudent");
            }catch(SQLException e){
                System.out.println(e.getMessage() + e.getErrorCode());
            }
            return a;
        }
        
        //
}
