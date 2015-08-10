package org.formation.pattern.iterator;

public class Channel {
	private String name;
	private ChannelTypeEnum TYPE;
	
	public Channel(String name, ChannelTypeEnum TYPE) {
		super();
		this.name = name;
		this.TYPE = TYPE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}

	public void setTYPE(ChannelTypeEnum tYPE) {
		TYPE = tYPE;
	}

	@Override
	public String toString() {
		return "Frequency=" + this.name + ", Type=" + this.TYPE;
	}
		
	
}
