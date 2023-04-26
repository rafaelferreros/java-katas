package rafaelferreros.kata.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class UrlShortenerServiceTest {

    @Test
    public void testMyNewsWs() {
        UrlShortenerService urlShortenerService = new UrlShortenerService();
        String inputURL = "http://looooong.com/somepath";
        String SeoKeyword = "MY-NEW-WS";
        Optional<String> result = urlShortenerService.getNewPath(inputURL, SeoKeyword);
        Assertions.assertEquals("http://short.com/MY-NEW-WS", result.get());
    }

    @Test
    public void testFailingWhenSeoKeyWordLongerThanTwenty() {
        UrlShortenerService urlShortenerService = new UrlShortenerService();
        String inputURL = "http://looooong.com/somepath";
        String seoKeyword21Chars = "0123456789012345678901";
        Optional<String> result = urlShortenerService.getNewPath(inputURL, seoKeyword21Chars);
        Assertions.assertFalse(result.isPresent());
    }

    @Test
    public void testFailingWhenSeoKeyWordNull() {
        UrlShortenerService urlShortenerService = new UrlShortenerService();
        String inputURL = "http://looooong.com/somepath";
        String seoKeywordNull = null;
        Optional<String> result = urlShortenerService.getNewPath(inputURL, seoKeywordNull);
        Assertions.assertFalse(result.isPresent());
    }
}
