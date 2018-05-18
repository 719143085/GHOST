package designModel.strategyPattern.behavior.quack;

public class LowVoiceQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("---low voice quack---");

	}

}
