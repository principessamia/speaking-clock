
public class SpeakingClock {

	public String convert(String systemTime) {
		
		StringBuffer englishTime = new StringBuffer();
		
		String[] hoursAndMins = systemTime.split(":");
		Integer hours = Integer.parseInt(hoursAndMins[0]);
		Integer mins = Integer.parseInt(hoursAndMins[1]);
		
		englishTime.append(handleMidnightMidday(hours, mins));
		
		if("".equals(englishTime.toString())) {
			
			englishTime.append(Hour.convert(hours)).append(" ");
			englishTime.append(Minute.convert(mins)).append(" ");
			englishTime.append(addTimeOfDay(hours));
		}
		return englishTime.toString();

	}


	private String addTimeOfDay(Integer hours) {
		if(hours >= 0 && hours < 12) {
			return "in the morning";
		}
		else if(hours >= 12 && hours < 17) {
			return "in the afternoon";
		}
		else {
			return "in the evening";
		}
	}

	
	
	
	private String handleMidnightMidday(Integer hours, Integer mins) {
		
		String englishTime = "";
		if(hours == 0 && mins == 0) {
			englishTime = "midnight";		
		}
		if(hours == 12 && mins == 0) {
			englishTime = "midday";
		}
		return englishTime;
	}

}
