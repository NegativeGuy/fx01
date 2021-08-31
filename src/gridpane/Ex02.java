package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridpane = new GridPane();
		
		Button button = new Button("Button");
		GridPane.setConstraints(button, 0, 0);
		
		Label label = new Label("Label");
		GridPane.setConstraints(label, 1, 1);
		
		gridpane.getChildren().addAll(button, label);
		Button btn = new Button("1, 0");
		gridpane.add(btn, 1, 0);
		gridpane.add(new Label("0, 1"), 0, 1);
		
		gridpane.setPadding(new Insets(20)); //4면(위아래 양옆) 모두 20씩
		gridpane.setVgap(10);
		gridpane.setHgap(50);
		
		
		arg0.setScene(new Scene(gridpane, 300, 300));
		
		FlowPane flowPane = new FlowPane();
		flowPane.getChildren().add(new Button("merge col(0), row(2)"));
		flowPane.setStyle("-fx-background-color:black;");	// 배경 색 설정
		flowPane.setAlignment(Pos.CENTER);
		gridpane.add(flowPane, 0, 2, 2, 1); // 가로, 세로, 가로병합, 세로병합
		// 세로병합은 옆에 개체가 없기 때문에 1로 나 자신만 병합으로 넣었다.
		// gridpane.add(flowPane, 0, 2);  병합하기 전과 비교 해보면 이해됨
		
		arg0.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}












