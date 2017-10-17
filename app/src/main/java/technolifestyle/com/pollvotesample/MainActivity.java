package technolifestyle.com.pollvotesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import technolifestyle.com.pollvote.PollVoteLayout;

public class MainActivity extends AppCompatActivity {

    private PollVoteLayout pollVoteLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pollVoteLayout = (PollVoteLayout) findViewById(R.id.poll_layout);

        pollVoteLayout.setupQuestion("Q. Who is the Prime Minister of Democratic Republic of India?")
        .setupFirstOption("Narendra Modi")
        .setupSecondOption("Rahul Gandhi")
        .addOption("Arvind Kejriwal")
        .addOption("Nitish Kumar");
    }
}
