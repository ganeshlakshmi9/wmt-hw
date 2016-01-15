package wmt.hw.app.http;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpException;
import org.junit.Test;

import static org.junit.Assert.*;
public class RestRunnerTest {
	@Test
	public void executeTest(){
		Map<String, String> map = new HashMap<String,String>();
		map.put("q", "hello");
		try {
			RestRunner.execute("http://www.google.com", map);
		} catch (HttpException e) {
			e.printStackTrace();
			fail();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
	}
}
