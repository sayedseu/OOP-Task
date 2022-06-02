package filter;

import model.RootResponse;
import model.Task;

import java.util.List;

public class MathematicsTaskFilter implements TaskFilter{
    @Override
    public List<Task> filter(List<RootResponse> rootResponses) {
        //TODO will return only Mathematics task
        return null;
    }
}
