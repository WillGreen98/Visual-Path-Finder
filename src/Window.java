import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Window extends Application {
	Stage window;
	

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
        window.setTitle("Path Finding Application");

        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, 400, 400);

        window.setScene(scene);
        window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
