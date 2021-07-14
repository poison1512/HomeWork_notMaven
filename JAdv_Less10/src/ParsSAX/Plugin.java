package ParsSAX;

public class Plugin {
	
	private String artifactId;
	private String version;
	private Configuration configuration;
	private Executions executions;
	
	public Plugin() {
	}

	public Plugin(String artifactId, String version) {
		super();
		this.artifactId = artifactId;
		this.version = version;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	@Override
	public String toString() {
		return "Plugin [artifactId=" + artifactId + ", version=" + version + "]";
	}

	
}
