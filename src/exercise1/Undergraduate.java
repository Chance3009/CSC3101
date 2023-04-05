package exercise1;

public class Undergraduate extends Student {
	public String academicAdvisor;
	
	@Override
	public String toString() {
		return super.toString() + "\nAcademic advisor: " + academicAdvisor;
	}
}
