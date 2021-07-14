package ParsSAX;

public class Manifest {
	
	private String mainClass;
	
	public Manifest() {
	}

	public Manifest(String mainClass) {
		super();
		this.mainClass = mainClass;
	}

	public String getMainClass() {
		return mainClass;
	}

	public void setMainClass(String mainClass) {
		this.mainClass = mainClass;
	}

	@Override
	public String toString() {
		return "Manifest [mainClass=" + mainClass + "]";
	}
	
	

}
