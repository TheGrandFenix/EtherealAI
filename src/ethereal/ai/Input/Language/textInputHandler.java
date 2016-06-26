package ethereal.ai.Input.Language;

import ethereal.ai.Processing.Language.DirectText.DirectTextAnalysis;

public class textInputHandler {

    public void HandleTextInput(String input){

        DirectTextAnalysis analyser = new DirectTextAnalysis();
        analyser.AnalyseInput(input);

    }

}
