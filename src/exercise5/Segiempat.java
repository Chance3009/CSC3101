package exercise5;

public class Segiempat extends BentukObjek {
	private int side;
	
	public Segiempat() {
		warna = "red";
		side = 1;
	}
	
	public Segiempat(String warna, int side) {
		this.warna = warna;
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}
	
	@Override
	public int kiraLuas() {
		return side * side;
	}
	
	public String whatToDisplay() {
		return "Area: " + kiraLuas()  + "\nWarna: " + warna ;
	}

}
