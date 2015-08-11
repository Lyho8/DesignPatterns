package org.formation.iteratorjdk;

import java.util.Iterator;
import java.util.List;

public class ChannelHalfIterator implements Iterator<Channel>{
	private List<Channel> channels;
	private int position;
	private ChannelTypeEnum TYPE;
	private int count = 0;
	
	public ChannelHalfIterator(List<Channel> channels, ChannelTypeEnum TYPE) {
		super();
		this.channels = channels;
		this.TYPE = TYPE;
	}

	@Override
	public boolean hasNext() {
		while(position < channels.size()) {
			Channel c = channels.get(position);
			if(c.getTYPE().equals(TYPE) || c.getTYPE().equals(ChannelTypeEnum.GENERAL)) {
				count++;
				if(count%2!=0){
					return true;
				}
				else{
					position++;
				}
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
		//Alternative : position+=2; et pas de "count"
		return c;
	}
}
