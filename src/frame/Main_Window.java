package frame;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main_Window extends Application {
	Stage window;
	
	Scanner scanner = new Scanner(System.in);
	private int[] dim_xy = new int[1];
	
	// Not the best but as you can only return one object, I am returning an array
	public int[] usr_dim() {
		int x, y;
		System.out.println("Enter value for x: ");
		x = scanner.nextInt();
		
		System.out.println("Enter value for y: ");
		y = scanner.nextInt();
		
		dim_xy[0] = x;
		dim_xy[1] = y;
		
		return dim_xy;
	}
	
	public int init_nodes() { return 0; }
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
        window.setTitle("A Visual Path Finding Application");

        
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, dim_xy[0], dim_xy[1]);

        window.setScene(scene);
        window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
