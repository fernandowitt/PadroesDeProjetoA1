package Validadores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidadorData implements Validador{
	
	protected Date data;
	protected Date dataMin;
	protected Date dataMax;
	
	

	public ValidadorData(String data) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		this.data = (Date) formatter.parse(data);
		
		SimpleDateFormat formatterMin = new SimpleDateFormat("dd-MM-yyyy");
		this.dataMin = (Date) formatterMin.parse("01-01-1900");
		
		SimpleDateFormat formatterMax = new SimpleDateFormat("dd-MM-yyyy");
		this.dataMax = (Date) formatterMax.parse("01-01-2200");
	}
	
	public boolean isValid() {
		if(data.compareTo(dataMin) > 0 && data.compareTo(dataMax) < 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
