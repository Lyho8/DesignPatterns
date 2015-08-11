package org.formation.iteratorjdk;

import java.util.Iterator;
import java.util.List;

public class ChannelIterator implements Iterator<Channel>{

	private List<Channel> channels;
	private int position;
	private ChannelTypeEnum TYPE;
	
	public ChannelIterator(List<Channel> channels, ChannelTypeEnum TYPE) {
		super();
		this.channels = channels;
		this.TYPE = TYPE;
	}

	@Override
	public boolean hasNext() {
		while(position < channels.size()) {
			Channel c = channels.get(position);
			if(c.getTYPE().equals(TYPE) || c.getTYPE().equals(ChannelTypeEnum.GENERAL)) {
				return true;
			}
			else {
				position++;
			}
		}
		return false;
	}

	@Override
	public Channel next() {
		Channel c = channels.get(position);
		position++;
		return c;
	}

}
