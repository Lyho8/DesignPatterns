package org.formation.pattern.test;

import org.formation.pattern.factory.*;
import org.formation.pattern.singleton.*;
import org.formation.pattern.templatemethod.*;
import org.formation.pattern.abstractfactory.*;
import org.formation.pattern.builder.ComplexObject;
import org.formation.pattern.strategy.*;
import org.formation.pattern.composite.*;
import org.formation.pattern.observer.*;

import models.*;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance();
		System.out.println(s);
		
		s.setAttr(42);
		System.out.println(s);
		
		Singleton t = Singleton.getInstance();
		System.out.println(t);
		
		SingletonWithHelper swh = SingletonWithHelper.getInstance();
		swh.singletonMethod();
		
		SingletonWithHelper swh2 = SingletonWithHelper.getInstance();
		swh2.singletonMethod();
		
		System.out.println("\n");
		BreakingBadOfficial bbo = new BreakingBadOfficial();
		bbo.breakBad();
		
		System.out.println("\n");
		SwimmingBad sb = new SwimmingBad();
		sb.breakBad();
		
		System.out.println("\n");
		BreakingBadRampage bbr = new BreakingBadRampage();
		bbr.breakBad();
		
		AbstractCar cc = MethodCarFactory.getCar(MethodCarFactory.CHEAP, "Renault", "5", 5);
		AbstractCar lc = MethodCarFactory.getCar(MethodCarFactory.LUXURY, "Audi", "A102", 2000000);
		
		System.out.println("\n\n" + cc);
		System.out.println(lc);
		
		EnumSingleton.INSTANCE.singletonMethod();
		
		ComplexObject complexObject = new ComplexObject.ComplexObjectBuilder("name", "codename")
				.setAuto(true)
				.setBig(false)
				.setNumber(42)
				.build();
		
		System.out.println(complexObject);
		
		AbstractCar c = CarFactory.getCar(new LuxuryCarFactory("Mercedes", "blah", 42));
		System.out.println(c);
		
		GameCharacter mario = new GameCharacter();
		mario.move();
		mario.changeStrategy(new SlowMotion());
		mario.move();
		mario.changeStrategy(new UberSpeed());
		mario.move();
		
		LeafNodeButton b1 = new LeafNodeButton();
		LeafNodeButton b2 = new LeafNodeButton();
		LeafNodeImage i1 = new LeafNodeImage();
		
		GroupNode gn = new GroupNode();
		gn.add(b1);
		gn.add(b2);
		gn.add(i1);
		
		GroupNode gn2 = new GroupNode();
		gn2.add(b1);
		gn2.add(b2);
		gn2.add(i1);
		
		gn.add(gn2);
		
		b1.draw();
		b2.draw();
		i1.draw();
		gn.draw();
		gn2.draw();
		
		ConcreteObserver co = new ConcreteObserver();
		ConcreteObserver2 co2 = new ConcreteObserver2();
		
		ConcreteSubject cs = new ConcreteSubject();
		cs.register(co);
		cs.register(co2);
		cs.setValue(42);
		
		Screen screen = new Screen();
		DataStore ds = new DataStore();
		
		ds.addObserver(screen);
		
		ds.setData("42");
		
	}

}
