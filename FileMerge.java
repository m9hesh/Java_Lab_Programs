//12. Write a program to merge contents of two files and display output on console.

import java.io.*;

public class FileMerge {
	public static void main(String[] args) {
		String file1Path = "path/to/file1";
		String file2Path = "path/to/file2";

		try {
			BufferedReader file1Reader = new BufferedReader(new FileReader(file1Path));
			BufferedReader file2Reader = new BufferedReader(new FileReader(file2Path));

			String file1Line = file1Reader.readLine();
			String file2Line = file2Reader.readLine();

			while (file1Line != null || file2Line != null) {
				if (file1Line != null) {
					System.out.println(file1Line);
					file1Line = file1Reader.readLine();
				}

				if (file2Line != null) {
					System.out.println(file2Line);
					file2Line = file2Reader.readLine();
				}
			}

			file1Reader.close();
			file2Reader.close();

			System.out.println("Files merged successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
