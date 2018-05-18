package designModel.strategyPattern.model;

import designModel.strategyPattern.behavior.fly.SlowSpeedFly;
import designModel.strategyPattern.behavior.quack.LowVoiceQuack;
import designModel.strategyPattern.behavior.swim.LowSpeedSwin;

public class RedHeadDuck extends Duck {
	
	

	public RedHeadDuck() {
		quackBehavior  = new LowVoiceQuack();
		flyBehavior = new SlowSpeedFly();
		swinBehavior = new LowSpeedSwin();
	}

	@Override
	public void display() {
		System.out.println("===This is a RedHeadDuck===");

	}

	@Override
	public void Quack() {
		quackBehavior.quack();
	}

	@Override
	public void fly() {
		flyBehavior.fly();
	}

	@Override
	public void swin() {
		swinBehavior.swin();
	}

}
