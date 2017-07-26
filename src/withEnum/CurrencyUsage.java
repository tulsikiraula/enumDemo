package withEnum;

public class CurrencyUsage {

	public static void main(String[] args) {
      
		Currency currency=Currency.COIN;
		
		switch(currency){
		case PENNY:
		   System.out.println("Penny coin");
		    break;
		case COIN:
		 System.out.println("coin");
	    break;
		case QUARTER:
		 System.out.println("quarter coin");
	    break;
		default :
		 System.out.println("invalid coin");

		}
		if(currency==Currency.QUARTER)
			System.out.println("matched");
		else
			System.out.println("does not match");

		System.out.println(currency.getX());
		System.out.println(currency.getDesc());
		
	   //implicit values method created by compiler for enum holds list of constants
		for(Currency c:Currency.values()){
			System.out.println(c);
		}
	}

}
 