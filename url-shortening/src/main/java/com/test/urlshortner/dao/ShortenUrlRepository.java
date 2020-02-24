package com.test.urlshortner.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.urlshortner.entities.ShortenUrl;

import java.util.Optional;


@Repository
public interface ShortenUrlRepository extends JpaRepository<ShortenUrl, Long> {

    Optional<ShortenUrl> findByOriginalUrl(String originalUrl);

}
