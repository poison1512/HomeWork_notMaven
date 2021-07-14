package ParsSAX;

public class Properties {

	private String projectBuildSourceEncoding;
	private String mavenCompilerSource;
	private String mavenCompilerTarget;
	
	public Properties( ) {
	}

	public Properties(String projectBuildSourceEncoding, String mavenCompilerSource, String mavenCompilerTarget) {
		super();
		this.projectBuildSourceEncoding = projectBuildSourceEncoding;
		this.mavenCompilerSource = mavenCompilerSource;
		this.mavenCompilerTarget = mavenCompilerTarget;
	}

	public String getProjectBuildSourceEncoding() {
		return projectBuildSourceEncoding;
	}

	public void setProjectBuildSourceEncoding(String projectBuildSourceEncoding) {
		this.projectBuildSourceEncoding = projectBuildSourceEncoding;
	}

	public String getMavenCompilerSource() {
		return mavenCompilerSource;
	}

	public void setMavenCompilerSource(String mavenCompilerSource) {
		this.mavenCompilerSource = mavenCompilerSource;
	}

	public String getMavenCompilerTarget() {
		return mavenCompilerTarget;
	}

	public void setMavenCompilerTarget(String mavenCompilerTarget) {
		this.mavenCompilerTarget = mavenCompilerTarget;
	}

	@Override
	public String toString() {
		return "Properties [projectBuildSourceEncoding=" + projectBuildSourceEncoding + ", mavenCompilerSource="
				+ mavenCompilerSource + ", mavenCompilerTarget=" + mavenCompilerTarget + "]";
	}
	
	
	
	
}
