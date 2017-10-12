import org.junit.Test;

public class TestRomanNumerals {

	@Test(expected = Exception.class)
	public void testFiveCanNotBeRepeated() throws Exception {
		RomanNumerals.convertToInteger("VV");
	}

	@Test(expected = Exception.class)
	public void testFiftyCanNotBeRepeated() throws Exception {
		RomanNumerals.convertToInteger("LL");
	}

	@Test(expected = Exception.class)
	public void testFiveHundredCanNotBeRepeated() throws Exception{
		RomanNumerals.convertToInteger("DD");
	}

	@Test(expected = Exception.class)
	public void testOneCanNotBeRepeated4Times() throws Exception{
		RomanNumerals.convertToInteger("IIII");
	}

	@Test(expected = Exception.class)
	public void testTenCanNotBeRepeated4Times() throws Exception{
		RomanNumerals.convertToInteger("XXXX");
	}

	@Test(expected = Exception.class)
	public void testHundredCanNotBeRepeated4Times() throws Exception{
		RomanNumerals.convertToInteger("CCCC");
	}

	@Test(expected = Exception.class)
	public void testThousandCanNotBeRepeated4Times() throws Exception{
		RomanNumerals.convertToInteger("MMMM");
	}
}
