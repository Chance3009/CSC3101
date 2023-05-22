package exercise6;

public class Owl extends Bird implements Species {

	@Override
	public String getSound() {
		return "hoo hoo hoooo";
	}

	@Override
	public String getSpeciesType() {
		return "Snowy Owl";
	}

}
