package ParsSAX;

public class Goals {

	private String goal;
	
	public Goals() {
	}

	public Goals(String goal) {
		super();
		this.goal = goal;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	@Override
	public String toString() {
		return "Goals [goal=" + goal + "]";
	}
	
	
}
