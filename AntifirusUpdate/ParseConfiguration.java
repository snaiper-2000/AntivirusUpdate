package AntifirusUpdate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseConfiguration {
	
	FileReader input;
	BufferedReader bufRead;


	/*public static void main(String[] args) {
		
		FileReader input;
		BufferedReader bufRead;
		try {
			input = new FileReader("ConfiguratiomAntivirusUpdate.txt");
			
			bufRead = new BufferedReader(input);
			String myLine = null;

			while ( (myLine = bufRead.readLine()) != null){
				
			   if(myLine.contains("patchFiles") == true){
				   String[] arrayPatchFiles = myLine.split("=");
				   System.out.println(arrayPatchFiles[1]);
			   }
			   
			   if(myLine.contains("timeDownload") == true){
				   String[] arrayTimeDownload = myLine.split("=");
				   System.out.println(arrayTimeDownload[1]);
				   
				   //String date = array[0];
				   SimpleDateFormat sdfDate = new SimpleDateFormat("HH.mm.ss");
				   Date timeParse = new Date();
				   timeParse = sdfDate.parse(arrayTimeDownload[1]);
				   System.out.println("day: "+timeParse.getHours()+" month: "+timeParse.getMinutes()+" year: "+timeParse.getSeconds());
					
			   }
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
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
				   System.out.println(arrayPatchFiles[1]);
			   }
			}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		return patchFiles;
	}
	
	public Date parseTimeFail(){
		Date timeParse = new Date();
		try {
			input = new FileReader("ConfiguratiomAntivirusUpdate.txt");
			
			bufRead = new BufferedReader(input);
			String myLine = null;

			while ( (myLine = bufRead.readLine()) != null){
				
				if(myLine.contains("timeDownload") == true){
					   String[] arrayTimeDownload = myLine.split("=");
					   System.out.println(arrayTimeDownload[1]);
					   
					   //String date = array[0];
					   SimpleDateFormat sdfDate = new SimpleDateFormat("HH.mm.ss");
					   //Date timeParse = new Date();
					   timeParse = sdfDate.parse(arrayTimeDownload[1]);
					   System.out.println("day: "+timeParse.getHours()+" month: "+timeParse.getMinutes()+" year: "+timeParse.getSeconds());
						
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
