
public class Decimal {
	
	public void convertDecimaltoHex (String dec) {
		int rem;
		String answer="";
		int decnum= Integer.parseInt(dec);
		char hex[] = {'0', '1', '2', '3','4','5','6','7','8','9','A','B','C','D','E','F'};
 		while (decnum > 0) {
 			rem = decnum%16;
 			answer = hex[rem] + answer;
 			decnum=decnum/16;
 		}
			System.out.println(answer);
	}
	public void convertDecimaltoBin (String dec) {
		int holder;
		holder = Integer.parseInt(dec);
		int binary[] = new int[40];
		int index = 0;
		while (holder > 0) {
			binary[index++] = holder%2;
			holder = holder/2;
		}
		for (int i = index -1; i >=0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println("");
 		
	}
}
