package com.levo.dockerexample.controller;

import java.util.Date;

import org.apache.commons.text.StringSubstitutor;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("text4shell")
public class HelloController {
	
	@RequestMapping(value = "/attack", method = RequestMethod.GET)
	@ResponseBody
	public String attack(@RequestParam(defaultValue="5up3r541y4n") String search) {
		StringSubstitutor interpolator = StringSubstitutor.createInterpolator();
		// String pocstring = "${script:javascript:java.lang.Runtime.getRuntime().exec('touch /tmp/foo')}";
		try{
			String pwn = interpolator.replace(search);
		} catch(Exception e) {
			System.out.println(e);
		}
		return "Search results for: " + search;
	}

}
