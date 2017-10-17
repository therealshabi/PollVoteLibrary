package technolifestyle.com.pollvote.models;

import java.util.ArrayList;
import java.util.List;

public class PollQuestion {

    private String question;

    private List<Option> options;

    private int totalVotes;

    public PollQuestion() {
        this.question = "";
        this.options = new ArrayList<>();
        this.totalVotes = 0;
    }

    public PollQuestion(String question) {
        this.question = question;
        this.options = new ArrayList<>();
        this.totalVotes = 0;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public void addOption(Option option) {
        this.options.add(option);
    }

    public void addOption(String optionText) {
        Option option = new Option(optionText);
        this.options.add(option);
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }
}
