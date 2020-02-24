package com.test.urlshortner.services;

public interface IdConverterService {

    String encode(long num);

    long decode(String shortenKey);
}
