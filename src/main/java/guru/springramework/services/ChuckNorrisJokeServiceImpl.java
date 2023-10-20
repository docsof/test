package guru.springramework.services;

import org.springframework.stereotype.Service;

import guru.springramework.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrrisService {

	private final ChuckNorrisQuotes chuckNorrriQuotes;
	
	public ChuckNorrisJokeServiceImpl() {
		this.chuckNorrriQuotes = new ChuckNorrisQuotes();
	}


	@Override
	public String getJoke() {
		return chuckNorrriQuotes.getRandomQuotes();
	}

}
