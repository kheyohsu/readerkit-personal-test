package com.readerkit.restapi.video;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {
	
	@Autowired
	VideoMapper videoMapper;
	
	public List<Video> videoList(String type) {
		return videoMapper.videoList(type);
	}
	
	public Video video(String uuid) {
		return videoMapper.video(uuid);
	}
}
