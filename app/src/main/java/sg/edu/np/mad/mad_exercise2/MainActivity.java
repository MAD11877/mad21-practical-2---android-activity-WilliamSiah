package sg.edu.np.mad.mad_exercise2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get Button object from xml
        Button followButton = findViewById(R.id.followButton);
        // OnClick event listener
        followButton.setOnClickListener(new View.OnClickListener() {
            // Init follow variable
            boolean follow = false;

            @Override
            public void onClick(View view) {
                if (follow){
                    followButton.setText("Follow");
                    follow = false;
                }
                else{
                    followButton.setText("Unfollow");
                    follow = true;
                }
            }
        });
    }

}