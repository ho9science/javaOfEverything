package io.pattern.decorator;

import io.pattern.decorator.file.LowerCaseInputStream;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	@Test
	public void test(){
		int c;
		try {
			InputStream in = new LowerCaseInputStream(
				new BufferedInputStream(
					new FileInputStream("src/test/resources/test.txt")
				)
			);
			while( (c = in.read()) >= 0){
				System.out.print((char)c);
			}
			in.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
