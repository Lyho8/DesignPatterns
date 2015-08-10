package org.formation.pattern.iterator;

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
		return new ChannelIteratorImpl(TYPE, this.channels);
	}
	
	private class ChannelIteratorImpl implements ChannelIterator {
		private ChannelTypeEnum TYPE;
		private List<Channel> channels;
		private int position;
				
		public ChannelIteratorImpl(ChannelTypeEnum TYPE, List<Channel> channels) {
			super();
			this.TYPE = TYPE;
			this.channels = channels;
		}
		
		@Override
		public boolean hasNext() {
			while(position < channels.size()){
				Channel c = channels.get(position);
				if(c.getTYPE().equals(TYPE)	|| c.getTYPE().equals(ChannelTypeEnum.GENERAL)) {
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

}
