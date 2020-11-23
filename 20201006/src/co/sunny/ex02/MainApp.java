package co.sunny.ex02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class MainApp {

	public static void main(String[] args) {
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("d:\\hellow.txt");
			String data = "헬로우 자바 텍스트!!";
			byte[] arr = data.getBytes();			
			
			try {
				outputStream.write(arr);
				System.out.println("파일이 정상적으로 생성되었습니다.");
			}catch (IOException e) {
//				e.printStackTrace();
				System.out.println("파일이 생성되지 않았습니다.");
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
