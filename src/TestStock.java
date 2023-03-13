// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 1

public class TestStock {
	public static void main(String[] args) {
		//Create a stock with symbol "ORCL" and name "Oracle Corperation"
		Stock stock1 = new Stock("ORCL", "Oracle Corperation");
		stock1.previousClosingPrice = 34.5;
		stock1.currentPrice = 34.35;
		System.out.printf("Price-change percentage of stock with symbol %s and name %s is %.2f%%", stock1.symbol, stock1.name, stock1.getChangePercent());
	}
}

class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	//Construct a stock with symbol and name
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	//Calculate the price-change percentage
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
	}
}
