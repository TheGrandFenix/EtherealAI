package ethereal.ai.Launch;

import ethereal.ai.Interpreting.Language.directInputInterpreter;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

public class Controller {

    public StackPane main_stack;
    public Label response_text;
    public TextField input_text;

    public void receiveInput() {

        directInputInterpreter interpreter = new directInputInterpreter();
        interpreter.AnalyseInput(input_text.getText());
        input_text.clear();

    }
}
