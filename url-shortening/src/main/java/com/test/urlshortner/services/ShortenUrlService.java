package com.test.urlshortner.services;

import java.util.List;
import java.util.Optional;

import com.test.urlshortner.entities.ShortenUrl;

public interface ShortenUrlService {

    String shortenUrl(String originalUrl);
    public List<ShortenUrl> getAllShortenUrl();
    Optional<ShortenUrl> getShortenUrl(String shortenKey);
}
