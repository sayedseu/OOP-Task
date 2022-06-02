package model;

public class ProgramingTask extends Task {
    private String platform;
    private String language;

    public ProgramingTask(String title, String description, String createdTime, String updateTime, String platform, String language) {
        super(title, description, createdTime, updateTime);
        this.platform = platform;
        this.language = language;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
