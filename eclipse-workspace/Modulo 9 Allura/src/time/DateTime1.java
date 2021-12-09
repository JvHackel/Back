package time;

import java.time.*;
import java.time.temporal.*;
import java.util.Date;

public class DateTime1 {
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		LocalTime d2 = LocalTime.now();
		LocalTime d3 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		
		LocalTime d4 = LocalTime.of(12, 00);
		
		LocalDateTime d5 = LocalDateTime.of(2012, 12, 25, 20, 00);
		
		System.out.println(d1);   System.out.println(d2);    System.out.println(d3);  	System.out.println(d4); 
		System.out.println(d5);
		
		// extraindo pedacos da data basta usar o get: 
		
		LocalDateTime ldt = LocalDateTime.of(2012, 12, 25, 20, 00);
		System.out.println(ldt.getDayOfMonth());
		
		// Além desses métodos, temos um método get(), que recebe como parâmetro uma implementação  o ChronoField, e retorna um inteiro.
 
		// errando System.out.println(ldt.get(ChronoField.DAY_OF_YEAR));
		
		//  ------------------ COMPARANDO DATAS AULA 2 ------------------	
		System.out.println( d2.isAfter(d3));
		
		MonthDay d6 = MonthDay.of(12, 2);   // tambem podemos criar assim
		MonthDay d7 = MonthDay.of(12, 3);
		
		System.out.println(d6.isAfter(d7));
		
	//  ------------------ Alterando  ------------------
	     	
		LocalDate d8 = LocalDate.now();
		
		LocalDate d9 = d8.withYear(2020);   // Ao modificar estamos criando um novo objeto o mesmo que ocorre em String
		System.out.println(d9);
		
		LocalDate d10 = d9.plusDays(2);
		System.out.println(d10);
		
		
		LocalDate d11 = d9.plusDays(365).minusDays(364);
		System.out.println(d11);
		
	//  ------------------ Extraindo ------------------
		
		LocalDateTime dt12 = LocalDateTime.now();
		LocalDate d13 = dt12.toLocalDate();
		LocalTime d14 = dt12.toLocalTime();
		
		System.out.println(dt12);
		System.out.println(d13);
		System.out.println(d14);
		
		
		// ------------------ Instant ------------------
		
		Date d20 = new Date();
		Instant i = d20.toInstant();
		
		System.out.println(i);
		
		
	}
}