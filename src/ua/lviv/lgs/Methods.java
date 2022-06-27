package ua.lviv.lgs;

import java.io.*;

public class Methods {

	public static void writeObjectToFile(File file, Serializable object) throws IOException{
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(object);
		oos.close();
		os.close();
		
	}
	
	public static Serializable readObjectFromFile(File file) throws IOException, ClassNotFoundException{
		
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Serializable object = (Serializable) ois.readObject();
		is.close();
		ois.close();
		return object;
	}
	
}
