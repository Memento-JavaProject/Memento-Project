import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.geometry.Insets;

import java.util.ArrayList;
import java.util.List;

public class ToDoPage {
    private StackPane layout; // 기본 레이아웃을 StackPane으로 설정
    private VBox todoList; // 체크리스트 항목을 담을 VBox
    private List<CheckBox> todoItems; // 체크리스트 항목을 관리하는 리스트
    private Button addButton; // 플러스 버튼

    public ToDoPage() {
        todoItems = new ArrayList<>();
        todoList = new VBox();
        todoList.setSpacing(10); // 체크리스트 항목 간격 설정
        todoList.setPadding(new Insets(10));

        layout = new StackPane(); // StackPane 생성
        layout.setStyle("-fx-background-color: #FFFFFF;");

        // 플러스 버튼 생성
        addButton = new Button("+");
        addButton.setOnAction(e -> addTodoItem());

        // 전체 레이아웃에 체크리스트와 플러스 버튼 추가
        VBox vbox = new VBox(10, todoList, addButton); // VBox 사용
        vbox.setPadding(new Insets(20));
        layout.getChildren().add(vbox); // StackPane에 VBox 추가
    }

    // 체크리스트 항목 추가
    private void addTodoItem() {
        CheckBox newCheckBox = new CheckBox("새 할 일");
        todoItems.add(newCheckBox);
        todoList.getChildren().add(newCheckBox);
    }

    public StackPane getLayout() { // StackPane 반환
        return layout;
    }
}
