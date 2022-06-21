package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class GExercise extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gexercise);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterGExe adapter = new RecyclerViewAdapterGExe(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterGExe adapter = new RecyclerViewAdapterGExe(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<Club>();
        clubs.add(new GExercise.Club("Bench Dips",R.mipmap.eefour,"Steps\n" +
                "\n" +
                "Place a firm bench behind your back, perpendicular to your body. The bench should be wide and stable.\n" +
                "Grip the edge of the bench with your palms. Your palms should face downward, with your fingertips facing the ground.\n" +
                "Extend your legs forward, bent at the waist and perpendicular to your torso.\n" +
                "Inhale and slowly lower your buttocks by bending your elbows and pushing yourself down until your forearms are perpendicular to the floor.\n" +
                "While exhaling, straighten your arms and lift your torso back to the starting position.\n" +
                "Do 4-5 reps or as per your comfort level.\n" +
                "Target Muscles: Triceps\n" +
                "Precautions: Keep your chest puffed out and your shoulder blades pulled back. Be careful while doing this exercise if you have neck or back problems as it may strain them."));
        clubs.add(new GExercise.Club("Squats",R.mipmap.eefive,"Steps\n" +
                "\n" +
                "Stand straight with your feet in line with your hips.\n" +
                "Raise your arms straight forward and perpendicular to the ground. You may also spread your fingers and join your palms in front of your chest.\n" +
                "Keep your entire body tight and flex your stomach.\n" +
                "Breathe deeply and lower your buttocks as if you are sitting on a chair. Your thighs should be parallel to the ground. (You can also do this exercise while holding a weight bar for better results.)\n" +
                "While doing this exercise, make sure your bent knees do not cross your big toes, and your body is straight and firm.\n" +
                "Come back to your original position and repeat 5 times.\n" +
                "Target Muscles: Thigh muscles like quads, hamstrings, and outer thighs, Glutes, and Core muscles.\n" +
                "Precaution: Whilesquatting down, make sure your knees do not go beyond your toes as it can hurt your knees. If you are a beginner, start doing this exercise without a weight bar."));
        clubs.add(new GExercise.Club("Lunges",R.mipmap.eesix,"Steps\n" +
                "\n" +
                "Stand straight with your feet aligned with your hips. This is the starting position.\n" +
                "Engage your core, take a deep breath, and take a step forward with your left foot and kneel until your right knee is perpendicular to the ground.\n" +
                "Push back on your heel to lift back your body to the starting position.\n" +
                "Repeat this 20 times on each side. For best results, do this exercise while holding some weights.\n" +
                "Target Muscles: Glutes and buttocks, Hamstrings, Quadriceps, and Core muscles.\n" +
                "Precaution: While kneeling down, your knee should not cross your big toe as it may hurt your knees. Do not lean forward while doing lunges. Keep your upper body straight."));

        clubs.add(new GExercise.Club("Push-Ups",R.mipmap.eeone,"Steps\n" +
                "\n" +
                "Lie down on your stomach.\n" +
                "Put your hands on the ground – palms flat and facing downward, and elbows bent and shoulder-width apart.\n" +
                "Place your toes on the ground.\n" +
                "Align your legs, feet, and back.\n" +
                "Slowly push your entire body up off the ground with your hands. Stretch your arms completely. Your entire body should be off the ground, supported by your hands and toes.\n" +
                "Slowly lower your body by bending your elbows. No part of your body should touch the ground except your hands and toes.\n" +
                "Do 15 reps or as many as you can as per your comfort.\n" +
                "Target Muscles: Chest muscles or pectorals, Shoulders or deltoid muscles, Triceps, and Core muscles.\n" +
                "Precautions: If you have wrist pain or poor wrist flexibility, use push-up handles to do this exercise. Do not strain your knees if you are finding it difficult to push your body off the ground."));
        clubs.add(new GExercise.Club("Bench Press",R.mipmap.eetwo,"Steps\n" +
                "\n" +
                "Lie on your back on the bench, keeping your entire body relaxed.\n" +
                "Stretch out your fingers and grab the bar.\n" +
                "Slowly lift the weight bar, stretching your arms completely.\n" +
                "Pull it back down onto the rack or near your chest from where you started. Bend your arms at a 90° angle.\n" +
                "Do 4 to 5 reps or as per your comfort level.\n" +
                "Target Muscles: Triceps, Anterior deltoids, Traps, and Back.\n" +
                "Precautions: Make sure to grip the weight bar properly while unracking it to avoid shoulder injury."));
        clubs.add(new GExercise.Club("Pull-Ups",R.mipmap.hhthree,"Steps\n" +
                "\n" +
                "Grip the pull-up bar with your palms facing outward. Your hands should be in line with your shoulders.\n" +
                "Pull yourself up to the level of the bar, making sure your feet are completely off the ground.\n" +
                "Pull your body up until your chin is above the bar.\n" +
                "Lower your body slowly until your feet touch the ground, and your arms are completely straight.\n" +
                "Do as many reps as you feel comfortable doing.\n" +
                "Target Muscles: Biceps, Lats muscles (the flat muscles of your back), Forearms, Trapezius (muscles in the center of the upper back), and Deltoid muscles (the muscles in your lower back).\n" +
                "Precautions: Do not strain yourself if you have a neck injury or weak wrist flexibility."));
        clubs.add(new GExercise.Club("Deadlift",R.mipmap.eeseven,"Steps\n" +
                "\n" +
                "Stand straight, keeping your feet shoulder-width apart.\n" +
                "Grip the weight bar firmly.\n" +
                "Face forward and look straight ahead.\n" +
                "Keeping your back straight, lift the weight bar first up until your thighs and then until your hips.\n" +
                "Slowly bend at the hips and place the weight bar back on the ground.\n" +
                "Do as many reps as you feel comfortable.\n" +
                "Target Muscles: Glute muscles, Hamstrings, and Core muscles.\n" +
                "Precautions: Though this exercise is very effective, it is difficult to perform without a trainer. Avoid doing this exercise if you have any injuries."));
        clubs.add(new GExercise.Club("Overhead Press",R.mipmap.eeeight,"Steps\n" +
                "\n" +
                "With your hands shoulder-width apart, squat and grip the weight bar.\n" +
                "Lift the bar slowly to your chest or shoulders.\n" +
                "Take a deep breath and lift it over your head until your arms are fully stretched. Keep your elbows locked.\n" +
                "Slowly lower the bar to the shoulder level.\n" +
                "Do 3 reps or as per your comfort level. You can do this exercise with dumbbells as well.\n" +
                "Target Muscles: Deltoids, Triceps, and Upper back muscles.\n" +
                "Precautions: Do not perform this exercise if you have a neck or shoulder injury."));

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
