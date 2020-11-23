package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//		TODO
//			이 사이에 내가 원하는 컨테이너 (담는곳)
//			컨트롤(담을것) 작업 (없앤 부분이 한 묶음이며, scene이 없는 stage가 뜸 )
//			
			
			VBox root = new VBox();  //container작업
			
			root.setPrefSize(400, 400); //container 를 scene에 탑재
			root.setAlignment(Pos.CENTER); //scene에 담기전에 컨트롤 작업
			
			Button btn = new Button("종료");  //버튼만드는 컨트롤작업
			btn.setOnAction(event -> Platform.exit());
			btn.setPrefSize(60, 40);
			root.getChildren().add(btn);  //버튼을 VBox컨테이너에 담는것
			
			Scene scene = new Scene(root);  //scene을 stage에 탑재
			
			primaryStage.setTitle("Hello JavaFX");  //stage 정의
//			primaryStage.setResizable(false);  //사이즈조절 막기 또는 가능
			primaryStage.setScene(scene);  //scene을 담다 (scene 이름이 scene)

			primaryStage.show(); // stage를 보여준다
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,800,400);  //border팬(root)의 사이즈
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene); //stage를 보여줄땐 scene을 얹어야 보여주수있다.
//			primaryStage.show();  //stage를 보여달라
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
		launch(args);   // 실행명령어
	}
}
