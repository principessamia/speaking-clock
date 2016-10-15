
public class Hour {

	public static String convert(Integer hour) {
		
		if(hour > 12) {
			hour = hour - 12;
		}
		
		return TimeUnit.numberToWord.get(hour);

		
	}

}
