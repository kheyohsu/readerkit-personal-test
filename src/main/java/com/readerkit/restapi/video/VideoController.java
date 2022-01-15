package com.readerkit.restapi.video;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class VideoController {
	
	@Autowired
	VideoService videoService;

	@RequestMapping("/videoList")
	public String videoList(Model model, String type) {
		List<Video> videoList = videoService.videoList(type);
		
		
		
		model.addAttribute("videoList", videoList);
		
		return "video/list";
	}
	
	@RequestMapping("/video")
	public String video(Model model, @RequestParam String uuid) {
		Video video = videoService.video(uuid);
		
		model.addAttribute("video", video);
		
		return "video/player";
	}
}
