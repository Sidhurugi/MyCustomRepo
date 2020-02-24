package com.test.urlshortner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.urlshortner.dto.OriginalUrlDto;
import com.test.urlshortner.dto.ShortenUrlDto;
import com.test.urlshortner.services.ShortenUrlService;

@RestController
@RequestMapping("/api/v1/url")
public class UrlShorteningController {

    @Autowired
    private ShortenUrlService urlService;

    @PostMapping("/shorten")
    public ResponseEntity<ShortenUrlDto> shortenUrl(@Validated @RequestBody OriginalUrlDto originalUrlDto) {
        return ResponseEntity.ok(new ShortenUrlDto(urlService.shortenUrl(originalUrlDto.getActualUrl())));
    }

}
