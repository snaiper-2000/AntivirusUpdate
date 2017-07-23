package AntifirusUpdate;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ParsePage {
	
	public String parsePage(){
		Document doc;
		String urlPage = null;
        try {
            doc = Jsoup.connect("http://progzona.ru/bezopasnost/bazae/8-bazy.html").get();
            
            urlPage = doc.getElementsByClass("entry-content").select("p").get(8).select("a").attr("href");
            //System.out.println(doc.getElementsByClass("entry-content").select("p").get(0).select("a").get(2).attr("href"));
            System.out.println(urlPage);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e1){
        	e1.printStackTrace();
        }
        
        return urlPage;
        
	}

}
