
public class RomanNumerals {
	public static int convertToInteger(String romanNum) throws Exception {

		Character currentChar;
		Character previousChar = ' ';
		Character prePreviousChar = ' '; // this is only eliminating cases like "IIII"
		Character prePrePreviousChar = ' '; // this is only eliminating cases like "IIII"
		int currentNumber;
		int totalNumber = 0;

		for(int i=0;i<romanNum.length(); i++) {
			currentChar = romanNum.charAt(i);

			switch (currentChar) {
				case 'I': currentNumber = 1; break;
				case 'V': currentNumber = 5; break;
				case 'X': currentNumber = 10; break;
				case 'L': currentNumber = 50; break;
				case 'C': currentNumber = 100; break;
				case 'D': currentNumber = 500; break;
				case 'M': currentNumber = 1000; break;
				default: throw new Exception();
			}

			if (previousChar.equals('I') && currentChar.equals('V')) { // IV case
				currentNumber = 3;
			}

			if (previousChar.equals('V') && currentChar.equals('V')) { // V can not be repeated
				throw new Exception();
			}

			if (previousChar.equals('I') && currentChar.equals('X')) { // IX case
				currentNumber = 8;
			}

			if(previousChar.equals('X') && currentChar.equals('L')) { // XL case
				currentNumber = 30;
			}

			if ( previousChar.equals('L') && currentChar.equals('L')) { // L can not be repeated
				throw new Exception();
			}

			if(previousChar.equals('X') && currentChar.equals('C')) { // XC case
				currentNumber = 80;
			}

			if(previousChar.equals('C') && currentChar.equals('D')) { // CD case
				currentNumber = 300;
			}

			if ( previousChar.equals('D') && currentChar.equals('D')) { // D can not be repeated
				throw new Exception();
			}

			if(previousChar.equals('C') && currentChar.equals('M')) { // CM case
				currentNumber = 800;
			}

			if(prePrePreviousChar.equals(prePreviousChar) && prePreviousChar.equals(previousChar)
					&& previousChar.equals(currentChar)) {
				throw new Exception();
			}

			totalNumber += currentNumber;
			prePrePreviousChar = prePreviousChar;
			prePreviousChar = previousChar;
			previousChar = currentChar;
		}

		return totalNumber;
	}
}
