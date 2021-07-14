package ParsSAX;

public class Pomnik {
	private String project;
	private String modelVersion;
	private String groupId;
	private String artifactId;
	private String version;
	private String name;
	private String url;
	public Properties properties;
	public Dependencies dependencies;
	public Build build;

	public Pomnik(String project, String modelVersion, String groupId, String artifactId, String version, String name,
			String url) {
		super();
		this.project = project;
		this.modelVersion = modelVersion;
		this.groupId = groupId;
		this.artifactId = artifactId;
		this.version = version;
		this.name = name;
		this.url = url;
	}
	public Pomnik() {
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getModelVersion() {
		return modelVersion;
	}
	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getArtifactId() {
		return artifactId;
	}
	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Pomnik [project=" + project + ", modelVersion=" + modelVersion + ", groupId=" + groupId
				+ ", artifactId=" + artifactId + ", version=" + version + ", name=" + name + ", url=" + url
				+ ", properties=" + properties + ", dependencies=" + dependencies + ", build=" + build + "]";
	}
	
	
	
}
