package com.data.dashboard.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Utils
{

    public static String getUUID()
    {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }
    
    public static String getCurrentTime(){
    	
    	//设置日期格式
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // new Date()为获取当前系统时间
        String currentTime = df.format(new Date());
    	
    	return currentTime;
    }
    
    
}
