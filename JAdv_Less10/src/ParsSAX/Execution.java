package ParsSAX;

public class Execution {
	
	private String id;
	private String phase;
	
	private Goals goals;
	
	public Execution() {
	}

	public Execution(String id, String phase) {
		super();
		this.id = id;
		this.phase = phase;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	@Override
	public String toString() {
		return "Execution [id=" + id + ", phase=" + phase + "]";
	}

	

}
