package AntifirusUpdate;

import java.io.File;
/**
 * Class delete all files in folder
 *
 */
public class DeleteAllFilesFolder {
	/*
	 * Method delete all files in folder
	 */
	public void deleteAllFilesFolder(String path) {
        for (File myFile : new File(path).listFiles())
               if (myFile.isFile()) myFile.delete();
	}    

}
