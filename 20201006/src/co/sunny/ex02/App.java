package co.sunny.ex02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App {

	public static void main(String[] args) {
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("d:\\hellows.txt");
			String data = "Hello Java World!!";
			byte[] arr = data.getBytes();			
			
			try {
				outputStream.write(arr, 0 , 5);   //0위치에서 5개의 문자만출력
					 
			}catch (IOException e) {
			e.printStackTrace();
			}
			
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				try {
					if(outputStream != null) outputStream.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}


	}

}
