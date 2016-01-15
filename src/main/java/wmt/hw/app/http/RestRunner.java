package wmt.hw.app.http;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

/**
 * @author Ganesh Muthuluru
 *
 */
public class RestRunner {

	/**
	 * Utility method makes rest API calls using commons httpclient and returns
	 * the response from the server as a String
	 * 
	 * @param url
	 * @param parametersMap
	 * @return response
	 * @throws HttpException
	 * @throws IOException
	 */
	public static String execute(String url, Map<String, String> parametersMap)
			throws HttpException, IOException {
		HttpClient client = new HttpClient();

		StringBuilder urlWithParams = new StringBuilder();
		urlWithParams.append(url).append("?");
		for (Entry<String, String> entry : parametersMap.entrySet()) {
			urlWithParams.append(entry.getKey()).append("=")
					.append(entry.getValue()).append("&");
		}

		HttpMethod method = new GetMethod(urlWithParams.toString());
		int statusCode = client.executeMethod(method);

		if (statusCode != HttpStatus.SC_OK) {
			throw new RuntimeException("Failed to execute the HTTP call " + url);
		}

		byte[] response = method.getResponseBody();
		return IOUtils.toString(response, "UTF-8");
	}

}
