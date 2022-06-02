package filter;

import model.RootResponse;
import model.Task;

import java.util.List;

public class FilterManager {
    private TaskFilter taskFilter;

    public TaskFilter getTaskFilter() {
        return taskFilter;
    }

    public void setTaskFilter(TaskFilter taskFilter) {
        this.taskFilter = taskFilter;
    }

    public List<Task> filter(List<RootResponse> responses){
        return taskFilter.filter(responses);
    }
}
