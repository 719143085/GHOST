package designModel.observerModel;

import designModel.observerModel.innerObserver.CurrentConditionsEx;
import designModel.observerModel.innerObserver.TomorrowConditionsEx;
import designModel.observerModel.innerObserver.WeatherDataEx;
import designModel.observerModel.model.CurrentConditions;
import designModel.observerModel.model.TomorrowConditions;
import designModel.observerModel.model.WeatherData;

/**
 * 观察者模式：
 * 1、对象之间多对一依赖的一种设计方案，被依赖的对象为Subject，依赖的对象为Observer，Subject通知Observer变化
 * 2、松耦合、高内聚、隔离影响
 * 3、java内置观察者：	Observable是类，不能多继承，
 * 			    	Observer是接口
 * @author LB
 *
 */
public class InternetWeather {
	
	public static void main(String[] args) {
		CurrentConditions currentConditions;
		TomorrowConditions tomorrowConditions;
		WeatherData weatherData;
		
		weatherData = new WeatherData();
		currentConditions = new CurrentConditions();
		tomorrowConditions = new TomorrowConditions();
		
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(tomorrowConditions);
		weatherData.setData(30, 150, 40);
		System.out.println("=====================");
		weatherData.removeObserver(tomorrowConditions);
		weatherData.setData(40, 180, 60);
		
		System.out.println("**************************************");
		
		CurrentConditionsEx currentConditionsEx;
		TomorrowConditionsEx tomorrowConditionsEx;
		WeatherDataEx weatherDataEx;
		
		weatherDataEx = new WeatherDataEx();
		currentConditionsEx = new CurrentConditionsEx();
		tomorrowConditionsEx = new TomorrowConditionsEx();
		
		weatherDataEx.addObserver(currentConditionsEx);
		weatherDataEx.addObserver(tomorrowConditionsEx);
		weatherDataEx.setData(30, 150, 40);
		System.out.println("=====================");
		weatherDataEx.deleteObserver(tomorrowConditionsEx);
		weatherDataEx.setData(40, 180, 60);
		
	}

}
