package com.test.urlshortner.dto;


import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotEmpty;

public class OriginalUrlDto {

    @NotEmpty(message = "{val.err.original.url.not.empty.or.null}")
    @URL(message = "{val.err.original.url.invalid}")
    private String actualUrl;

    public String getActualUrl() {
        return actualUrl;
    }

    public void setActualUrl(String actualUrl) {
        this.actualUrl = actualUrl;
    }
}
