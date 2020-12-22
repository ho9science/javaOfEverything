package io.pattern.observer;

public class ForecastDisplay implements DisplayElement, Observer{
	Subject m_weatherData;
	double m_temp;
	double m_humidity;
	double m_pressure;
	String m_forcastMsg = "";

	public ForecastDisplay(Subject weatherData) {
		m_weatherData = weatherData;
		m_weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {

		m_temp = temp;
		m_humidity = humidity;
		m_pressure = pressure;

		if (m_humidity >= 70) {
			if (m_pressure <= 30) {
				m_forcastMsg = "need umbrella";
			} else {
				m_forcastMsg = "cloud";
			}
		} else if (m_humidity >= 30) {
			m_forcastMsg = "cloud";
		} else {
			m_forcastMsg = "sunny";
		}

		display();
	}

	@Override
	public void display() {
		System.out.println(String.format("ForecastDisplay - [Forecast:%s]",
			m_forcastMsg));
	}
}
