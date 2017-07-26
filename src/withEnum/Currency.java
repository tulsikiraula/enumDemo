package withEnum;

public enum Currency {
	PENNY(1,"penny is selecetd"),
	COIN(20,"Coin is selected"),
	QUARTER(25,"quarter is selected");
	
	int x;
	String desc;

	private Currency(int x, String desc) {
		this.x = x;
		this.desc = desc;
	}

	public int getX() {
		return x;
	}

	public String getDesc() {
		return desc;
	}
}
