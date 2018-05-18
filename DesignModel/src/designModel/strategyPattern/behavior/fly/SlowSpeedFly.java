package designModel.strategyPattern.behavior.fly;

public class SlowSpeedFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("---slow speed fly---");

	}

}
