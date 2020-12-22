package io.pattern.observer;

public class StatisticsDisplay implements DisplayElement, Observer {
	Subject m_weatherData;
	double m_maxtemp = 0;
	double m_minTemp = 0;
	double m_average = 0;
	int m_updateCount = 0;

	public StatisticsDisplay(Subject weatherData) {
		m_weatherData = weatherData;
		m_weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {

		if (m_updateCount == 0) {
			m_maxtemp = temperature;
			m_minTemp = temperature;
			m_average = temperature;
			m_updateCount++;
		} else {
			if (m_maxtemp < temperature) {
				m_maxtemp = temperature;
			} else if (m_minTemp > temperature) {
				m_minTemp = temperature;
			}

			m_average = ((m_average * m_updateCount) + temperature) / ++m_updateCount;
		}

		display();
	}

	@Override
	public void display() {
		System.out.println(String.format(
			"Temperature - [Avg:%.2f][Max:%.2f][Min:%.2f]", m_average, m_maxtemp, m_minTemp));
	}

}
