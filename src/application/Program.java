package application;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sfd1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sfd2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date y1 = sfd1.parse("25/06/2018");
		Date y2 = sfd2.parse("25/06/2018 15:42:07");

		System.out.println("y1 : " + sfd1.format(y1));
		System.out.println("y2 : " + sfd2.format(y2));

		System.out.println(y1);
		System.out.println(y2);

	}
}