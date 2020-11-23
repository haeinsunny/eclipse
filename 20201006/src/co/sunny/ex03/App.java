package co.sunny.ex03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		Path path = Paths.get("src/co/sunny/ex03/linedata"); // 파일경로를 가져와달라
		Stream<String> stream;
//		files.lines 이용해서

		try {
			stream = Files.lines(path, Charset.defaultCharset());
			stream.forEach(System.out::println);
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
// BufferReader 이용해서
		File file = path.toFile();

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("==========버퍼리드로 읽어 온 값을 보여준다===========");
			stream = br.lines();
			stream.forEach(System.out::println);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
