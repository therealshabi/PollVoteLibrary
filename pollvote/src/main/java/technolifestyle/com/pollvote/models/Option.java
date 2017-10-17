package technolifestyle.com.pollvote.models;

public class Option {

    private String option;
    private int numOfVotes;
    private double votePercent;
    private PollQuestion pollQuestion;

    Option(String option, PollQuestion pollQuestion) {
        this.option = option;
        this.numOfVotes = 0;
        this.votePercent = 0.0;
        this.pollQuestion = pollQuestion;
    }

    public Option() {
        this.option = "";
        this.numOfVotes = 0;
        this.votePercent = 0.0;
        this.pollQuestion = null;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getNumOfVotes() {
        return numOfVotes;
    }

    public void setNumOfVotes(int numOfVotes) {
        this.numOfVotes = numOfVotes;
        votePercent = ((double) this.numOfVotes) / ((double) pollQuestion.getTotalVotes());
    }

    public void addVote() {
        this.numOfVotes++;
        votePercent = ((double) this.numOfVotes) / ((double) pollQuestion.getTotalVotes());
    }

    public double getVotePercent() {
        return votePercent;
    }

    public void addPoll(PollQuestion pollQuestion) {
        this.pollQuestion = pollQuestion;
    }
}
