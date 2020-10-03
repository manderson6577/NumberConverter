
public class Hex {
	
	public void convertHextoDecimal (String hex) {
		String hstring ="0123456789ABCDEF";
		hex = hex.toUpperCase();
		int num = 0;
		for (int i = 0; i < hex.length(); i++) {
			char ch = hex.charAt(i);
			int n = hstring.indexOf(ch);
			num = 16*num + n;
		}
		System.out.println(num);
	}
	
	public void convertHextoBinary (char hex[]) {
		String ans = "";
		int lim = hex.length;
		int i = 0;
			while  (i < lim) {
				switch (hex[i]) {
				case '0':
					ans = ans + "0000";
					break;
				case '1':
					ans = ans + "0001";
					break;
				case '2':
					ans = ans + "0010";
					break;
				case '3':
					ans = ans + "0011";
					break;
				case '4':
					ans = ans + "0100";
					break;
				case '5':
					ans = ans + "0101";
					break;
				case '6':
					ans = ans + "0110";
					break;
				case '7':
					ans = ans + "0111";
					break;
				case '8':
					ans = ans + "1000";
					break;
				case '9':
					ans = ans + "1001";
					break;
				case 'A':
				case 'a':
					ans = ans + "1010";
					break;
				case 'B':
				case 'b':
					ans = ans + "1011";
					break;
				case 'C':
				case 'c':
					ans = ans + "1100";
					break;
				case 'D':
				case 'd':
					ans = ans + "1101";
					break;
				case 'E':
				case 'e':
					ans = ans + "1110";
					break;
				case 'F':
				case 'f':
					ans = ans + "1111";
					break;
				default: System.out.println("Invalid Hex number at position :" + hex[i]);
				}
				i++;
	
		}
		System.out.println(ans);
		
	}

}
