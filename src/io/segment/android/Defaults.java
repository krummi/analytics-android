package io.segment.android;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Defaults {

	public static final boolean DEBUG = false;
	
	public static final String HOST = "https://api.segment.io";

	public static final int FLUSH_AT = 20;
	public static final int FLUSH_AFTER = (int) TimeUnit.SECONDS.toMillis(10);
	
	@SuppressWarnings("serial")
	public static final Map<String, String> ENDPOINTS = new HashMap<String, String>() {{
		this.put("identify", "/events/segmentio");
		this.put("alias",    "/events/segmentio");
		this.put("track",    "/events/segmentio");
		this.put("import",   "/events/segmentio");
	}};
	
	public static String getSettingsEndpoint(String writeKey) {
		return "/project/" + writeKey + "/settings";
	}
	
	public static final int MAX_QUEUE_SIZE = 10000;
	
	// cache the settings for 1 hour before reloading
	public static final int SETTINGS_CACHE_EXPIRY = 1000 * 60 * 60;


}