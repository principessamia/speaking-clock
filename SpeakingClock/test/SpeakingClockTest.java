import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SpeakingClockTest {
	
	private SpeakingClock clock;
	
	@Before
	public void setUp() {
		clock = new SpeakingClock();
	}

	@Test
	public void testMidnightSysTimeToEnglish() {
		String englishTime = clock.convert("00:00");
		Assert.assertEquals("midnight", englishTime);
	}
	
	@Test
	public void testMiddaySysTimeToEnglish() {
		String englishTime = clock.convert("12:00");
		Assert.assertEquals("midday", englishTime);
	}
	
	@Test
	public void testBetweenTenAndTwentyMins() {
		String englishTime = clock.convert("10:12");
		Assert.assertEquals("ten twelve in the morning", englishTime);
	}
	
	
	@Test
	public void testLessThanTenMins() {
		String englishTime = clock.convert("10:04");
		Assert.assertEquals("ten oh four in the morning", englishTime);	
	}
	
	
	@Test
	public void testGreaterThanTwentyMins() {
		String englishTime = clock.convert("10:36");
		Assert.assertEquals("ten thirty six in the morning", englishTime);	
	}
	
	@Test
	public void testMorningOClock() {
		String englishTime = clock.convert("10:00");
		Assert.assertEquals("ten o'clock in the morning", englishTime);	
	}
	
	@Test
	public void testMidnightAndMins() {
		String englishTime = clock.convert("00:12");
		Assert.assertEquals("twelve twelve in the morning", englishTime);	
	}
	
	@Test
	public void test24hAndMins() {
		String englishTime = clock.convert("15:09");
		Assert.assertEquals("three oh nine in the afternoon", englishTime);	
	}
	
	@Test
	public void test24hOClock() {
		String englishTime = clock.convert("21:00");
		Assert.assertEquals("nine o'clock in the evening", englishTime);	
	}
	
	@Test
	public void testMinute() {
		String minutes = Minute.convert(12);
		Assert.assertEquals("twelve", minutes);
	}
	
	@Test
	public void testHour() {
		String minutes = Hour.convert(0);
		Assert.assertEquals("twelve", minutes);
	}
	
}

