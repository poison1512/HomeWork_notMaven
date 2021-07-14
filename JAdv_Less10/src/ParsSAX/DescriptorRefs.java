package ParsSAX;

public class DescriptorRefs {
	
	private String descriptorRef;
	
	public DescriptorRefs() {
	}

	public DescriptorRefs(String descriptorRef) {
		super();
		this.descriptorRef = descriptorRef;
	}

	public String getDescriptorRef() {
		return descriptorRef;
	}

	public void setDescriptorRef(String descriptorRef) {
		this.descriptorRef = descriptorRef;
	}

	@Override
	public String toString() {
		return "DescriptorRefs [descriptorRef=" + descriptorRef + "]";
	}

	
	
	
}
