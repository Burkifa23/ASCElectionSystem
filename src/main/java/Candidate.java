public class Candidate {
    // Attributes
    private String name;
    private String studentID;
    private String position;
    private String yearOfStudy;
    private String major;
    private String manifesto;
    private int votesReceived;
    private String campaignSlogan;
    private boolean isIncumbent;
    private String contactEmail;

    // Default Constructor
    public Candidate() {
        this.name = "Unknown Candidate";
        this.studentID = "0000000";
        this.position = "Unknown Position";
        this.yearOfStudy = "Unknown";
        this.major = "Unknown";
        this.manifesto = "No manifesto provided";
        this.votesReceived = 0;
        this.campaignSlogan = "No slogan";
        this.isIncumbent = false;
        this.contactEmail = "unknown@ashesi.edu.gh";
    }

    // Parameterized Constructor
    public Candidate(String name, String studentID, String position, String yearOfStudy,
                     String major, String manifesto, int votesReceived, String campaignSlogan,
                     boolean isIncumbent, String contactEmail) {
        this.name = name;
        this.studentID = studentID;
        this.position = position;
        this.yearOfStudy = yearOfStudy;
        this.major = major;
        this.manifesto = manifesto;
        this.votesReceived = votesReceived;
        this.campaignSlogan = campaignSlogan;
        this.isIncumbent = isIncumbent;
        this.contactEmail = contactEmail;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getPosition() {
        return position;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public String getMajor() {
        return major;
    }

    public String getManifesto() {
        return manifesto;
    }

    public int getVotesReceived() {
        return votesReceived;
    }

    public String getCampaignSlogan() {
        return campaignSlogan;
    }

    public boolean isIncumbent() {
        return isIncumbent;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setManifesto(String manifesto) {
        this.manifesto = manifesto;
    }

    public void setVotesReceived(int votesReceived) {
        this.votesReceived = votesReceived;
    }

    public void setCampaignSlogan(String campaignSlogan) {
        this.campaignSlogan = campaignSlogan;
    }

    public void setIncumbent(boolean incumbent) {
        isIncumbent = incumbent;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    // Voting
    public void addVote() {
        this.votesReceived++;
    }

    public void addVotes(int votes) {
        this.votesReceived += votes;
    }

    public boolean isSeniorStudent() {
        return yearOfStudy.equalsIgnoreCase("Senior") || 
               yearOfStudy.equalsIgnoreCase("Year 4") ||
               yearOfStudy.equalsIgnoreCase("Fourth Year");
    }

    public String getCandidateStatus() {
        return isIncumbent ? "Incumbent (Seeking Re-election)" : "New Candidate";
    }

    public double calculateVotePercentage(int totalVotes) {
        if (totalVotes == 0) {
            return 0.0;
        }
        return (votesReceived * 100.0) / totalVotes;
    }

    public String getShortProfile() {
        return name + " (" + yearOfStudy + " - " + major + ")";
    }

    // toString Method
    @Override
    public String toString() {
        return "CANDIDATE PROFILE\n" +
               "Name: " + name + "\n" +
               "Student ID: " + studentID + "\n" +
               "Position: " + position + "\n" +
               "Year: " + yearOfStudy + "\n" +
               "Major: " + major + "\n" +
               "Status: " + getCandidateStatus() + "\n" +
               "Campaign Slogan: \"" + campaignSlogan + "\"\n" +
               "Votes Received: " + votesReceived + "\n" +
               "Email: " + contactEmail + "\n" +
               "Manifesto: " + manifesto + "\n";
    }
}
