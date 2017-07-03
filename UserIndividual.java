import java.awt.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;
public class UserIndividual extends JFrame{
	Connection con=null;
	ResultSet r=null;
	PreparedStatement pstm;
	private JButton jButton1,jButton2,jButton3,jButton4;
	private JLabel jLabel1,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14,jLabel15,jLabel16,jLabel17,jLabel19,jLabel2,jLabel20,jLabel21,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9;
	private JPanel jPanel1,jPanel2,jPanel3;
	private JTextField jTextField1,jTextField10,jTextField11,jTextField12,jTextField13,jTextField14,jTextField15,jTextField16,jTextField17,jTextField18,jTextField19,jTextField2,jTextField20,jTextField21,jTextField22,jTextField3,jTextField4,jTextField5,jTextField6,jTextField7,jTextField8,jTextField9;
	private JLabel lbl_img1;
	public UserIndividual() {
		// TODO Auto-generated constructor stub
		initComponents();
		con=dbconnect.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
                size.height / 2 - getHeight() / 2);
        setResizable(false);
        setTitle("Student Information System");

	}

}
