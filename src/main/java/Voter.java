public class Voter {
    // Attributes
    private String name;
    private String studentID;
    private String yearOfStudy;
    private String major;
    private boolean hasVoted;
    private String votingDate;
    private String votingTime;
    private boolean isRegistered;
    private String residentialStatus;
    private String email;

    // Default Constructor
    public Voter() {
        this.name = "Unknown Voter";
        this.studentID = "0000000";
        this.yearOfStudy = "Unknown";
        this.major = "Unknown";
        this.hasVoted = false;
        this.votingDate = "Not voted";
        this.votingTime = "Not voted";
        this.isRegistered = false;
        this.residentialStatus = "Unknown";
        this.email = "unknown@ashesi.edu.gh";
    }

    // Parameterized Constructor
    public Voter(String name, String studentID, String yearOfStudy, String major,
                 boolean hasVoted, String votingDate, String votingTime, boolean isRegistered,
                 String residentialStatus, String email) {
        this.name = name;
        this.studentID = studentID;
        this.yearOfStudy = yearOfStudy;
        this.major = major;
        this.hasVoted = hasVoted;
        this.votingDate = votingDate;
        this.votingTime = votingTime;
        this.isRegistered = isRegistered;
        this.residentialStatus = residentialStatus;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public String getMajor() {
        return major;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public String getVotingDate() {
        return votingDate;
    }

    public String getVotingTime() {
        return votingTime;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public void setVotingDate(String votingDate) {
        this.votingDate = votingDate;
    }

    public void setVotingTime(String votingTime) {
        this.votingTime = votingTime;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Voting
    public boolean canVote() {
        return isRegistered && !hasVoted;
    }

    public void castVote(String date, String time) {
        if (canVote()) {
            this.hasVoted = true;
            this.votingDate = date;
            this.votingTime = time;
        }
    }

    public String getVotingStatus() {
        if (!isRegistered) {
            return "Not Registered";
        } else if (hasVoted) {
            return "Voted on " + votingDate + " at " + votingTime;
        } else {
            return "Registered - Not Yet Voted";
        }
    }

    public boolean isOnCampusResident() {
        return residentialStatus.equalsIgnoreCase("On-Campus") || 
               residentialStatus.equalsIgnoreCase("Resident");
    }

    public String getVoterProfile() {
        return name + " (" + studentID + ") - " + yearOfStudy + " " + major + " student";
    }

    public void registerVoter() {
        this.isRegistered = true;
    }

    // toString Method
    @Override
    public String toString() {
        return "VOTER INFORMATION\n" +
               "Name: " + name + "\n" +
               "Student ID: " + studentID + "\n" +
               "Year: " + yearOfStudy + "\n" +
               "Major: " + major + "\n" +
               "Residential Status: " + residentialStatus + "\n" +
               "Registration Status: " + (isRegistered ? "Registered" : "Not Registered") + "\n" +
               "Voting Status: " + getVotingStatus() + "\n" +
               "Eligible to Vote: " + (canVote() ? "Yes" : "No") + "\n" +
               "Email: " + email + "\n";
    }
}
