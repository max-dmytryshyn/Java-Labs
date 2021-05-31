package interview;

public class Interview {

    private String interviewerName;
    private float durationInMinutes;
    private String result;

    private String meansOfCommunication;
    private String location;
    private String date;
    private boolean isRecorded;
    private boolean isBlind;

    static private int interviewCounter;

    protected String topic;
    protected String type;

    public void setValues(String interviewerName, float durationInMinutes, String result, String meansOfCommunication,
                          String location, String date, boolean isRecorded, boolean isBlind, String topic, String type){
        this.setInterviewerName(interviewerName);
        this.setDurationInMinutes(durationInMinutes);
        this.setResult(result);
        this.setMeansOfCommunication(meansOfCommunication);
        this.setLocation(location);
        this.setDate(date);
        this.setRecorded(isRecorded);
        this.setBlind(isBlind);
        this.setTopic(topic);
        this.setType(type);
    }

    public Interview(String interviewerName, float durationInMinutes, String result, String meansOfCommunication,
                     String location, String date, boolean isRecorded, boolean isBlind, String topic, String type) {
        this.setValues(interviewerName, durationInMinutes, result, meansOfCommunication, location, date, isRecorded,
                       isBlind, topic, type);
        interviewCounter++;
    }

    public Interview(String interviewerName, float durationInMinutes, String result, String meansOfCommunication) {
        this(interviewerName, durationInMinutes, result, meansOfCommunication, "Lviv, Veteraniv Street 11", "04.04.2022",
                true, true, "Data Science Engineer position offer", "Job interview");
    }

    public Interview() {
        this("Zenoviy Veres", 90, "Hired", "Zoom");
    }

    @Override
    public String toString() {
        return "Interviewer name: " + this.getInterviewerName() + "\n" +
                "Duration: " + this.getDurationInMinutes() + " minutes" + "\n" +
                "Result: " + this.getResult() + "\n" +
                "Means of communication: " + this.getMeansOfCommunication() + "\n" +
                "Location: " + this.getLocation() + "\n" +
                "Date: " + this.getDate() + "\n" +
                "Recorded: " + this.isRecorded() + "\n" +
                "Blind: " + this.isBlind() + "\n" +
                "Topic: " + this.getTopic() + "\n" +
                "Type: " + this.getType() + "\n";
    }

    public static void printStaticInterviewCounter() {
        System.out.println("Interviews conducted: " + getInterviewCounter());
    }

    public void printInterviewCounter() {
        System.out.println("Interviews conducted: " + getInterviewCounter());
    }

    public void resetValues(String interviewerName, float durationInMinutes, String result, String meansOfCommunication,
                            String location, String date, boolean isRecorded, boolean isBlind, String topic, String type
    ) {
        this.setValues(interviewerName, durationInMinutes, result, meansOfCommunication, location, date, isRecorded,
                isBlind, topic, type);
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public float getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(float durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMeansOfCommunication() {
        return meansOfCommunication;
    }

    public void setMeansOfCommunication(String meansOfCommunication) {
        this.meansOfCommunication = meansOfCommunication;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    public void setRecorded(boolean recorded) {
        isRecorded = recorded;
    }

    public boolean isBlind() {
        return isBlind;
    }

    public void setBlind(boolean blind) {
        isBlind = blind;
    }

    public static int getInterviewCounter() {
        return interviewCounter;
    }

    public static void resetInterviewCounter() {
        Interview.interviewCounter = 0;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
