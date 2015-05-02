/*
 * Formatter.java
 *
 * Created on 8 de Fevereiro de 2007, 17:01
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package core.helpers;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author lucredio
 */
public class Formatter {
	public static String formatSimpleDate(Date date) {
		if (date == null)
			return "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}

	public static String formatDateTime(Date dateTime) {
		if (dateTime == null)
			return "";
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
		return sdf.format(dateTime);
	}

	public static String formatCurrency(double number) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(number);
	}
}
