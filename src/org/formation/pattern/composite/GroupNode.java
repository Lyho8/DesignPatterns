package org.formation.pattern.composite;

import java.util.ArrayList;

public class GroupNode implements CompositeNode {
	private ArrayList<CompositeNode> list = new ArrayList<CompositeNode>();
	private static String indent = "";
	
	public void add(CompositeNode c){
		list.add(c);
	}
	
	public void remove(CompositeNode c){
		int ind = list.indexOf(c);
		if(ind!=-1){
			list.remove(ind);
		}
	}
	
	@Override
	public void draw() {
		System.out.println("GroupNode");
		indent+="\t";
		for(CompositeNode cn : list){
			System.out.print(indent);
			cn.draw();
		}
		indent = "";
	}
	
}
