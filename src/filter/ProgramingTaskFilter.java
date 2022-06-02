package filter;

import model.ProgramingTask;
import model.RootResponse;
import model.Task;

import java.util.List;

import static utils.Constants.TYPE_PROGRAMING;
import static utils.TimeManager.getCurrentTime;

public class ProgramingTaskFilter implements TaskFilter {
    @Override
    public List<Task> filter(List<RootResponse> rootResponses) {
        return rootResponses.stream()
                .filter(element -> element.getType().equalsIgnoreCase(TYPE_PROGRAMING))
                .map(element -> (Task) new ProgramingTask(
                        element.getTitile(),
                        element.getDescription(),
                        getCurrentTime(),
                        getCurrentTime(),
                        element.getPlaforms(),
                        element.getLanguage()
                )).toList();
    }
}
