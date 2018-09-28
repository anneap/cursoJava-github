package aplicacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Aula74 {

	public static void main(String[] args) throws ParseException {
		//formatar data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//recuperar data do sistema
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		
		Date y1 = sdf.parse("25/06/2018");
		
		
		Date y2 = sdf1.parse("25/06/2018 15:42:07");
		//ISO 8601
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(y1));
		System.out.println(sdf1.format(y2));
		System.out.println("Data ISO 8601: "+sdf1.format(y3));
		System.out.println("Data Agora: "+ sdf1.format(x1));
		System.out.println("Data Agora teste: "+ sdf1.format(x2));
		System.out.println("Data Inicial: " + sdf1.format(x3));
		
		
				

	}

}
