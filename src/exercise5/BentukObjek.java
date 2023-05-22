package exercise5;

public abstract class BentukObjek {
	protected String warna;
	
	protected BentukObjek() {
		warna = "red";
	}
	protected BentukObjek(String warna) {}
	
	@Override
	public String toString() {
		return warna;
	}
	
	public abstract int kiraLuas();
}
