package com.VtigerGenric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author dell
 * @Description: To Create NotePad Data
 * @throws
 * 
 */

public class NotePadFile11 {
	public String notePadfetch(String key) throws IOException {

		// String DriPath = System.getProperty("user.dir");
		// String path = DriPath + "/king.properties";

		FileInputStream fis = new FileInputStream(Iautofile.notepadpath);
		Properties pobj = new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);

	}
	
	
	

}
