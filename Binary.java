
public class Binary {
	
	public int convertBintoDecimal (String bin) {
		int binNum= Integer.parseInt(bin);
		int decimal = 0;
	    int i = 0;
	    while(true){
	      if(binNum == 0){
	        break;
	      } else {
	          int temp = binNum%10;
	          decimal += temp*Math.pow(2, i);
	          binNum = binNum/10;
	          i++;
	       }
	    }
	   // System.out.println(decimal);
	    return decimal;
	}
	public void convertBintoHex (String bin) {
		int i =	convertBintoDecimal(bin);
		Decimal convert = new Decimal();
		String DtoHconv = String.valueOf(i);
		convert.convertDecimaltoHex(DtoHconv);

	}

}
