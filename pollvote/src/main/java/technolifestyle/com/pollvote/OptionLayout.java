package technolifestyle.com.pollvote;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import technolifestyle.com.pollvote.models.Option;
import technolifestyle.com.pollvote.models.PollQuestion;

public class OptionLayout extends FrameLayout implements View.OnClickListener {

    private Context context;
    private TextView tvOption;
    private CardView cardView;

    private Option option;
    private OnOptionClicked onOptionClicked;

    public OptionLayout(Context context) {
        super(context);
        this.context = context;
        setLayout();
    }

    public OptionLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        setLayout();
    }

    public OptionLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        setLayout();
    }

    private void setLayout() {
        @SuppressLint("InflateParams")
        View view = LayoutInflater.from(context).inflate(R.layout.option_layout, this);
        cardView = (CardView) view.findViewById(R.id.card_view);
        tvOption = (TextView) view.findViewById(R.id.tv_option);
        option = new Option();
        cardView.setOnClickListener(this);
    }

    public void setOnOptionClicked(OnOptionClicked onOptionClicked) {
        this.onOptionClicked = onOptionClicked;
    }

    OptionLayout setOptionText(PollQuestion poll, String optionText) {
        tvOption.setText(optionText);
        option.setOptionText(optionText);
        option.addPoll(poll);
        poll.addOption(option);
        return this;
    }

    public Option getOption() {
        return option;
    }

    @Override
    public void onClick(View view) {
        onOptionClicked.onClicked();
        option.addVote();
        Toast.makeText(context, String.format("%s %s %s %s",
                "Votes for", option.getOptionText(), ":",
                option.getNumOfVotes()), Toast.LENGTH_SHORT).show();
    }

    public void setOptionUnclickable() {
        cardView.setClickable(false);
    }

    interface OnOptionClicked {
        void onClicked();
    }
}
