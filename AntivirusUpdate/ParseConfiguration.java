package AntifirusUpdate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Class parse fail format txt (Configuration Fail)
 *
 */
public class ParseConfiguration {
	
	FileReader input;
	BufferedReader bufRead;
	/*
	 * Method parse information patch file
	 */
	public String parsePathFail(){
		String patchFiles = null;
		try {
			input = new FileReader("ConfiguratiomAntivirusUpdate.txt");
			
			bufRead = new BufferedReader(input);
			String myLine = null;

			while ( (myLine = bufRead.readLine()) != null){
				
			   if(myLine.contains("patchFiles") == true){
				   String[] arrayPatchFiles = myLine.split("=");
				   patchFiles = arrayPatchFiles[1];
				   //System.out.println("Путь загрузки файла: "+arrayPatchFiles[1]);
			   }
			}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		return patchFiles;
	}
	/*
	 * Method parse information time download
	 */
	public Date parseTimeFail(){
		Date timeParse = new Date();
		try {
			input = new FileReader("ConfiguratiomAntivirusUpdate.txt");
			
			bufRead = new BufferedReader(input);
			String myLine = null;

			while ( (myLine = bufRead.readLine()) != null){
				
				if(myLine.contains("timeDownload") == true){
					   String[] arrayTimeDownload = myLine.split("=");
					   SimpleDateFormat sdfDate = new SimpleDateFormat("HH.mm.ss");
					   timeParse = sdfDate.parse(arrayTimeDownload[1]);
					   //System.out.println("day: "+timeParse.getHours()+" month: "+timeParse.getMinutes()+" year: "+timeParse.getSeconds());
						
				   }
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		return timeParse;
	}

}
