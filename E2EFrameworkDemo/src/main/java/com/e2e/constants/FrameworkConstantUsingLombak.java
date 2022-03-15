package com.e2e.constants;

import java.util.Objects;

import lombok.Getter;

@Getter
public class FrameworkConstantUsingLombak {
	
	public FrameworkConstantUsingLombak() {}
	
	private static FrameworkConstantUsingLombak frameworkConstantwithlombak;
	
	public static FrameworkConstantUsingLombak getInstance() {
		
		if(Objects.isNull(frameworkConstantwithlombak)) {
			frameworkConstantwithlombak = new FrameworkConstantUsingLombak();
		}
		return frameworkConstantwithlombak;
		
	}
	
	//lombak way for static 
//	private static @Getter final String resourcepath =System.getProperty("user.dir")
//			+"/src/test/resources";
//	
//	private static @Getter final String apkfilepath =resourcepath
//			+"/apkfiles/ApiDemos-debug.apk";
//	
//	private static @Getter final String configfilepath =resourcepath
//			+"/config/config.properties";
//	
	
	//lombak way for Non-static variable
	private final String resourcepath =System.getProperty("user.dir")
			+"/src/test/resources";
	
	private final String apkfilepath =resourcepath
			+"/apkfiles/ApiDemos-debug.apk";
	
	private final String configfilepath =resourcepath
			+"/config/config.properties";
	
	

}
