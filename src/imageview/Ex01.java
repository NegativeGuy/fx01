package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ImageView iv = new ImageView("/img/smilerere.png");
		//iv.setImage(new Image("/img/calendar.png"));
		// 객체.set 으로도 이미지를 넣을 수 있음. 대신 new Image를 사용해야함
		
		// 이미지 사이즈 설정
		//iv.setFitHeight(100);
		iv.setFitWidth(50);
		iv.setPreserveRatio(true);
		// 하나의 사이즈만 설정해도 비율을 맞춰줌

		// 이미지 회전(각도)
		iv.setRotate(45);
		
		ap.getChildren().add(iv);
		arg0.setScene(new Scene(ap, 300, 200));
		
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
