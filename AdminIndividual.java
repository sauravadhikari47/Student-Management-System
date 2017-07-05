import java.awt.*;
import java.io.*;
import java.sql.*;

import javax.swing.*;

public class AdminIndividual extends JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstm = null;
	private JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7;
	private JLabel jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18,
			jLabel19, jLabel2, jLabel20, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9,lbl_img, lbl_img1;
	private JPanel jPanel1, jPanel2;
	private JTextField jTextField1, jTextField10, jTextField11, jTextField12, jTextField13, jTextField14, jTextField15,
			jTextField16, jTextField17, jTextField18, jTextField19, jTextField2, jTextField20, jTextField21,
			jTextField22, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7, jTextField8, jTextField9;
	private ImageIcon format=null;
	String filename=null;
	byte[] person_image=null;

	public AdminIndividual() {
		// TODO Auto-generated constructor stub
		initComponents();
		con = dbconnect.java_db();
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
		setResizable(false);
		setTitle("Student Management System");
	}

	private void initComponents() {
		jButton1 = new JButton();
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		jTextField1 = new JTextField();
		jButton2 = new JButton();
		jButton3 = new JButton();
		jButton4 = new JButton();
		jButton5 = new JButton();
		jButton7 = new JButton();
		jPanel2 = new JPanel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jTextField2 = new JTextField();
		jTextField3 = new JTextField();
		jLabel4 = new JLabel();
		jTextField4 = new JTextField();
		jLabel5 = new JLabel();
		jTextField5 = new JTextField();
		jButton6 = new JButton();
		jTextField6 = new JTextField();
		jLabel7 = new JLabel();
		jLabel8 = new JLabel();
		jTextField7 = new JTextField();
		jLabel9 = new JLabel();
		jTextField8 = new JTextField();
		jLabel10 = new JLabel();
		jTextField9 = new JTextField();
		jLabel11 = new JLabel();
		jTextField10 = new JTextField();
		jLabel12 = new JLabel();
		jTextField11 = new JTextField();
		jLabel13 = new JLabel();
		jTextField12 = new JTextField();
		jLabel14 = new JLabel();
		jTextField13 = new JTextField();
		jLabel15 = new JLabel();
		jTextField14 = new JTextField();
		jLabel16 = new JLabel();
		jLabel17 = new JLabel();
		jLabel18 = new JLabel();
		jLabel19 = new JLabel();
		jLabel20 = new JLabel();
		jTextField15 = new JTextField();
		jTextField16 = new JTextField();
		jTextField17 = new JTextField();
		jTextField18 = new JTextField();
		jTextField19 = new JTextField();
		jTextField20 = new JTextField();
		jTextField21 = new JTextField();
		jTextField22 = new JTextField();
		jLabel6 = new JLabel();
		lbl_img = new JLabel();
		lbl_img1 = new JLabel();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}

}
