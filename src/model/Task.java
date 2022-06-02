package model;

public class Task {
    protected String title;
    protected String description;
    protected String createdTime;
    protected String updateTime;

    public Task(String title, String description, String createdTime, String updateTime) {
        this.title = title;
        this.description = description;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
