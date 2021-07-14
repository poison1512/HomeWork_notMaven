package ParsSAX;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAX_Parser extends DefaultHandler{
	
	private List<Pomnik> pomniklist = new ArrayList<>();
	private String currentNode;
	private final String PROJECT_NODE = "project";
	private final String MODELV_NODE ="modelVersion";
	private final String GID_NODE = "groupId";
	private final String ARID_NODE = "artifactId";
	private final String VERS_NODE = "version";
	private final String NAME_NODE = "name";
	private final String URL_NODE = "url";
	private final String PROPERT_NODE = "properties";
	private final String PBS_NODE = "project.build.sourceEncoding";
	private final String MCS_NODE = "maven.compiler.source";
	private final String MCT_NODE = "maven.compiler.target";
	private final String DEPENDS_NODE = "dependencies";
	private final String DEPEND_NODE = "dependency";
	private final String GID2_NODE = "groupId";
	private final String ARID2_NODE = "artifactId";
	private final String VERS2_NODE = "version";
	private final String SCOPE2_NODE = "scope";
	private final String BUILD_NODE = "build";
	private final String PLUGINS_NODE = "plugins";
	private final String PLUGIN_NODE = "plugin";
	private final String ARID3_NODE = "artifactId";
	private final String VERS3_NODE = "version";
	private final String CONFIG_NODE = "configuration";
	private final String DESCRIPTS_NODE = "descriptorRefs";
	private final String DESCRIPT_NODE = "descriptorRef";
	private final String ARCHIVE_NODE = "archive";
	private final String MANIFEST_NODE = "manifest";
	private final String MAINCLASS_NODE = "mainClass";
	private final String EXECUTIONS_NODE = "EXECUTIONS_NODE";
	private final String EXECUTION_NODE = "execution";
	private final String ID_NODE = "id";
	private final String PHASE_NODE = "phase";
	private final String GOALS_NODE = "goals";
	private final String GOAL_NODE = "goal";
	private Pomnik pomnik;
	private Properties properties;
	private Dependencies dependencies;
	private Dependency dependency;
	private Build build;
	private Plugins plugins;
	private Plugin plugin;
	private Configuration configuration;
	private DescriptorRefs descriptorRefs;
	private Archive archive;
	private Manifest manifest;
	private Executions executions;
	private Execution execution;
	private Goals goals;
	
	
	
	@Override
	public void startDocument() throws SAXException {
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		currentNode = qName;
		switch (currentNode) {
		case PROJECT_NODE:
			pomnik = new Pomnik();
			break;
		case PROPERT_NODE:
			properties = new Properties();
			break;
		case DEPENDS_NODE:
			dependencies = new Dependencies();
			break;
		case DEPEND_NODE:
			dependency = new Dependency();
			break;
		case BUILD_NODE:
			build = new Build();
			break;
		case PLUGINS_NODE:
			plugins = new Plugins();
			break;
		case PLUGIN_NODE:
			plugin = new Plugin();
			break;
		case CONFIG_NODE:
			configuration = new Configuration();
			break;
		case DESCRIPT_NODE:
			descriptorRefs = new DescriptorRefs();
			break;
		case ARCHIVE_NODE:
			archive = new Archive();
			break;
		case EXECUTIONS_NODE:
			executions = new Executions();
			break;
		case GOALS_NODE:
			goals = new Goals();
			break;
		}
	}
	@Override
	public void characters(char[] ch, int start, int lenght) throws SAXException {
		
	}
}
