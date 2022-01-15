package com.readerkit.restapi.video;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Video {

	private String uuid;
	private String rkVideoId;
	private String rkVideoName;
	private String rkVideoPath;
	private String rkVideoCurriculumId;
	private String rkRegId;
	private LocalDateTime rkRegDate;
	private String rkUpdId;
	private LocalDateTime rkUpdDate;
}
