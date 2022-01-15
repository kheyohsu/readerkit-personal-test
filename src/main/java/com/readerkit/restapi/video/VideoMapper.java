package com.readerkit.restapi.video;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VideoMapper {

	List<Video> videoList(String type);
	
	Video video(String uuid);
}
