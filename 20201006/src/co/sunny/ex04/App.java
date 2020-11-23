package co.sunny.ex04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Eclipse\\eclipse");
		try {
			Stream<Path> stream = Files.list(path);       //디렉토리명을 보여줌
//			stream.forEach(p -> System.out.println(p.getFileName()));
			stream.forEach(p -> System.out.println(p.getName(2))); //0이면 파일 수만큼 Eclipse 디렉명을 출력하고, 1이면 eclipse를 출력, 2이면 디렉밑의 파일명을 모두 가져온다.

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
