package exercise4;

import java.util.List;

public class Town {
	private List<Family> families;

	public List<Family> getFamilies() {
		return families;
	}

	public void setFamilies(List<Family> families) {
		this.families = families;
	}

	public Town() {
		super();
	}

	public Town(List<Family> families) {
		super();
		this.families = families;
	}
	

}
