public interface Votable {
    /** Add a single vote */
    void addVote();

    /** Add multiple votes by collecting Number of votes */
    void addVotes(int votes);

    /** Get current number of votes */
    int getVotesReceived();

    /** Calculate vote percentage based on Total votes cast and return percentage of total votes */
    double calculateVotePercentage(int totalVotes);

    /** Check if candidate who is winning has the highest vote count to compare against it */
    boolean isWinning(int highestVoteCount);
}
