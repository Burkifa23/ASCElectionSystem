/**
 * ElectionOfficer class represents staff members managing the ASC Elections
 */
public class ElectionOfficer {
    // Attributes
    private String name;
    private String staffID;
    private String role;
    private String department;
    private int yearsOfExperience;
    private String assignedLocation;
    private int electionsManaged;
    private String contactPhone;
    private String email;
    private boolean isChiefOfficer;

    // Default Constructor
    public ElectionOfficer() {
        this.name = "Unknown Officer";
        this.staffID = "STAFF000";
        this.role = "Election Officer";
        this.department = "Unknown";
        this.yearsOfExperience = 0;
        this.assignedLocation = "Unknown";
        this.electionsManaged = 0;
        this.contactPhone = "N/A";
        this.email = "unknown@ashesi.edu.gh";
        this.isChiefOfficer = false;
    }

    // Parameterized Constructor
    public ElectionOfficer(String name, String staffID, String role, String department,
                           int yearsOfExperience, String assignedLocation, int electionsManaged,
                           String contactPhone, String email, boolean isChiefOfficer) {
        this.name = name;
        this.staffID = staffID;
        this.role = role;
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.assignedLocation = assignedLocation;
        this.electionsManaged = electionsManaged;
        this.contactPhone = contactPhone;
        this.email = email;
        this.isChiefOfficer = isChiefOfficer;
    }

    // Accessor Methods (Getters)
    public String getName() {
        return name;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getRole() {
        return role;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getAssignedLocation() {
        return assignedLocation;
    }

    public int getElectionsManaged() {
        return electionsManaged;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public boolean isChiefOfficer() {
        return isChiefOfficer;
    }

    // Mutator Methods (Setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setAssignedLocation(String assignedLocation) {
        this.assignedLocation = assignedLocation;
    }

    public void setElectionsManaged(int electionsManaged) {
        this.electionsManaged = electionsManaged;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setChiefOfficer(boolean chiefOfficer) {
        isChiefOfficer = chiefOfficer;
    }

    // Business Methods
    public void recordElectionManaged() {
        this.electionsManaged++;
    }

    public boolean isExperiencedOfficer() {
        return yearsOfExperience >= 3 || electionsManaged >= 5;
    }

    public String getExperienceLevel() {
        if (yearsOfExperience < 2) {
            return "Beginner";
        } else if (yearsOfExperience < 5) {
            return "Intermediate";
        } else {
            return "Expert";
        }
    }

    public String getOfficerTitle() {
        if (isChiefOfficer) {
            return "Chief Election Officer - " + role;
        }
        return role;
    }

    public boolean canSuperviseOthers() {
        return isChiefOfficer || isExperiencedOfficer();
    }

    public String getOfficerSummary() {
        return name + " (" + getOfficerTitle() + ") - " + 
               electionsManaged + " elections managed";
    }

    public void promoteToChiefOfficer() {
        if (isExperiencedOfficer()) {
            this.isChiefOfficer = true;
        }
    }

    // toString Method
    @Override
    public String toString() {
        return "---------------------------------------\n" +
               "ELECTION OFFICER PROFILE\n" +
               "---------------------------------------\n" +
               "Name: " + name + "\n" +
               "Staff ID: " + staffID + "\n" +
               "Title: " + getOfficerTitle() + "\n" +
               "Department: " + department + "\n" +
               "Experience: " + yearsOfExperience + " years (" + getExperienceLevel() + ")\n" +
               "Assigned Location: " + assignedLocation + "\n" +
               "Elections Managed: " + electionsManaged + "\n" +
               "Can Supervise: " + (canSuperviseOthers() ? "Yes" : "No") + "\n" +
               "Contact Phone: " + contactPhone + "\n" +
               "Email: " + email + "\n" +
               "---------------------------------------";
    }
}
