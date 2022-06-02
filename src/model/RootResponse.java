package model;

public class RootResponse {
    private String titile;
    private String description;
    private String plaforms;
    private String language;
    private String field;
    private String output;

    public RootResponse(String titile, String description, String plaforms, String language, String field, String output) {
        this.titile = titile;
        this.description = description;
        this.plaforms = plaforms;
        this.language = language;
        this.field = field;
        this.output = output;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlaforms() {
        return plaforms;
    }

    public void setPlaforms(String plaforms) {
        this.plaforms = plaforms;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
