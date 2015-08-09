package com.ucsc.repo;

import java.util.*;

import com.ucsc.model.RideSession;

public class SessionRepo {
	static List<RideSession> sessionList= new ArrayList<>();

	public static List<RideSession> getSessionList() {
		return sessionList;
	}

	public static void setSessionList(List<RideSession> sessionList) {
		SessionRepo.sessionList = sessionList;
	}

}
