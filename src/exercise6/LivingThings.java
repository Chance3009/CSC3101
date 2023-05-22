package exercise6;

public abstract class LivingThings {
	private String name;
	
	public LivingThings() {}
	
	public LivingThings(String name) {
		this.name = name;
	}
	
	public String getName() {
		return "";
	}
	
	public abstract String howToMove();
	public abstract String howToGrow();
	
}
