package com.test.urlshortner.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "TBL_SHORTEN_URL")
public class ShortenUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORIGINAL_URL")
    private String originalUrl;

    @Column(name = "SHORTEN_KEY")
    private String shortenKey;
   
    @Column(name ="user_id")
    private String user;
    
    @CreationTimestamp
    @Column(name = "create_time_stamp", updatable = false)
    private LocalDateTime createTimeStamp;

    public ShortenUrl() {
    }

    public ShortenUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public ShortenUrl(String originalUrl, String shortenUrl) {
        this.originalUrl = originalUrl;
        this.shortenKey = shortenUrl;
    }

	
	 public Long getId() { return id; }
	  
	 public void setId(Long id) { this.id = id; }
	 

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortenKey() {
        return shortenKey;
    }

    public void setShortenKey(String shortenKey) {
        this.shortenKey = shortenKey;
    }

    public LocalDateTime getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(LocalDateTime createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
    
    
}
