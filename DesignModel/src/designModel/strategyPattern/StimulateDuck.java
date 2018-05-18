package designModel.strategyPattern;

import designModel.strategyPattern.behavior.fly.SlowSpeedFly;
import designModel.strategyPattern.model.Duck;
import designModel.strategyPattern.model.GreenHeadDuck;

/**
 * 策略模式：分别封装行为接口，实现算法族，超类里放行为接口对象，在子类里具体设定行为对象。原则就是：分离变化部分，封装接口，基于接口编程各种功能。
 * 此模式让行为算法的变化独立于算法的使用者
 * @author LB
 *
 */
public class StimulateDuck {
	
	public static void main(String[] args) {
		Duck greenHeadDuck = new GreenHeadDuck();
		greenHeadDuck.display();
		greenHeadDuck.Quack();
		greenHeadDuck.fly();
		greenHeadDuck.swin();
		greenHeadDuck.setFlyBehavior(new SlowSpeedFly());
		greenHeadDuck.fly();
		
//		Duck redHeadDuck = new RedHeadDuck();
//		redHeadDuck.display();
	}

}
