package com.readerkit.restapi.video;

import java.util.List;

import org.springframework.stereotype.Service;

public interface VideoService {

	List<Video> videoList(String type);
	
	Video video(String uuid);
}
