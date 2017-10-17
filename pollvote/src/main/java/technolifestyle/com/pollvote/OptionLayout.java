package technolifestyle.com.pollvote;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import technolifestyle.com.pollvote.models.Option;
import technolifestyle.com.pollvote.models.PollQuestion;

public class OptionLayout extends FrameLayout {

    private Context context;
    private TextView tvOption;

    private Option option;

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
        tvOption = (TextView) view.findViewById(R.id.tv_option);
        option = new Option();
    }

    OptionLayout setOptionText(PollQuestion poll, String optionText) {
        tvOption.setText(optionText);
        option.setOption(optionText);
        poll.addOption(option);
        return this;
    }
}
