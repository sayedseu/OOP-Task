package filter;

import model.RootResponse;
import model.Task;

import java.util.List;

public interface TaskFilter {
    List<Task> filter(List<RootResponse> rootResponses);
}
