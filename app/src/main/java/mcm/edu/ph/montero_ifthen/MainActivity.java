package mcm.edu.ph.montero_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button decision1 = findViewById(R.id.btnDecision1);
        Button decision2 = findViewById(R.id.btnDecision2);

        TextView storyBG = findViewById(R.id.txtBG);
        TextView outcome = findViewById(R.id.txtAns);

        decision1.setOnClickListener(this);
        decision2.setOnClickListener(this);

        storyBG.setText("I woke up shivering cold as I lie naked in the middle of a forest. All sorts of insects must have bitten to find my arms and face "+
                "swollen and itchy from the ordeal. I have no recollection of how i got here but i need to find a shelter before I find myself "+
                "dead from all manners of dangerous critter that live in this secluded area. \n \nNow, determined, you decide your next move "+
                "in order to change your fate.");
        outcome.setText(
                "Your first decision involves touching things around you. If you are lucky, you might find something worthwhile "+
                        "but you also thought that it involves a lot of risk. There could be poison frogs or spiders that you can't see "+
                        "from all the darkness around you. \n \n"+
                        "The second decision involves climbing the short tree your faint eyesight sees right in front of you. This will "+
                        "allow you to recuperate in its branches and wait it out until the sun comes up.");
    }
    @Override
    public void onClick(View view){

        TextView outcome = findViewById(R.id.txtAns);
        TextView storyBG = findViewById(R.id.txtBG);

        if(view.getId() == R.id.btnDecision1){
            storyBG.setText("As you try to rummage in the pitch dark, something bit your hand. You collapsed right away.");
        }
        else if (view.getId() == R.id.btnDecision2){
            storyBG.setText("You shiver in cold. You feel like you are experiencing hypothermia.");
        }
        else{

        }
    }
}