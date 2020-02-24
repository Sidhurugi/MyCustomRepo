package com.test.urlshortner.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.urlshortner.entities.ShortenUrl;
import com.test.urlshortner.services.ShortenUrlService;

@Controller
public class WebController {
	
	@Autowired
	ShortenUrlService shortenUrlService;
	
	 @RequestMapping({"/","index"})
	  public String index() {
	    return "index";
	  }
	 @RequestMapping("/webprivate")
	  public ModelAndView privateUrl() {
		 
		 List<ShortenUrl> shortendUrls = shortenUrlService.getAllShortenUrl();

	        Map<String, Object> params = new HashMap<>();
	        params.put("user", shortendUrls);

	        return new ModelAndView("user", params);
	  }
	 
	 @RequestMapping("/webadmin")
	  public ModelAndView admin() {
		 List<ShortenUrl> shortendUrls = shortenUrlService.getAllShortenUrl();

	        Map<String, Object> params = new HashMap<>();
	        params.put("user", shortendUrls);

	        return new ModelAndView("admin", params);
	  }
	 
	 @RequestMapping("/login")
	  public String login() {
	    return "login";
	  }
}
