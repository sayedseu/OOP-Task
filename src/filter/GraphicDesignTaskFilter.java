package filter;

import model.GraphicDesignTask;
import model.RootResponse;
import model.Task;

import java.util.List;

import static utils.Constants.TYPE_GRAPHIC_DESIGN;
import static utils.TimeManager.getCurrentTime;

public class GraphicDesignTaskFilter implements TaskFilter {
    @Override
    public List<Task> filter(List<RootResponse> rootResponses) {
        return rootResponses.stream()
                .filter(element -> element.getType().equalsIgnoreCase(TYPE_GRAPHIC_DESIGN))
                .map(element -> (Task) new GraphicDesignTask(
                        element.getTitile(),
                        element.getDescription(),
                        getCurrentTime(),
                        getCurrentTime(),
                        element.getPlaforms(),
                        element.getOutput()
                )).toList();
    }
}
