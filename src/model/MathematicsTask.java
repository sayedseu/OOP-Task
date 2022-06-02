package model;

public class MathematicsTask extends Task {
    private String field;

    public MathematicsTask(String title, String description, String createdTime, String updateTime, String field) {
        super(title, description, createdTime, updateTime);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
