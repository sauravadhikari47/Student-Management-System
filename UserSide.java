import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class UserSide extends JFrame{
	Connection con;
	ResultSet r;
	PreparedStatement pstm;
	String sql;
	JPanel jpanel1,jpanel2,jpanel3,jpanel4;
	JLabel lbl;
	JButton jButton1,jButton2,jButton3,jButton4;
	JScrollPane jScrollPanel;
	
	public UserSide() {
		// TODO Auto-generated constructor stub
		con= Settings.getDBCOnnection();
		Toolkit tk=this.getToolkit();
		Dimension size=tk.getScreenSize();
		this.setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
		this.setResizable(false);
		this.setTitle("Student Management System");
		
	}
	private void updateTable(){
		try{
			sql="SELECT * FROM infoTable";
			pstm=con.prepareStatement(sql);
			r=pstm.executeQuery();
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			
		}
	}
	jpanel1=

}
