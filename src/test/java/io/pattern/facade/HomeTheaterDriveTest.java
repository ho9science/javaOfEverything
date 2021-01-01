package io.pattern.facade;

import org.junit.Test;

import java.net.URI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HomeTheaterDriveTest {
	@Test
	public void test(){
		DvdPlayer dvd = new DvdPlayer();
		Screen screen = new Screen();
		SurroundChannel channel = new SurroundChannel();
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, screen, channel);
		homeTheater.watchMovie("Inception");
		homeTheater.endMovie();

	}

	@Test
	public void test2(){
		String esApiUrl = "http://dcim-es.daumkakao.io:9200/";
		String esIndexPrefix = "metric-";
		StringBuilder newIndexURI = new StringBuilder();
		LocalDate now = LocalDate.now();
		String monthNewIndex = esIndexPrefix+now.format(DateTimeFormatter.ofPattern("yyyy.MM"));
		newIndexURI.append(esApiUrl).append(monthNewIndex);
		StringBuilder alias = new StringBuilder();
		String monthPrevIndex = esIndexPrefix+now.minusMonths(1).format(DateTimeFormatter.ofPattern("yyyy.MM"));
		alias.append(esApiUrl).append("_aliases");
		System.out.println(newIndexURI.toString());
		System.out.println(monthPrevIndex);
		System.out.println(alias.toString());
	}
}
