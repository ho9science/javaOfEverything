package io.pattern.observer;

import org.junit.Test;

public class WeatherStationTest {

	@Test
	public void weatherDataTest(){
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentConditionsDisplay =
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
