package designModel.strategyPattern.behavior.quack;

public class HighVoiceQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("---high voice quack---");
		
	}

}
