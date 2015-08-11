package org.formation.iteratorjdk;

public class Test {

	public static void main(String[] args) {
		
		
		Channel ch = new Channel("tf1", ChannelTypeEnum.GENERAL);
		Channel ch1 = new Channel("tf2", ChannelTypeEnum.NEWS);
		Channel ch2 = new Channel("tf3", ChannelTypeEnum.MUSIC);
		Channel ch3 = new Channel("tf4", ChannelTypeEnum.GENERAL);
		Channel ch4 = new Channel("tf5", ChannelTypeEnum.KIDS);
		Channel ch5 = new Channel("tf6", ChannelTypeEnum.NEWS);
		Channel ch6 = new Channel("tf7", ChannelTypeEnum.NEWS);
		Channel ch7 = new Channel("tf8", ChannelTypeEnum.NEWS);
		Channel ch8 = new Channel("tf9", ChannelTypeEnum.NEWS);
		Channel ch9 = new Channel("tf10", ChannelTypeEnum.NEWS);
		
		
		ChannelCollectionImpl cci = new ChannelCollectionImpl();
		
		cci.addChannel(ch);
		cci.addChannel(ch1);
		cci.addChannel(ch2);
		cci.addChannel(ch3);
		cci.addChannel(ch4);
		cci.addChannel(ch5);
		cci.addChannel(ch6);
		cci.addChannel(ch7);
		cci.addChannel(ch8);
		cci.addChannel(ch9);
		
		
		ChannelHalfIterator iter = cci.halfIterator(ChannelTypeEnum.NEWS);
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
