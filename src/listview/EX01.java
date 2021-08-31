package listview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EX01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ListView<String> listView = new ListView<String>();
		
		listView.getItems().addAll("item1", "item2", "item3");
		listView.setPrefSize(300, 200);	// ListView 크기 설정
		listView.setLayoutX(20);	// 좌표로 위치 설정
		listView.setLayoutY(20);
		
		ap.getChildren().add(listView);
		ap.setPrefSize(500, 300);	// AnchorPane의 크기 설정
		
		arg0.setScene(new Scene(ap));
		
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
