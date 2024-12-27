///DE-SERIALIZATION

package com.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class code3 {
	public static void main(String[] args) throws Exception {
		String path = "D:\\FH\\Cricketer1.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer1 c = (Cricketer1) ois.readObject();
		c.disp();
	}

}
