package garbage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageMaker {
	public static void main(String[] args) throws IOException {
		String filename = "C:\\Users\\DELL\\Desktop\\Practice\\trash.txt";
		byte[] inputBytes = { 0 };
		long startTime, endTime;
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		StringBuilder a = new StringBuilder();
		for(byte b:inputBytes) {
			a.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
