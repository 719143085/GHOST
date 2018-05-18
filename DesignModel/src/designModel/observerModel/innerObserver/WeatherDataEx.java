package designModel.observerModel.innerObserver;

import java.util.Observable;

public class WeatherDataEx extends Observable {

	private float temperature;
	private float pressure;
	private float humidity;

	public void dataChange() {
		//设置数据已变化
		this.setChanged();
		this.notifyObservers(new Data(temperature, pressure, humidity));
	}

	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
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
	
	
	public class Data{
		public float temperature;
		public float pressure;
		public float humidity;
		
		public Data(float temperature, float pressure, float humidity){
			this.temperature = temperature;
			this.pressure = pressure;
			this.humidity = humidity;
		}
		
	}

}
