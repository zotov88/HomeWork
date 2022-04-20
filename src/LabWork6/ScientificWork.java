package LabWork6;

public class ScientificWork {

    private String title;
    private String body;

    public ScientificWork(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "\"" + title + "\"";
    }
}
