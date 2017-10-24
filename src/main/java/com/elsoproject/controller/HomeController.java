package com.elsoproject.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elsoproject.domain.Story;
import com.elsoproject.repository.StoryRepository;
import com.elsoproject.service.StoryService;

import javassist.bytecode.Descriptor.Iterator;

@Controller
public class HomeController {
	
	private StoryService storyService;
	
	@Autowired
	public void setStoryService(StoryService storyService) {
		this.storyService = storyService;
	}

	@RequestMapping("/")
	public String stories(Model model, Locale locale) {
		model.addAttribute("pageTitle", "Minden napra egy SFJ sztori!");
		model.addAttribute("stories", storyService.getStories());
		System.out.println(String.format("Request received. Language: %s, Country: %s %n", locale.getLanguage(),
				locale.getDisplayCountry()));
		return "stories";
	}
	
	@RequestMapping("/story")
	public String story(Model model) {
		model.addAttribute("pageTitle", "Minden napra egy SFJ sztori!");
		model.addAttribute("story", storyService.getStory());
		return "story";
	}

	@RequestMapping("/title/{title}")
	public String searchForUser(@PathVariable(value = "title") String title, Model model) throws Exception {
		if (title == null)
			throw new Exception("Nincs ilyen címmel sztorink!");
		model.addAttribute("story", storyService.getSpecificStory(title));
		return "story";
	}

	@ExceptionHandler(Exception.class)
	public String exceptionHandler(HttpServletRequest rA, Exception ex, Model model) {
		model.addAttribute("errMessage", ex.getMessage());
		return "exceptionHandler";
	}




}
