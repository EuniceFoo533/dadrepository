package payment;

import java.io.Serializable;
import java.sql.Timestamp;

import staff.Staff;

public class Payment extends Staff implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int paymentId;
	private Timestamp transactionDate;
	private Staff recordedBy;
	
	public Payment() 
	{
		
		
	}
	
	public void setPaymentID (int paymentId)
	{
		this.paymentId = paymentId;
	}
	
	public int getPaymentID ()
	{
		return paymentId;
	}
	
	public void setTransactionDate (Timestamp transactionDate)
	{
		this.transactionDate = transactionDate;
	}
	
	public Timestamp getTransactionDate()
	{
		return transactionDate;
	}
	
	public void setRecordedBy(Staff recordedBy)
	{
	 
	   super.name = name;
	}
	
	public String getRecordedBy()
	{
		return super.name;
	}
	
	
	

}
