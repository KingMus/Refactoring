package price;

import program.Movie;

public class NewReleasePrice extends Price{

	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

}
