
public class Minute {

	public static String convert(Integer minute) {
		
		StringBuffer englishMinutes = new StringBuffer();
		
		if(minute == 0) {
			englishMinutes.append("o'clock");
		}
		else {
			
			if(minute > 0 && minute < 10) {
				englishMinutes.append("oh ");
			}
			
			if(minute > 20) {
				int remainder = minute % 10;
				int factorOfTen = minute - remainder;
				englishMinutes.append(TimeUnit.numberToWord.get(factorOfTen)).append(" ");
				minute = remainder;
			}
			
			englishMinutes.append(TimeUnit.numberToWord.get(minute));
			
		}
		
		
		return englishMinutes.toString();
	}



}
