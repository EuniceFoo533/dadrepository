/**
 * 
 */
package lab02.rounding;
import java.text.DecimalFormat;
/**
 * @author EuniceFoo
 *
 */
public class RoundingManager 
{
	/**
	 * This method calculates percentage from dividend and divisor
	 * @param dividend
	 * @param divisor
	 * @return value in percentage
	 */
	
	public double calculatePercentage(int dividend, int divisor) 
	{
		
		double percentage = ((double)dividend/ (double)divisor)*100;
		return percentage;
		
	}
	
	public String roundValue(double value,int decimalPoints) {
		
		String decimalPlaces = ".";
		
		for (int counter = 0; counter< decimalPoints; counter++) 
			decimalPlaces += "0";
		
		if(decimalPoints == 0)
			decimalPlaces = "";
		
		DecimalFormat formatter = new DecimalFormat("###" + decimalPlaces);
		String result = formatter.format(value);
		
		return result;
		
	}

}
