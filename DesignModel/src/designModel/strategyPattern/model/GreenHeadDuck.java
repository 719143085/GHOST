package designModel.strategyPattern.model;

import designModel.strategyPattern.behavior.fly.HighSpeedFly;
import designModel.strategyPattern.behavior.quack.HighVoiceQuack;
import designModel.strategyPattern.behavior.swim.HighSpeedSwin;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		quackBehavior = new HighVoiceQuack();
		flyBehavior = new HighSpeedFly();
		swinBehavior = new HighSpeedSwin();
	}

	@Override
	public void display() {
		System.out.println("===This is a GreenHeadDuck===");

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
