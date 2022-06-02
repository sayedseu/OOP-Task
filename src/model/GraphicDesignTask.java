package model;

public class GraphicDesignTask extends Task {
    private String platform;
    private String output;

    public GraphicDesignTask(String title, String description, String createdTime, String updateTime, String platform, String output) {
        super(title, description, createdTime, updateTime);
        this.platform = platform;
        this.output = output;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
