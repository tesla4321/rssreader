package cn.tyz.utils;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
public class PublicUtils
{
    // 读取资源文件中的URL
    public static String getUrl()
    {
    	String url = "";
        
        InputStream in = PublicUtils.class.getClassLoader().getResourceAsStream("cn/tyz/utils/rss.properties");
        Properties properties = new Properties();
        try
        {
            properties.load(in);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
         
        url = properties.getProperty("url");
         
         
        
         
        return url;
    }
}