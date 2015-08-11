package org.formation.iteratorjdk;

import java.util.*;

public class ChannelCollectionImpl implements ChannelCollection {
	
	private List<Channel> channels = new ArrayList<Channel>();

	@Override
	public void addChannel(Channel c) {
		channels.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		channels.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum TYPE) {
		return new ChannelIterator(this.channels, TYPE);
	}

	@Override
	public ChannelHalfIterator halfIterator(ChannelTypeEnum TYPE) {
		return new ChannelHalfIterator(this.channels, TYPE);
	}

}
