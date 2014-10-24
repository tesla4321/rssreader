package cn.tyz.main;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
 
import cn.tyz.domain.News;
import cn.tyz.domain.Outline;
import cn.tyz.utils.PublicUtils;
import cn.tyz.xml.Dom4jXmlParser;
 
public class Main{
{
    
        try
        {
            // 获取各个频道名称及子频道集合，并迭代
            Map<String, List<Outline>> map_Channels = Dom4jXmlParser.getLinkAsXmlData(new URL(PublicUtils.getUrl()));
            Iterator<Entry<String, List<Outline>>> 
                    iterator_Channels = map_Channels.entrySet().iterator();
            while(iterator_Channels.hasNext())
            {
                // 一个频道
                Entry<String, List<Outline>> entry = iterator_Channels.next();
                String channelName = entry.getKey();        // 频道名称
                List<Outline> outlines = entry.getValue();    // 频道内子频道项目
                 
                System.out.println("模块名称："+channelName);
                 
                // 迭代子频道
                Iterator<Outline> iterator_Item = outlines.iterator();
                while(iterator_Item.hasNext())
                {
                    // 一个子频道
                    Outline outline = iterator_Item.next();
                    System.out.println(outline.getText() + "：" + outline.getXmlUrl() + "内容:\n");
                    URL url = new URL(outline.getXmlUrl());
                    // 根据子频道的XMLURL获取新闻集合，并迭代
                    List<News> list_News = Dom4jXmlParser.getNewsAsXmlData(url);
                    Iterator<News> iterator_News = list_News.iterator();
                    while(iterator_News.hasNext())
                    {
                        // 一条新闻
                        News news = iterator_News.next();
                        System.out.println(news.getTitle().trim());
                        System.out.println(news.getDescription().trim());
                        System.out.println(news.getPubDate().trim());
                        System.out.println(news.getLink().trim());
                        System.out.println(news.getCategory().trim());
                        System.out.println(news.getComments().trim());
                        System.out.println("\n");
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        
    }
}
}