//11.Write a program to copy data from one file to another file

import java.io.*;

public class FileCopy {
	public static void main(String[] args) {
		String sourceFilePath = "path/to/source/file";
		String destinationFilePath = "path/to/destination/file";

		try {
			FileInputStream sourceFileInputStream = new FileInputStream(sourceFilePath);
			FileOutputStream destinationFileOutputStream = new FileOutputStream(destinationFilePath);

			byte[] buffer = new byte[1024];
			int bytesRead;

			while ((bytesRead = sourceFileInputStream.read(buffer)) != -1) {
				destinationFileOutputStream.write(buffer, 0, bytesRead);
			}

			sourceFileInputStream.close();
			destinationFileOutputStream.close();

			System.out.println("File copied successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
