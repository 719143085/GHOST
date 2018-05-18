package designModel.observerModel.model;

import designModel.observerModel.observer.ObserverWeather;

public class CurrentConditions implements ObserverWeather{
	
	private float temperature;
	private float pressure;
	private float humidity;

	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	public void display(){
		System.out.println("Today Weather===temperature:" + temperature);
		System.out.println("Today Weather===pressure:" + pressure);
		System.out.println("Today Weather===humidity:" + humidity);
	}
}
