package com.readerkit.restapi.login;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Login {
	
	private String uuid;
	private String rkId;
	private String rkPw;
	private String rkEmail;
	private String rkTel;
	private String rkAddress;
	private int rkChildAge;
	private String rkChildName;
	private String rkChildSex;
	private String rkRegId;
	private LocalDateTime rkRegDate;
	private String rkUpdId;
	private LocalDateTime rkUpdDate;
}
