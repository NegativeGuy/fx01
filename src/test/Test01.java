package test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Test01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		
		FlowPane fpT = new FlowPane();
		Label lb = new Label("메뉴");
		Label lb1 = new Label("홈");
		Label lb2 = new Label("로그인");
		
		fpT.getChildren().addAll(lb, lb1, lb2);
//		fp.getChildren().add(lb);
//		fp.getChildren().add(lb1);
//		fp.getChildren().add(lb2);
		fpT.setAlignment(Pos.BASELINE_RIGHT);	// 오른쪽 정렬
		fpT.setHgap(20);	// 각 label에 간격 20씩 추가
		fpT.setPadding(new Insets(10,30,10,0));	// 여백 추가
		fpT.setStyle("-fx-background-color:pink");	// 배경색 추가
		fpT.setPrefSize(500, 50);
		
		bp.setTop(fpT);	// 모든 fp 설정을 bp의 Top에 추가

		FlowPane fpL = new FlowPane();
		Button bLeft = new Button("메뉴 나열");
		fpL.getChildren().add(bLeft);
		fpL.setStyle("-fx-background-color:skyblue;");
		fpL.setPrefSize(100, 300);
		
		bp.setLeft(fpL);

		FlowPane fpC = new FlowPane();
		Button bCenter = new Button("내용 들어가는 곳");
		fpC.getChildren().add(bCenter);
		fpC.setStyle("-fx-background-color:#CEF279;");
		bp.setCenter(fpC);
		
		GridPane gpR = new GridPane();
		Button id = new Button("아이디 입력");
		GridPane.setConstraints(id, 0, 0);	
		//해당 버튼이 GridPane 내에서 좌표(0,0)에 생성
		id.setPrefSize(100, 20);
		
		Button pwd = new Button("비밀번호 입력");
		GridPane.setConstraints(pwd, 0, 1);	
		pwd.setPrefSize(100, 20);

		Button login = new Button("로그인");
		GridPane.setConstraints(login, 1, 0, 1, 2);
		login.setPrefSize(70, 40);
		// 앞의 1, 0 은 좌표 위치
		// 뒤의 1, 2 는 병합 : 1은 병합할게 없을때 2는 2개를 하나로 병합
		// 병합 시 앞의 숫자는 가로병합, 뒤의 숫자는 세로병합
		// 위에서는 가로병합은 없고 세로병합만 2개를 하나로 만들어야 해서 1,2가 됨
		
		gpR.getChildren().addAll(id, pwd, login);
		gpR.setPadding(new Insets(100,20,0,20)); // 여백추가
		gpR.setStyle("-fx-background-color:hotpink;"); // 배경색
		gpR.setPrefSize(200, 350); // GridPane 사이즈
		
		bp.setRight(gpR);
		
		
		FlowPane fpB = new FlowPane();
		Button bBottom = new Button("바닥글 들어가는 곳");
		fpB.getChildren().add(bBottom);
		fpB.setStyle("-fx-background-color:gray;");
		fpB.setPrefSize(300, 20);
		fpB.setAlignment(Pos.CENTER); // 가운데 정렬
		bp.setBottom(fpB);
		
		arg0.setScene(new Scene(bp));
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
