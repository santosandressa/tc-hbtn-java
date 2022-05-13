package teste;

public class ReturnResponsedto {

    private String id;

    private String averageDeadline;

    public ReturnResponsedto(String id, String averageDeadline) {
        this.id = id;
        this.averageDeadline = averageDeadline;
    }

    public ReturnResponsedto() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAverageDeadline() {
        return averageDeadline;
    }

    public void setAverageDeadline(String averageDeadline) {
        this.averageDeadline = averageDeadline;
    }
}
