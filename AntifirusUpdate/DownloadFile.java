package AntifirusUpdate;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadFile {
	
	
	// ךאקאול פאיכ ס ןמלמשü‏ Stream
    public static void downloadUsingStream(String urlPage, String file) throws IOException{
        URL url = new URL(urlPage);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        while((count = bis.read(buffer,0,1024)) != -1)
        {
            fis.write(buffer, 0, count);
        }
        System.out.println("Download Success!");
        fis.close();
        bis.close();
    }

}
