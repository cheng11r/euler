
public class Euler19 {

	public static void main(String[] args) {
		
		int sundays = 0, sundayparts = 2;	
		int days = 0, month, year;
		
		for(year = 1901; year < 2001; year++) {
			for(month = 1; month <= 12; month++) {
				if(month == 2) {
					if(year % 4 == 0 && (year % 100 == 0 ? year % 400 == 0 : true)) {
						for(days = 1; days <= 29; days++) {
							sundayparts += 1;
							if(days == 1 && sundayparts % 7 == 0) sundays++;
						}
					}
					else {
						for(days = 1; days <= 28; days++) {
							sundayparts += 1;
							if(days == 1 && sundayparts % 7 == 0) sundays++;
						}
					}
					
				}
				else if(month == 9 || month == 4 || month == 6 || month == 11) {
					for(days = 1; days <= 30; days++) {
						sundayparts += 1;
						if(days == 1 && sundayparts % 7 == 0) sundays++;
					}
				} else {
					for(days = 1; days <= 31; days++) {
						sundayparts += 1;
						if(days == 1 && sundayparts % 7 == 0) sundays++;
					}
				}
			}
			days = 0;
		}
		System.out.println(sundays);
		System.out.println(sundayparts);
	}

}
