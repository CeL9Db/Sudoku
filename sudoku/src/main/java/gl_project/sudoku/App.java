package gl_project.sudoku;

/**
 * Hello world!
 *
 */
public class App 
{
    /*public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/
	@Override
    public void start(Stage stage) {
        Circle cercle = new Circle(150, 100, 50);
        cercle.setFill(Color.BLUE);

        Pane root = new Pane(cercle);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Mini test JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
