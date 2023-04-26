package rafaelferreros.kata.services;

import java.util.Optional;

public class UrlShortenerService {

    private static final String SHORT_URL = "http://short.com/";
    public Optional<String> getNewPath(String inputURL, String seoKeyword) {
        if (seoKeyword == null || seoKeyword.length() > 20) {
            return Optional.empty();
        } else {
            return Optional.of(SHORT_URL + seoKeyword);
        }

    }
}
