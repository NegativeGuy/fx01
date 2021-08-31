package gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		
		Button btn = new Button("Button");
		GridPane.setConstraints(btn, 0, 0); // 가로 세로
		// Constraints : 제약, 강제
		// GridPane.setConstraints이 변수명으로 접근하지 않고
		// GridPane라는 클래스명으로 접근한 이유는 static으로 만들어진 클래스라서
		// (변수명-gridPane으로 접근해도 상관 없음)
		// 예) gridPane.setConstraints
		// 버튼을 0,0(배열) 위치에 배치
		
		Label label = new Label("Label");
		GridPane.setConstraints(label, 0, 2); // 가로 세로
		
		
		Label label02 = new Label("Label02");
		GridPane.setConstraints(label02, 1, 1); // 가로 세로
		
		gridPane.getChildren().addAll(btn, label, label02);
		
		arg0.setScene(new Scene(gridPane, 300, 100));
		
		
		arg0.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
