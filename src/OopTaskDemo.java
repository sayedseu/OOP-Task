import db.DatabaseHelper;
import filter.FilterManager;
import filter.GraphicDesignTaskFilter;
import filter.MathematicsTaskFilter;
import filter.ProgramingTaskFilter;
import model.RootResponse;
import model.Task;
import parser.Parser;
import parser.ParserFactory;

import java.util.List;

public class OopTaskDemo {

    public static void main(String[] args) {

        final String file = "some file";

        ParserFactory parserFactory = new ParserFactory();
        Parser parser = parserFactory.getParser("JSON");
        List<RootResponse> parsedTask = parser.parse(file);

        FilterManager filterManager = new FilterManager();
        filterManager.setTaskFilter(new ProgramingTaskFilter());
        List<Task> programingTask = filterManager.filter(parsedTask);

        filterManager.setTaskFilter(new MathematicsTaskFilter());
        List<Task> mathTask = filterManager.filter(parsedTask);

        filterManager.setTaskFilter(new GraphicDesignTaskFilter());
        List<Task> graphicDesignTask = filterManager.filter(parsedTask);

        DatabaseHelper databaseHelper = new DatabaseHelper();
        databaseHelper.insert(programingTask);
        databaseHelper.insert(mathTask);
        databaseHelper.insert(graphicDesignTask);

    }
}
