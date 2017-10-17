package technolifestyle.com.pollvote;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PollVoteLayout extends LinearLayout {

    private LinearLayout container;
    private TextView tvQuest;
    private TextView tvOption1;
    private TextView tvOption2;
    private Context context;

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
        View view = LayoutInflater.from(context).inflate(R.layout.poll_vote_layout, this);
        container = (LinearLayout) view.findViewById(R.id.ll_options_container);
        tvQuest = (TextView) view.findViewById(R.id.tv_question);
        tvOption1 = (TextView) view.findViewById(R.id.tv_option_1);
        tvOption2 = (TextView) view.findViewById(R.id.tv_option_2);
    }

    private PollVoteLayout addOption(String optionText) {
        @SuppressLint("InflateParams")
        View view = LayoutInflater.from(context).inflate(R.layout.option_layout, null);
        TextView tvOption = (TextView) view.findViewById(R.id.tv_option);
        tvOption.setText(optionText);
        container.addView(view);
        return this;
    }

    private PollVoteLayout setupQuestion(String question) {
        tvQuest.setText(question);
        return this;
    }

    private PollVoteLayout setupFirstOption(String option) {
        tvOption1.setText(option);
        return this;
    }

    private PollVoteLayout setupSecondOption(String option) {
        tvOption2.setText(option);
        return this;
    }
}
