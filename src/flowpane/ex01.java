package flowpane;
import java.util.Scanner;

// main을 작업할때 무조건 properties에서 
// run/debug setting 을 해줘야 한다
// 자세한 설명은 onenote [javafx]를 확인
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		//FlowPane flowPane = new FlowPane();	// FlowPane객체 생성
		// FlowPane 방식은 순차적으로 오른쪽에 생성하는 방식
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
		// 기본은 가로 배치지만 Orientation.VERTICAL를 사용하면 세로 배치
		
		Scanner input = new Scanner(System.in);
		//Button btn;
		System.out.println("생성할 버튼의 수를 입력하세요");
		System.out.print(">>> ");
		int btn00 = input.nextInt();
		for(int i=1; i<=btn00; i++) {
			if(i<=9) {
				flowPane.getChildren().add(new Button("버튼0"+i));
				// add()안에 'new Button("버튼0"+i)'만 넣어주면 됨
			}else {
				flowPane.getChildren().add(new Button("버튼"+i));
			}
		}
		
//		Button btn01 = new Button("버튼01");	// 버튼 생성
//		Button btn02 = new Button("버튼02");
//		Button btn03 = new Button("버튼03");
//		
//		flowPane.getChildren().add(btn01);	// 순차적으로 버튼이 생성
//		flowPane.getChildren().add(btn02);	// 순차적으로 버튼이 생성
//		flowPane.getChildren().add(btn03);	// 순차적으로 버튼이 생성
		
		flowPane.setPadding(new Insets(10,10,10,10));
		// 안쪽으로 여백을 준다, 위,아래 양옆
		
		flowPane.setVgap(80); 	// 가로 갭
		flowPane.setHgap(10);	// 세로 갭
		
		Scene sc = new Scene(flowPane, 200,100);
		// 컨테이너를 올려놓을 장판(Scene) 생성
		
		arg0.setScene(sc);
		// 컨테이너를 올린 장판을 바닥(arg0)에 깔아줌
		arg0.show();
		// 컨테이너가 올라간 장판을 깐 바닥을 화면으로 띄움
		
	}
	public static void main(String[] args) {
		launch(args);
		// launch가 실행되면 위의 start()가 실행됨
	}
}
