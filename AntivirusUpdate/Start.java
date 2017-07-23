package AntifirusUpdate;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Start {

	public static void main(String[] args) {
		
		//parsing fail confugaration
		//ParseConfiguration parseConfiguration = new ParseConfiguration();
		//String patchFiles =  parseConfiguration.parsePathFail();
		//Date timeParse =  parseConfiguration.parseTimeFail();
		
		//System.out.println("Путь"+patchFiles);
		//System.out.println("время парсинга"+timeParse);
		
		while(true){
			ParseConfiguration parseConfiguration = new ParseConfiguration();
			String patchFiles =  parseConfiguration.parsePathFail();
			Date timeParse =  parseConfiguration.parseTimeFail();
			
			//String patchFilesFull = patchFiles+"\\"+sdfOnline.format(dateOnline)+".zip";
			String outputFolder = patchFiles;
			
			//DeleteAllFilesFolder deleteAllFilesFolder = new DeleteAllFilesFolder();
			//deleteAllFilesFolder.deleteAllFilesFolder(outputFolder);
			
			//System.out.println("Путь"+patchFiles);
			//System.out.println("время парсинга"+timeParse);
	
			String urlFiles = null;
			
			//date current 
			Date dateOnline = new Date();
			//format date online
			SimpleDateFormat sdfOnline = new SimpleDateFormat("yyy.MM.dd_HH.mm.ss");
			
			timeParse.setDate(dateOnline.getDate());
			timeParse.setMonth(dateOnline.getMonth());
			timeParse.setYear(dateOnline.getYear());
			
			if(dateOnline.getTime() == timeParse.getTime()){
				
				DeleteAllFilesFolder deleteAllFilesFolder = new DeleteAllFilesFolder();
				deleteAllFilesFolder.deleteAllFilesFolder(outputFolder);
				
				System.out.println("Время совпало!!!");
				
				ParsePage parse = new ParsePage();
				urlFiles =  parse.parsePage();
			
		
			//String urlFiles = "http://10.17.3.1/nodF01B.nup";
				String patchFilesFull = patchFiles+"\\"+sdfOnline.format(dateOnline)+".zip";
				//String outputFolder = patchFiles;
		
				//String testDelete = "C:\\Users\\424\\Desktop\\Test\\test.txt";
		
				DownloadFile downloadFile = new DownloadFile();
				try {
					downloadFile.downloadUsingStream(urlFiles, patchFilesFull);
				} catch (IOException e) {
					System.out.println("Download Fail!");
					e.printStackTrace();
				}
				//unzip fail
				UnZip unZip = new UnZip();
				unZip.unZipIt(patchFilesFull, outputFolder);
				
				//delete fail zip
				File file = new File(patchFilesFull);
				boolean deleteFail = file.delete();
				System.out.println(deleteFail);
				}
			
				//unzip fail
				/*UnZip unZip = new UnZip();
				unZip.unZipIt(patchFilesFull, outputFolder);
				 
				delete fail
				File file = new File(patchFilesFull);
				boolean deleteFail = file.delete();
				System.out.println(deleteFail);*/
		}

	}

}
