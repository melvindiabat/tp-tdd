package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1() {
		testConvertToRoman("1", "I");
	}

	@Test
	public void should_return_II_when_2() {
		testConvertToRoman("2", "II");

	}

	@Test
	public void should_return_III_when_3() {
		testConvertToRoman("3", "III");

	}

	@Test
	public void should_return_IV_when_4() {
		testConvertToRoman("4", "IV");

	}

	@Test
	public void should_return_V_when_5() {
		testConvertToRoman("5", "V");

	}

	@Test
	public void should_return_VI_when_6() {
		testConvertToRoman("6", "VI");

	}

	@Test
	public void should_return_IX_when_9() {
		testConvertToRoman("9", "IX");

	}

	@Test
	public void should_return_X_when_10() {
		testConvertToRoman("10", "X");

	}

	@Test
	public void should_return_XIV_when_14() {
		testConvertToRoman("14", "XIV");

	}

	@Test
	public void should_return_XV_when_15() {
		testConvertToRoman("15", "XV");

	}

	@Test
	public void should_return_XVI_when_16() {
		testConvertToRoman("16", "XVI");

	}

	@Test
	public void should_return_IXX_when_19() {
		testConvertToRoman("19", "IXX");
	}

	@Test
	public void should_return_XX_when_20() {
		testConvertToRoman("20", "XX");
	}

	@Test
	public void should_return_XXIV_when_24(){
		testConvertToRoman("24", "XXIV");
	}

	@Test
	public void should_return_XXVI_when_26() {
		testConvertToRoman("26", "XXVI");
	}

	@Test
	public void should_return_IXXX_when_29() {
		testConvertToRoman("29", "IXXX");
	}

	@Test
	public void should_return_XXX_when_30() {
		testConvertToRoman("30", "XXX");
	}

	@Test
	public void should_return_XXXIV_when_34() {
		testConvertToRoman("34", "XXXIV");

	}

	public void should_return_XXXV_when_35() {
		testConvertToRoman("35", "XXXV");

	}

	private void testConvertToRoman(String input, String expected) {
		RomanNumerals romanNumeral = new RomanNumerals();
		String actual = romanNumeral.convertToRoman(input);
		Assert.assertEquals(expected, actual);
	}

}
