package payment;

import java.sql.Timestamp;
import java.util.Date;
import staff.Staff;

public class PaymentManager {
	
	
	Staff staff = new Staff();
	public Payment createPayment (Payment payment)
	{
		int paymentID = payment.getPaymentID();
		payment.setPaymentID(paymentID);
		
		Timestamp date = payment.getTransactionDate();
		payment.setTransactionDate(date);
		
		String name = staff.getRecordedBy();
		payment.setRecordedBy(name);
		return payment;
	}
	

}
