package co.sunny.ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainApp {

	public static void main(String[] args) {
		
InputStream inputstream = null;  //파일을 읽겠다 입력객체를 사용하겠다
		
		try {
			inputstream = new FileInputStream("d:\\hello.txt");  //어떤객체를 쓸거냐면(파일입력객체)
			int data = 0;
			while(true) {
				try {
					data = inputstream.read(); //byte단위로 읽음 = 영문자 1자 (한글은 1자당 3byte)
					
				}catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println("data : " + (char)data);  //char때문에 문자로 읽게됨 
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(inputstream != null) inputstream.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
