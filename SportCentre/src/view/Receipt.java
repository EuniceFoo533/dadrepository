package view;

import database.Databases;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.*;

import java.sql.*;

public class Receipt extends JFrame {

	private JPanel contentPane;
	Databases db = new Databases();
	Connection conn = db.getConnection();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt frame = new Receipt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Receipt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(900,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();

		contentPane.add(textArea, BorderLayout.CENTER);
		
		try 
		{
			// Retrieve customer name
			String customerName ="SELECT * FROM booking WHERE `customer_name`=(SELECT max(`customer_name`) FROM booking);";
			PreparedStatement stmtName = conn.prepareStatement(customerName);
			ResultSet rsCustomerName = stmtName.executeQuery();
			
			// Retrieve court ID
			String courtID ="SELECT * FROM booking WHERE `court_id`=(SELECT max(`court_id`) FROM booking);";
			PreparedStatement stmtCourt = conn.prepareStatement(courtID);
			ResultSet rsCourtID = stmtCourt.executeQuery();
			
			//Retrieve duration
			String duration ="SELECT * FROM booking WHERE `hour`=(SELECT max(`hour`) FROM booking);";
			PreparedStatement stmtDuration = conn.prepareStatement(duration);
			ResultSet rsDuration = stmtDuration.executeQuery();
			
			// Retrieve total payment
			String amount ="SELECT * FROM booking WHERE `amount`=(SELECT max(`amount`) FROM booking);";
			PreparedStatement stmtPayment = conn.prepareStatement(amount);
			ResultSet rsAmount = stmtPayment.executeQuery();
			
			// Retrieve Date
			String dateBooking ="SELECT * FROM booking WHERE `date`=(SELECT max(`date`) FROM booking);";
			PreparedStatement stmtDate = conn.prepareStatement(dateBooking);
			ResultSet rsDate = stmtDate.executeQuery();
			
			// Retrieve Confirm By
			String cashierName ="SELECT admin.name FROM booking JOIN admin ON booking.admin_id=admin.id WHERE booking.admin_id=(SELECT max(`admin_id`) FROM booking);";
			PreparedStatement stmtCashier = conn.prepareStatement(cashierName);
			ResultSet rsCName = stmtCashier.executeQuery();
			
			while(rsCustomerName.next() && rsCourtID.next() && rsDuration.next() && rsAmount.next() && rsDate.next() && rsCName.next())
			{
				JTextArea textArea1
				= new JTextArea("\n***********************************\n\tReceipt\n***********************************"
						+ "\nCustomer Name\t: " + rsCustomerName.getString(2)
						+ "\nCourt ID\t\t: " + rsCourtID.getString(6)
						+ "\nDuration\t\t: " + rsDuration.getInt(3) + " hour"
						
						+ "\nTotal Payment\t\t: RM " + rsAmount.getBigDecimal(4)
						+ "\nDate\t\t: " + rsDate.getDate(5)
						+"\nConfirmed By\t\t: " + rsCName.getString(1) );
				
				Font f = new Font("Tahoma",Font.PLAIN, 25);
				textArea1.setFont(f);
				contentPane.add(textArea1,BorderLayout.CENTER);
				textArea1.setEditable(false);
						
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
