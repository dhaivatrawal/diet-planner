package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LExercise extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lexercise);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterLExe adapter = new RecyclerViewAdapterLExe(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterLExe adapter = new RecyclerViewAdapterLExe(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<LExercise.Club>();
        clubs.add(new LExercise.Club("Cross Jack",R.mipmap.leone,"Do this cardio move between between strength exercises.\n" +
                "\n" +
                "A. Stand with feet hip-width apart, arms at sides. Jump feet wide as you raise arms overhead, crossing one wrist in front of the other.\n" +
                "\n" +
                "B. Jump feet together, crossing one foot in front of the other as you cross arms in front of hips.\n" +
                "\n" +
                "C. Repeat, switching arm and foot positions each time you jump.\n" +
                "\n" +
                "Continue for 30 seconds-1 minute."));
        clubs.add(new LExercise.Club("Single-Leg Balance",R.mipmap.letwo,"A. Balance on right leg, left leg bent with foot slightly off floor in front of you.\n" +
                "\n" +
                "B. With hands on hips or extended in front of you for balance, lower into a squat on right leg, keeping right knee aligned with toes.\n" +
                "\n" +
                "C. Maintaining squat throughout, extend left leg out to left, toes facing forward and foot flexed; lower left leg.\n" +
                "\n" +
                "Do 10 reps. Switch sides; repeat.\n" +
                "\n" +
                "Trainer's Tip: Lift your leg as high as you can while staying balanced and without having to lean to the opposite side."));
        clubs.add(new LExercise.Club("Spider Crawl",R.mipmap.lethree,"A. Get in full push-up position on floor, arms extended with wrists under shoulders, body forming a straight line from head to heels.\n" +
                "\n" +
                "B. Step right foot forward to bring right knee toward right elbow as you reach forward with left hand.\n" +
                "\n" +
                "C. Switch sides, bringing left knee toward left elbow as you reach forward with right hand.\n" +
                "\n" +
                "D. Remaining in crouched position throughout, continue crawling forward for 30 seconds. Reverse movement to return to start. (No space? Alternate crawling two steps forward and then two steps back.)\n" +
                "\n" +
                "Trainer's Tip: Don't let your hips rise too far up as you crawl."));
        clubs.add(new LExercise.Club("Wall Slide",R.mipmap.lefour,"A. Lie on left side next to a wall with back facing the wall, head resting on left hand, right hand on floor in front of body for balance. Extend legs forward so that they're slightly in front of body.\n" +
                "\n" +
                "B. Press right heel back against wall behind you, foot flexed with toes pointing forward. Keeping hips and shoulders squared forward, keep pressing heel against wall as you slide foot up as far as you can.\n" +
                "\n" +
                "C. Lower leg (still pressing heel) to start position.\n" +
                "\n" +
                "Do 10 reps. Switch sides; repeat.\n" +
                "\n" +
                "Trainer's Tip: If your hips shift forward during the leg lift, you've gone too high."));
        clubs.add(new LExercise.Club("Lunge to Push-Up",R.mipmap.lefive,"A. Stand with feet hip-width apart, hands on hips. Step forward with right leg and lower into a lunge, both knees bent 90 degrees.\n" +
                "\n" +
                "B. Lean forward over right thigh and place hands on floor on either side of right foot. Step right foot back so that you?re in full push-up position and then bend elbows, lowering chest toward floor. (To make it easier: Simply hold push-up position for 1 count without lowering.)\n" +
                "\n" +
                "C. Press up, bring right foot forward again, rise up into a lunge and step back to return to start.\n" +
                "\n" +
                "Switch legs and repeat. Do 10 reps, alternating sides."));
        clubs.add(new LExercise.Club("Pendulum",R.mipmap.lesix,"A. Balance on right leg, left leg bent and raised behind you slightly. With right hand on hip, lower into a squat on right leg and reach left hand toward right toes.\n" +
                "\n" +
                "B. Rise up, keeping left foot off floor, and reach left arm forward.\n" +
                "\n" +
                "Do 10 reps. Switch sides; repeat."));
        clubs.add(new LExercise.Club("Crab-Walk Combo",R.mipmap.leseven,"A. Sit on floor with hands behind hips and knees bent, feet flat. Lift hips into tabletop position (torso is parallel to floor) so that ankles are aligned under knees and wrists are aligned under shoulders, fingers pointing forward or slightly out to sides.\n" +
                "\n" +
                "B. Walk forward 4 steps, then stop and extend right leg up as you reach left hand toward right toes. Switch sides and repeat, then continue walking forward another 4 steps.\n" +
                "\n" +
                "Continue for 30 seconds to a minute. Reverse the direction to return to start.\n" +
                "\n" +
                "Trainer's Tip: Look slightly forward or up as you walk, whichever is most comfortable for your neck."));
        clubs.add(new LExercise.Club("Dive Bomber",R.mipmap.leeight,"A. Get in an inverted-V position on floor with feet hip-width apart, hands shoulder-width apart and hips up.\n" +
                "\n" +
                "B. Bend elbows out to sides and lower head and shoulders toward floor between hands.\n" +
                "\n" +
                "Do 10 reps. "));
        clubs.add(new LExercise.Club("Rolling Sit-Up",R.mipmap.lenine,"A. Lie facedown with arms and legs extended off floor, palms facing down.\n" +
                "\n" +
                "B. Keeping head, arms and legs lifted, roll over so you're faceup.\n" +
                "\n" +
                "C. Roll again in the same direction to return to start. That's 1 rep. Repeat, going the opposite direction.\n" +
                "\n" +
                "Do 10 reps."));

    }

    class Club {

        String nameone,nametwo;
        int logoId;
        public Club(String nameone, int logoId, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;
            this.logoId=logoId;

        }
    }


}
