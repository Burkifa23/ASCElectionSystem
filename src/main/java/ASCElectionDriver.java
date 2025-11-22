public class ASCElectionDriver {
    
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("ASHESI STUDENTS COUNCIL (ASC) ELECTIONS 2025");
        System.out.println("Election Management System");
        System.out.println("=".repeat(60));
        System.out.println();

        // Creating Array of Elections
        System.out.println("\n" + "=".repeat(60));
        System.out.println("SECTION 1: ELECTION EVENTS");
        System.out.println("=".repeat(60));
        
        ASCElection[] elections = new ASCElection[2];
        
        // Election 1: Main ASC Elections
        elections[0] = new ASCElection(
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
        
        // Election 2: Class Representative Elections
        elections[1] = new ASCElection(
            "Class Representative Elections 2025",
            "Ashesi University - Various Classrooms",
            "September 15, 2025",
            "September 15, 2025",
            "12:00 PM - 4:00 PM",
            1,
            "Class Representatives",
            850,
            "In-Person Voting",
            16
        );
        
        // Display all elections using a loop
        for (int i = 0; i < elections.length; i++) {
            System.out.println("\nElection #" + (i + 1) + ":");
            System.out.println(elections[i].toString());
            System.out.println();
        }

        // Creating Array of Candidates
        System.out.println("\n" + "=".repeat(60));
        System.out.println("SECTION 2: PRESIDENTIAL CANDIDATES");
        System.out.println("=".repeat(60));
        
        Candidate[] candidates = new Candidate[4];
        
        candidates[0] = new Candidate(
            "Kwame Mensah",
            "4523019",
            "ASC President",
            "Senior",
            "Computer Science",
            "I will improve student welfare, enhance communication between students and administration, and create more opportunities for student engagement through technology-driven solutions.",
            245,
            "Together We Rise",
            false,
            "kwame.mensah@ashesi.edu.gh"
        );
        
        candidates[1] = new Candidate(
            "Ama Osei",
            "4623087",
            "ASC Vice President",
            "Junior",
            "Business Administration",
            "I will focus on improving student activities, mental health support, and creating inclusive campus events that celebrate our diversity and strengthen our community.",
            198,
            "United for Progress",
            true,
            "ama.osei@ashesi.edu.gh"
        );
        
        candidates[2] = new Candidate(
            "Yaw Boateng",
            "4723065",
            "ASC President",
            "Senior",
            "Management Information Systems",
            "My vision is to bridge the gap between students and faculty, promote entrepreneurship on campus, and ensure every student voice is heard in decision-making.",
            167,
            "Forward Together",
            false,
            "yaw.boateng@ashesi.edu.gh"
        );
        
        candidates[3] = new Candidate(
            "Efua Darko",
            "4823092",
            "ASC Treasurer",
            "Junior",
            "Computer Engineering",
            "I will ensure financial transparency, efficient budget allocation for student activities, and create new funding opportunities for student-led initiatives.",
            134,
            "Trust and Transparency",
            false,
            "efua.darko@ashesi.edu.gh"
        );
        
        // Display all candidates using a loop
        for (int i = 0; i < candidates.length; i++) {
            System.out.println("\nCandidate #" + (i + 1) + ":");
            System.out.println(candidates[i].toString());
            System.out.println();
        }
        
        // Display candidate statistics
        System.out.println("\n" + "-".repeat(60));
        System.out.println("CANDIDATE STATISTICS:");
        System.out.println("-".repeat(60));
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getVotesReceived();
        }
        System.out.println("Total votes cast: " + totalVotes);
        System.out.println();
        for (Candidate candidate : candidates) {
            System.out.printf("%s: %.2f%% of votes%n", 
                candidate.getName(), 
                candidate.calculateVotePercentage(totalVotes));
        }

        // Creating Array of Voters
        System.out.println("\n" + "=".repeat(60));
        System.out.println("SECTION 3: REGISTERED VOTERS");
        System.out.println("=".repeat(60));
        
        Voter[] voters = new Voter[5];
        
        voters[0] = new Voter(
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
        
        voters[1] = new Voter(
            "Kofi Boateng",
            "4923076",
            "Senior",
            "Computer Science",
            true,
            "November 25, 2025",
            "2:15 PM",
            true,
            "Off-Campus",
            "kofi.boateng@ashesi.edu.gh"
        );
        
        voters[2] = new Voter(
            "Adjoa Mensah",
            "5123088",
            "Freshman",
            "Business Administration",
            false,
            "Not voted",
            "Not voted",
            true,
            "On-Campus",
            "adjoa.mensah@ashesi.edu.gh"
        );
        
        voters[3] = new Voter(
            "Kwabena Nkrumah",
            "4823054",
            "Junior",
            "Electrical Engineering",
            true,
            "November 24, 2025",
            "9:45 AM",
            true,
            "Off-Campus",
            "kwabena.nkrumah@ashesi.edu.gh"
        );
        
        voters[4] = new Voter(
            "Akosua Frimpong",
            "5023091",
            "Sophomore",
            "Computer Engineering",
            true,
            "November 26, 2025",
            "11:20 AM",
            true,
            "On-Campus",
            "akosua.frimpong@ashesi.edu.gh"
        );
        
        // Display all voters using a loop
        for (int i = 0; i < voters.length; i++) {
            System.out.println("\nVoter #" + (i + 1) + ":");
            System.out.println(voters[i].toString());
            System.out.println();
        }
        
        // Display voting statistics
        System.out.println("\n" + "-".repeat(60));
        System.out.println("VOTING STATISTICS:");
        System.out.println("-".repeat(60));
        int votedCount = 0;
        int registeredCount = 0;
        int onCampusCount = 0;
        
        for (Voter voter : voters) {
            if (voter.hasVoted()) votedCount++;
            if (voter.isRegistered()) registeredCount++;
            if (voter.isOnCampusResident()) onCampusCount++;
        }
        
        System.out.println("Total registered voters: " + registeredCount);
        System.out.println("Voters who have voted: " + votedCount);
        System.out.println("Voters yet to vote: " + (registeredCount - votedCount));
        System.out.println("On-campus voters: " + onCampusCount);
        System.out.println("Off-campus voters: " + (voters.length - onCampusCount));
        System.out.printf("Voter turnout: %.2f%%%n", 
            (votedCount * 100.0 / registeredCount));

        // Creating Array of Election Officers
        System.out.println("\n" + "=".repeat(60));
        System.out.println("SECTION 4: ELECTION OFFICIALS");
        System.out.println("=".repeat(60));
        
        ElectionOfficer[] officers = new ElectionOfficer[3];
        
        officers[0] = new ElectionOfficer(
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
        
        officers[1] = new ElectionOfficer(
            "Mr. Emmanuel Nkrumah",
            "STAFF089",
            "Polling Station Officer",
            "Student Affairs",
            3,
            "E-Block Polling Station",
            7,
            "+233-24-987-6543",
            "emmanuel.nkrumah@ashesi.edu.gh",
            false
        );
        
        officers[2] = new ElectionOfficer(
            "Ms. Grace Agyeman",
            "STAFF102",
            "Results Collation Officer",
            "IT Department",
            4,
            "Data Center",
            9,
            "+233-27-456-7890",
            "grace.agyeman@ashesi.edu.gh",
            false
        );
        
        // Display all officers using a loop
        for (int i = 0; i < officers.length; i++) {
            System.out.println("\nOfficer #" + (i + 1) + ":");
            System.out.println(officers[i].toString());
            System.out.println();
        }
        
        // Display officer statistics
        System.out.println("\n" + "-".repeat(60));
        System.out.println("OFFICER STATISTICS:");
        System.out.println("-".repeat(60));
        int totalElectionsManaged = 0;
        int experiencedOfficers = 0;
        
        for (ElectionOfficer officer : officers) {
            totalElectionsManaged += officer.getElectionsManaged();
            if (officer.isExperiencedOfficer()) experiencedOfficers++;
        }
        
        System.out.println("Total officers: " + officers.length);
        System.out.println("Experienced officers: " + experiencedOfficers);
        System.out.println("Total elections managed (cumulative): " + totalElectionsManaged);
        System.out.println("Average elections per officer: " + 
            (totalElectionsManaged / officers.length));

        // Summary Report
        System.out.println("\n" + "=".repeat(60));
        System.out.println("ELECTION SUMMARY REPORT");
        System.out.println("=".repeat(60));
        System.out.println("\nEvent: " + elections[0].getEventName());
        System.out.println("Period: " + elections[0].getElectionPeriod());
        System.out.println("Total Candidates: " + candidates.length);
        System.out.println("Total Registered Voters: " + voters.length + " (Sample)");
        System.out.println("Election Officials: " + officers.length);
        System.out.println("Votes Cast: " + totalVotes);
        System.out.println("\nStatus: " + (votedCount == registeredCount ? 
            "All voters have cast their ballots" : 
            "Voting still in progress"));
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("END OF REPORT");
        System.out.println("=".repeat(60));
    }
}
