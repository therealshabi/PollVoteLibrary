package technolifestyle.com.pollvote;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import technolifestyle.com.pollvote.models.PollQuestion;

public class PollVoteLayout extends LinearLayout {

    private LinearLayout container;
    private TextView tvQuest;
    private OptionLayout optionLayout1;
    private OptionLayout optionLayout2;
    private Context context;

    private PollQuestion poll;

    public PollVoteLayout(Context context) {
        super(context);
        this.context = context;
        setLayout();
    }

    public PollVoteLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        setLayout();
    }

    public PollVoteLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        setLayout();
    }

    private void setLayout() {
        poll = new PollQuestion();
        View view = LayoutInflater.from(context).inflate(R.layout.poll_vote_layout, this, true);
        container = (LinearLayout) view.findViewById(R.id.ll_options_container);
        tvQuest = (TextView) view.findViewById(R.id.tv_question);
        optionLayout1 = new OptionLayout(context);
        optionLayout2 = new OptionLayout(context);
        container.addView(optionLayout1);
        container.addView(optionLayout2);
    }

    public PollVoteLayout addOption(String optionText) {
        OptionLayout optionLayout = new OptionLayout(context)
                .setOptionText(poll, optionText);
        container.addView(optionLayout);
        return this;
    }

    public PollVoteLayout addMultipleOptions(List<String> options) {
        for (String optionText : options) {
            OptionLayout optionLayout = new OptionLayout(context)
                    .setOptionText(poll, optionText);
            container.addView(optionLayout);
        }
        return this;
    }

    public PollVoteLayout setupQuestion(String question) {
        poll.setQuestion(question);
        tvQuest.setText(question);
        return this;
    }

    public PollVoteLayout setupFirstOption(String option) {
        optionLayout1.setOptionText(poll, option);
        return this;
    }

    public PollVoteLayout setupSecondOption(String option) {
        optionLayout2.setOptionText(poll, option);
        return this;
    }
}
