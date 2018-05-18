package designModel.observerModel.observer;


public interface SubjectWeather {

	public void registerObserver(ObserverWeather observer);
	
	public void removeObserver(ObserverWeather observer);
	
	public void notifyObserver();
}
