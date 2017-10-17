package technolifestyle.com.pollvote.models;

public class Option {

    private String option;
    private int numOfVotes;
    private double votePercent;

    public Option(String option) {
        this.option = option;
        this.numOfVotes = 0;
        this.votePercent = 0.0;
    }

    public Option() {
        this.option = "";
        this.numOfVotes = 0;
        this.votePercent = 0.0;
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
    }

    public void addVote() {
        this.numOfVotes++;
    }

    public double getVotePercent() {
        return votePercent;
    }
}
