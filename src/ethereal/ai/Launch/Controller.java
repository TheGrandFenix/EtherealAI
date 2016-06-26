package ethereal.ai.Launch;

import ethereal.ai.Input.Language.textInputHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

public class Controller {

    public StackPane main_stack;
    public Label response_text;
    public TextField input_text;

    public void receiveInput() {

        textInputHandler interpreter = new textInputHandler();
        interpreter.HandleTextInput(input_text.getText());
        input_text.clear();

    }
}
