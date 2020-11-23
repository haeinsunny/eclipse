package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml"));
		// TODO Auto-generated method stub
		Scene scene = new Scene(root);  //scene을 stage에 탑재
		
		primaryStage.setTitle("Hello JavaFX");  //stage 정의
//		primaryStage.setResizable(false);  //사이즈조절 막기 또는 가능
		primaryStage.setScene(scene);  //scene을 담다 (scene 이름이 scene)

		primaryStage.show(); // stage를 보여준다
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);   // 실행명령어
	}

}
