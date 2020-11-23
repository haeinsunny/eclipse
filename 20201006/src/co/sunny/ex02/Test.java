package co.sunny.ex02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {    //파일을 받아서 복사본을 생성해보자

	public static void main(String[] args) {
		InputStream inputstream = null; // 파일을 읽겠다 입력객체를 사용하겠다
		OutputStream outputStream = null;
		int data = 0;

		try {
			inputstream = new FileInputStream("d:\\hello.txt"); // 어떤객체를 쓸거냐면(파일입력객체)
			outputStream = new FileOutputStream("d:\\copyhello.txt");
			while (true) {
				try {
					data = inputstream.read(); // byte단위로 읽음 = 영문자 1자 (한글은 1자당 3byte)
					if (data == -1)
						break;
					outputStream.write(data);  //write메소드는 void인데 byte를 받아서 그 값을 write로 출력시킴
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputstream != null)
					inputstream.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
