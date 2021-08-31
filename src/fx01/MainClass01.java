package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
	// stage는 틀을 만들어준 것. 그림으로치면 캔버스 프레임인 셈.
		Label lb = new Label("Hello World");
		lb.setFont(new Font(20));
		// 라벨에다 글씨를 쓰고 폰트를 설정
		
		Scene scene = new Scene(lb, 200,100);// 200,100 은 가로세로 사이즈
		// 장판 만들기, 캔버스로 치면 종이를 깔기
		
		arg0.setScene(scene);
		// 장판위에 라벨을 붙인다
		// 그러나 Scene(장판)는 하나의 개체만 담을 수 있기 때문에
		// 여러가지 개체를 담기 위해서는 컨테이너를 사용해야한다
		// 컨테이너에 여러개체를 담고 그 컨테이너를 scene에 담는 방식이다
		// 컨테이너에는 여러가지 pane이 있다
		
		arg0.setTitle("test");	// 틀의 이름을 설정
		arg0.show();
	}
}
