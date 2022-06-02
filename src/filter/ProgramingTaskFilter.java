package filter;

import model.RootResponse;
import model.Task;

import java.util.List;

public class ProgramingTaskFilter implements TaskFilter{
    @Override
    public List<Task> filter(List<RootResponse> rootResponses) {
        //TODO will return only programing task
        return null;
    }
}
