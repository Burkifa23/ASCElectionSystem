public class ASCElection {
    // Attributes
    private String eventName;
    private String location;
    private String startDate;
    private String endDate;
    private String time;
    private int durationDays;
    private String electionType;
    private int totalRegisteredVoters;
    private String votingMethod;
    private int numberOfPositions;

    // Default Constructor
    public ASCElection() {
        this.eventName = "Unknown Election";
        this.location = "Unknown Location";
        this.startDate = "TBA";
        this.endDate = "TBA";
        this.time = "TBA";
        this.durationDays = 0;
        this.electionType = "General";
        this.totalRegisteredVoters = 0;
        this.votingMethod = "Unknown";
        this.numberOfPositions = 0;
    }

    // Parameterized Constructor
    public ASCElection(String eventName, String location, String startDate, String endDate, 
                       String time, int durationDays, String electionType, 
                       int totalRegisteredVoters, String votingMethod, int numberOfPositions) {
        this.eventName = eventName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.time = time;
        this.durationDays = durationDays;
        this.electionType = electionType;
        this.totalRegisteredVoters = totalRegisteredVoters;
        this.votingMethod = votingMethod;
        this.numberOfPositions = numberOfPositions;
    }

    // Accessor Methods (Getters)
    public String getEventName() {
        return eventName;
    }

    public String getLocation() {
        return location;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getTime() {
        return time;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public String getElectionType() {
        return electionType;
    }

    public int getTotalRegisteredVoters() {
        return totalRegisteredVoters;
    }

    public String getVotingMethod() {
        return votingMethod;
    }

    public int getNumberOfPositions() {
        return numberOfPositions;
    }

    // Mutator Methods (Setters)
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public void setElectionType(String electionType) {
        this.electionType = electionType;
    }

    public void setTotalRegisteredVoters(int totalRegisteredVoters) {
        this.totalRegisteredVoters = totalRegisteredVoters;
    }

    public void setVotingMethod(String votingMethod) {
        this.votingMethod = votingMethod;
    }

    public void setNumberOfPositions(int numberOfPositions) {
        this.numberOfPositions = numberOfPositions;
    }

    // Business Methods
    public boolean isMultiDayEvent() {
        return durationDays > 1;
    }

    public String getElectionPeriod() {
        return startDate + " to " + endDate;
    }

    public double calculateVoterTurnoutPercentage(int actualVoters) {
        if (totalRegisteredVoters == 0) {
            return 0.0;
        }
        return (actualVoters * 100.0) / totalRegisteredVoters;
    }

    public boolean isOnlineVoting() {
        return votingMethod.toLowerCase().contains("online") || 
               votingMethod.toLowerCase().contains("digital");
    }

    public int getAverageCandidatesPerPosition() {
        if (numberOfPositions == 0) {
            return 0;
        }
        return totalRegisteredVoters / numberOfPositions;
    }

    // toString Method
    @Override
    public String toString() {
        return "EVENT: " + eventName + "\n" +
               "Location: " + location + "\n" +
               "Election Period: " + getElectionPeriod() + "\n" +
               "Voting Time: " + time + "\n" +
               "Duration: " + durationDays + " days\n" +
               "Election Type: " + electionType + "\n" +
               "Registered Voters: " + totalRegisteredVoters + "\n" +
               "Voting Method: " + votingMethod + "\n" +
               "Positions Available: " + numberOfPositions + "\n" +
               "Multi-day Event: " + (isMultiDayEvent() ? "Yes" : "No") + "\n" +
               "Online Voting: " + (isOnlineVoting() ? "Yes" : "No") + "\n";
    }
}
