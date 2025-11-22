import org.junit.Test;
import static org.junit.Assert.*;

public class ASCElectionTest {

    // ASCElection Class Tests
    
    @Test
    public void testASCElectionObject1() {
        // Creating first ASC Election event object
        ASCElection election1 = new ASCElection(
            "Ashesi Students Council Elections 2025",
            "Ashesi University",
            "November 24, 2025",
            "November 26, 2025",
            "8:00 AM - 8:00 PM",
            3,
            "Student Government Elections",
            850,
            "Online Voting Platform",
            8
        );

        // Testing all getters
        assertEquals("Ashesi Students Council Elections 2025", election1.getEventName());
        assertEquals("Ashesi University", election1.getLocation());
        assertEquals("November 24, 2025", election1.getStartDate());
        assertEquals("November 26, 2025", election1.getEndDate());
        assertEquals("8:00 AM - 8:00 PM", election1.getTime());
        assertEquals(3, election1.getDurationDays());
        assertEquals("Student Government Elections", election1.getElectionType());
        assertEquals(850, election1.getTotalRegisteredVoters());
        assertEquals("Online Voting Platform", election1.getVotingMethod());
        assertEquals(8, election1.getNumberOfPositions());

        // Testing voting methods
        assertTrue(election1.isMultiDayEvent());
        assertTrue(election1.isOnlineVoting());
        assertEquals("November 24, 2025 to November 26, 2025", election1.getElectionPeriod());
        assertEquals(70.59, election1.calculateVoterTurnoutPercentage(600), 0.1);
    }

    @Test
    public void testASCElectionObject2() {
        // Creating second ASC Election event object using default constructor
        ASCElection election2 = new ASCElection();
        
        // Testing default values
        assertEquals("Unknown Election", election2.getEventName());
        assertEquals("Unknown Location", election2.getLocation());
        
        // Testing setters
        election2.setEventName("ASC Mid-Year Elections");
        election2.setLocation("Ashesi Campus");
        election2.setStartDate("March 15, 2026");
        election2.setEndDate("March 15, 2026");
        election2.setDurationDays(1);
        election2.setTotalRegisteredVoters(400);
        election2.setVotingMethod("In-Person Voting");
        election2.setNumberOfPositions(3);

        // Verifying setters worked
        assertEquals("ASC Mid-Year Elections", election2.getEventName());
        assertEquals("Ashesi Campus", election2.getLocation());
        assertEquals("March 15, 2026", election2.getStartDate());
        assertEquals(1, election2.getDurationDays());
        
        // Testing voting methods
        assertFalse(election2.isMultiDayEvent());
        assertFalse(election2.isOnlineVoting());
    }

    @Test
    public void testASCElectionToString() {
        ASCElection election = new ASCElection(
            "ASC Elections", "Ashesi", "Nov 24", "Nov 26", "All Day",
            3, "General", 800, "Online", 7
        );
        
        String result = election.toString();
        assertTrue(result.contains("ASC Elections"));
        assertTrue(result.contains("Ashesi"));
        assertTrue(result.contains("800"));
    }

    // Candidate Class Tests
    
    @Test
    public void testCandidateObject1() {
        // Creating a Presidential Candidate object
        Candidate candidate1 = new Candidate(
            "Kwame Mensah",
            "4523019",
            "ASC President",
            "Senior",
            "Computer Science",
            "I will improve student welfare, enhance communication between students and administration, and create more opportunities for student engagement.",
            245,
            "Together We Rise",
            false,
            "kwame.mensah@ashesi.edu.gh"
        );

        // Testing all getters
        assertEquals("Kwame Mensah", candidate1.getName());
        assertEquals("4523019", candidate1.getStudentID());
        assertEquals("ASC President", candidate1.getPosition());
        assertEquals("Senior", candidate1.getYearOfStudy());
        assertEquals("Computer Science", candidate1.getMajor());
        assertTrue(candidate1.getManifesto().contains("student welfare"));
        assertEquals(245, candidate1.getVotesReceived());
        assertEquals("Together We Rise", candidate1.getCampaignSlogan());
        assertFalse(candidate1.isIncumbent());
        assertEquals("kwame.mensah@ashesi.edu.gh", candidate1.getContactEmail());

        // Testing voting methods
        assertTrue(candidate1.isSeniorStudent());
        assertEquals("New Candidate", candidate1.getCandidateStatus());
        assertEquals(40.83, candidate1.calculateVotePercentage(600), 0.1);
        assertEquals("Kwame Mensah (Senior - Computer Science)", candidate1.getShortProfile());
    }

    @Test
    public void testCandidateObject2() {
        // Creating a Vice President Candidate  object
        Candidate candidate2 = new Candidate(
            "Ama Osei",
            "4623087",
            "ASC Vice President",
            "Junior",
            "Business Administration",
            "I will focus on improving student activities, mental health support, and creating inclusive campus events for all students.",
            198,
            "United for Progress",
            true,
            "ama.osei@ashesi.edu.gh"
        );

        // Testing getters
        assertEquals("Ama Osei", candidate2.getName());
        assertEquals("ASC Vice President", candidate2.getPosition());
        assertEquals("Junior", candidate2.getYearOfStudy());
        assertEquals(198, candidate2.getVotesReceived());
        assertTrue(candidate2.isIncumbent());

        // Testing voting methods
        assertFalse(candidate2.isSeniorStudent());
        assertEquals("Incumbent (Seeking Re-election)", candidate2.getCandidateStatus());
        
        // Testing vote addition methods
        candidate2.addVote();
        assertEquals(199, candidate2.getVotesReceived());
        
        candidate2.addVotes(10);
        assertEquals(209, candidate2.getVotesReceived());
    }

    @Test
    public void testCandidateSetters() {
        Candidate candidate = new Candidate();
        
        // Testing setters
        candidate.setName("John Doe");
        candidate.setPosition("Treasurer");
        candidate.setVotesReceived(50);
        candidate.setIncumbent(true);
        
        assertEquals("John Doe", candidate.getName());
        assertEquals("Treasurer", candidate.getPosition());
        assertEquals(50, candidate.getVotesReceived());
        assertTrue(candidate.isIncumbent());
    }

    // Voter Class Tests
    
    @Test
    public void testVoterObject1() {
        // Creating a voter object who has voted
        Voter voter1 = new Voter(
            "Abena Asante",
            "5023045",
            "Sophomore",
            "Engineering",
            true,
            "November 24, 2025",
            "10:30 AM",
            true,
            "On-Campus",
            "abena.asante@ashesi.edu.gh"
        );

        // Testing all getters
        assertEquals("Abena Asante", voter1.getName());
        assertEquals("5023045", voter1.getStudentID());
        assertEquals("Sophomore", voter1.getYearOfStudy());
        assertEquals("Engineering", voter1.getMajor());
        assertTrue(voter1.hasVoted());
        assertEquals("November 24, 2025", voter1.getVotingDate());
        assertEquals("10:30 AM", voter1.getVotingTime());
        assertTrue(voter1.isRegistered());
        assertEquals("On-Campus", voter1.getResidentialStatus());
        assertEquals("abena.asante@ashesi.edu.gh", voter1.getEmail());

        // Testing voting methods
        assertFalse(voter1.canVote()); // Already voted
        assertTrue(voter1.isOnCampusResident());
        assertEquals("Voted on November 24, 2025 at 10:30 AM", voter1.getVotingStatus());
        assertTrue(voter1.getVoterProfile().contains("Abena Asante"));
    }

    @Test
    public void testVoterObject2() {
        // Creating a voter object who hasn't voted yet
        Voter voter2 = new Voter(
            "Kofi Boateng",
            "4923076",
            "Senior",
            "Computer Science",
            false,
            "Not voted",
            "Not voted",
            true,
            "Off-Campus",
            "kofi.boateng@ashesi.edu.gh"
        );

        // Testing getters
        assertEquals("Kofi Boateng", voter2.getName());
        assertEquals("Senior", voter2.getYearOfStudy());
        assertFalse(voter2.hasVoted());
        assertTrue(voter2.isRegistered());
        assertEquals("Off-Campus", voter2.getResidentialStatus());

        // Testing voting methods
        assertTrue(voter2.canVote()); // Registered but not voted
        assertFalse(voter2.isOnCampusResident());
        assertEquals("Registered - Not Yet Voted", voter2.getVotingStatus());

        // Testing castVote method
        voter2.castVote("November 25, 2025", "2:15 PM");
        assertTrue(voter2.hasVoted());
        assertEquals("November 25, 2025", voter2.getVotingDate());
        assertEquals("2:15 PM", voter2.getVotingTime());
        assertFalse(voter2.canVote()); // Can't vote again
    }

    @Test
    public void testVoterRegistration() {
        Voter voter = new Voter();
        
        // Initially not registered
        assertFalse(voter.isRegistered());
        assertFalse(voter.canVote());
        
        // Register the voter
        voter.registerVoter();
        assertTrue(voter.isRegistered());
        assertTrue(voter.canVote());
    }

    @Test
    public void testVoterSetters() {
        Voter voter = new Voter();
        
        voter.setName("Test Student");
        voter.setYearOfStudy("Freshman");
        voter.setRegistered(true);
        voter.setHasVoted(false);
        
        assertEquals("Test Student", voter.getName());
        assertEquals("Freshman", voter.getYearOfStudy());
        assertTrue(voter.isRegistered());
        assertFalse(voter.hasVoted());
    }

    // ElectionOfficer Class Tests
    
    @Test
    public void testElectionOfficerObject1() {
        // Creating an election Chief Officer object
        ElectionOfficer officer1 = new ElectionOfficer(
            "Dr. Patricia Owusu",
            "STAFF125",
            "Chief Electoral Commissioner",
            "Student Affairs",
            6,
            "Main Campus - Oversight",
            12,
            "+233-20-123-4567",
            "patricia.owusu@ashesi.edu.gh",
            true
        );

        // Testing all getters
        assertEquals("Dr. Patricia Owusu", officer1.getName());
        assertEquals("STAFF125", officer1.getStaffID());
        assertEquals("Chief Electoral Commissioner", officer1.getRole());
        assertEquals("Student Affairs", officer1.getDepartment());
        assertEquals(6, officer1.getYearsOfExperience());
        assertEquals("Main Campus - Oversight", officer1.getAssignedLocation());
        assertEquals(12, officer1.getElectionsManaged());
        assertEquals("+233-20-123-4567", officer1.getContactPhone());
        assertEquals("patricia.owusu@ashesi.edu.gh", officer1.getEmail());
        assertTrue(officer1.isChiefOfficer());

        // Testing Voting
        assertTrue(officer1.isExperiencedOfficer());
        assertEquals("Expert", officer1.getExperienceLevel());
        assertTrue(officer1.canSuperviseOthers());
        assertTrue(officer1.getOfficerTitle().contains("Chief"));
    }

    @Test
    public void testElectionOfficerObject2() {
        // Creating second election officer object - Regular Officer
        ElectionOfficer officer2 = new ElectionOfficer(
            "Mr. Emmanuel Nkrumah",
            "STAFF089",
            "Polling Station Officer",
            "Student Affairs",
            2,
            "E-Block Polling Station",
            4,
            "+233-24-987-6543",
            "emmanuel.nkrumah@ashesi.edu.gh",
            false
        );

        // Testing getters
        assertEquals("Mr. Emmanuel Nkrumah", officer2.getName());
        assertEquals("Polling Station Officer", officer2.getRole());
        assertEquals(2, officer2.getYearsOfExperience());
        assertEquals(4, officer2.getElectionsManaged());
        assertFalse(officer2.isChiefOfficer());

        // Testing voting methods
        assertFalse(officer2.isExperiencedOfficer());
        assertEquals("Beginner", officer2.getExperienceLevel());
        assertFalse(officer2.canSuperviseOthers());

        // Testing recordElectionManaged method
        officer2.recordElectionManaged();
        assertEquals(5, officer2.getElectionsManaged());
        assertTrue(officer2.isExperiencedOfficer()); // Now experienced (5 elections)
        
        // Testing promotion
        officer2.promoteToChiefOfficer();
        assertTrue(officer2.isChiefOfficer());
    }

    @Test
    public void testElectionOfficerSetters() {
        ElectionOfficer officer = new ElectionOfficer();
        
        officer.setName("Test Officer");
        officer.setRole("Coordinator");
        officer.setYearsOfExperience(4);
        officer.setElectionsManaged(8);
        officer.setChiefOfficer(false);
        
        assertEquals("Test Officer", officer.getName());
        assertEquals("Coordinator", officer.getRole());
        assertEquals(4, officer.getYearsOfExperience());
        assertEquals(8, officer.getElectionsManaged());
        assertFalse(officer.isChiefOfficer());
    }

    @Test
    public void testElectionOfficerExperienceLevels() {
        ElectionOfficer beginner = new ElectionOfficer();
        beginner.setYearsOfExperience(1);
        assertEquals("Beginner", beginner.getExperienceLevel());
        
        ElectionOfficer intermediate = new ElectionOfficer();
        intermediate.setYearsOfExperience(3);
        assertEquals("Intermediate", intermediate.getExperienceLevel());
        
        ElectionOfficer expert = new ElectionOfficer();
        expert.setYearsOfExperience(7);
        assertEquals("Expert", expert.getExperienceLevel());
    }

    // Integration Tests
    
    @Test
    public void testCompleteElectionScenario() {
        // Create an election
        ASCElection election = new ASCElection(
            "ASC Elections 2025", "Ashesi", "Nov 24", "Nov 26",
            "All Day", 3, "General", 500, "Online", 6
        );
        
        // Create candidates
        Candidate president = new Candidate();
        president.setName("Test President");
        president.setPosition("President");
        president.addVotes(150);
        
        // Create voters
        Voter voter = new Voter();
        voter.setName("Test Voter");
        voter.registerVoter();
        voter.castVote("Nov 24", "10:00 AM");
        
        // Create officer
        ElectionOfficer officer = new ElectionOfficer();
        officer.setName("Test Officer");
        officer.recordElectionManaged();
        
        // Verify everything works together
        assertTrue(election.isMultiDayEvent());
        assertEquals(150, president.getVotesReceived());
        assertTrue(voter.hasVoted());
        assertEquals(1, officer.getElectionsManaged());
    }
}
