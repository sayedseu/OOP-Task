package filter;

import model.MathematicsTask;
import model.RootResponse;
import model.Task;

import java.util.List;

import static utils.Constants.TYPE_MATHEMATICS;
import static utils.TimeManager.getCurrentTime;

public class MathematicsTaskFilter implements TaskFilter {
    @Override
    public List<Task> filter(List<RootResponse> rootResponses) {
        return rootResponses.stream()
                .filter(element -> element.getType().equalsIgnoreCase(TYPE_MATHEMATICS))
                .map(element -> (Task) new MathematicsTask(
                        element.getTitile(),
                        element.getDescription(),
                        getCurrentTime(),
                        getCurrentTime(),
                        element.getField()
                )).toList();
    }
}
