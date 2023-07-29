package LabProgram509;

/*
 * Write a program that reads the name of a text file containing a list of photo file names. 
 * The program then reads the photo file names from the text file, replaces the "_photo.jpg" 
 * portion of the file names with "_info.txt", and outputs the modified file names.
 * Assume the unchanged portion of the photo file names contains only letters and numbers, 
 * and the text file stores one photo file name per line. If the text file is empty, the program 
 * produces no output.
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileNameChange {
	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);

		/* Type your code here. */

		//String filename = "src/LabProgram509/ParkPhotos.txt";
		String filename = scnr.next();
		FileInputStream fileByteStream = new FileInputStream(filename);
		Scanner fileScanner = new Scanner(fileByteStream);

		while (fileScanner.hasNext()) {
			String line = fileScanner.next();
			int lineSize = line.length();
			String nwLine = line.substring(0, lineSize - 9);
			nwLine += "info.txt";
			System.out.println(nwLine);
		}
	}
}
