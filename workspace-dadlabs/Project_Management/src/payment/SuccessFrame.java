package payment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JButton;
import parcel.ParcelSlipFrame;

public class SuccessFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblServerText;
	/**
	 * Create the frame.
	 */
	public SuccessFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("YOUR TRANSACTION HAS BEEN APPROVED");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("THANK YOU FOR USING OUR SERVICE <3");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setMaximumSize(new Dimension(20, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ParcelSlipFrame psf = new ParcelSlipFrame();
				psf.setVisible(true);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnClose, BorderLayout.SOUTH);
	}
	
	public void updateServerText(String serverText) 
	{
		this.lblServerText.setText(serverText);	
	}
	
	public void updateConnectionStatus (boolean connStatus) 
	{
		// Default status. Assuming for the worst case scenario.
		String status = "No connection to server.";
		
		// Validate status of connection
		if (connStatus)
			status = "Connection has established.";
	}

}
