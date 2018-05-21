package designModel.observerModel.model;

import java.util.ArrayList;

import designModel.observerModel.observer.ObserverWeather;
import designModel.observerModel.observer.SubjectWeather;

public class WeatherData implements SubjectWeather {

	private float temperature;
	private float pressure;
	private float humidity;
	private ArrayList<ObserverWeather> observerWeatherList;

	public WeatherData() {
		observerWeatherList = new ArrayList<ObserverWeather>();
	}

	public void dataChange() {
		notifyObserver();
	}

	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}

	@Override
	public void registerObserver(ObserverWeather observer) {
		observerWeatherList.add(observer);
	}

	@Override
	public void removeObserver(ObserverWeather observer) {
		if(observerWeatherList.contains(observer)){
			observerWeatherList.remove(observer);
		}
	}

	@Override
	public void notifyObserver() {
		for(ObserverWeather observer : observerWeatherList){
			observer.update(temperature, pressure, humidity);
		}

	}

	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

}
