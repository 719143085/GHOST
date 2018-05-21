package designModel.observerModel.innerObserver;

import java.util.Observable;
import java.util.Observer;

import designModel.observerModel.innerObserver.WeatherDataEx.Data;

public class CurrentConditionsEx implements Observer{
	
	private float temperature;
	private float pressure;
	private float humidity;


	public void display(){
		System.out.println("Today Weather===temperature:" + temperature);
		System.out.println("Today Weather===pressure:" + pressure);
		System.out.println("Today Weather===humidity:" + humidity);
	}


	@Override
	public void update(Observable observable, Object obj) {
		if(obj instanceof Data){
			Data data = (Data) obj;
			this.temperature = data.temperature;
			this.pressure = data.pressure;
			this.humidity = data.humidity;
		}
		display();
		
	}
}
