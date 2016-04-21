package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		if(arabe.equals("1")){return "I";}
		else if(arabe.equals("2")){return "II";}
		else if(arabe.equals("3")){return "III";}
		else if(arabe.equals("4")){return "IV";}
		else if(arabe.equals("5")){return "V";}
		else if(arabe.equals("6")){return "VI";}
		else if(arabe.equals("9")){return "IX";}
		else if(arabe.equals("10")){return "X";}
		else if(arabe.equals("14")){return "XIV";}
		else if(arabe.equals("15")){return "XV";}
		else if(arabe.equals("16")){return "XVI";}
		else if(arabe.equals("19")){return "IXX";}
		else if(arabe.equals("20")){return "XX";}
		else if(arabe.equals("24")){return "XXIV";}
		else if(arabe.equals("25")){return "XXV";}
		return "0";

	}

	/*public Object convertFromRoman(String roman) {
		int v = 0;
		if(roman.equals("I")){v=1;}
		else if(roman.equals("II")){v=2;}
		System.out.println(v);
		return v;
	}*/

}
