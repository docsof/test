package guru.springramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChuckNorrisQuotes {
	
	private List<String> quotes;

	public ChuckNorrisQuotes() {
		this.quotes = Arrays.asList("Test Chuck Norris","2 test Chuck");
	}
	
	public String getRandomQuotes() {
		return quotes.get(ThreadLocalRandom.current().nextInt(0,quotes.size()));
	}
	

}
