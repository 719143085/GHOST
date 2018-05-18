package designModel.strategyPattern.model;

import designModel.strategyPattern.behavior.fly.FlyBehavior;
import designModel.strategyPattern.behavior.quack.QuackBehavior;
import designModel.strategyPattern.behavior.swim.SwinBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	SwinBehavior swinBehavior;
	
	public Duck() {
	}

	public abstract void display();
	
	public void Quack(){
		quackBehavior.quack();
	}
	
	public void fly(){
		flyBehavior.fly();
	}

	
	public void swin(){
		swinBehavior.swin();
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setSwinBehavior(SwinBehavior swinBehavior) {
		this.swinBehavior = swinBehavior;
	}
}
