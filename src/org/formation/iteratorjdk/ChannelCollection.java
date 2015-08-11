package org.formation.iteratorjdk;

public interface ChannelCollection {
	public void addChannel(Channel c);
	public void removeChannel(Channel c);
	public ChannelIterator iterator(ChannelTypeEnum TYPE);
	public ChannelHalfIterator halfIterator(ChannelTypeEnum TYPE);
}
