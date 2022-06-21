package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class GHabits extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghabits);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Club("You Work Out Daily",R.mipmap.hhthree,"It's great that you're so committed to your workout routine, but if you're spending all your free time sprinting and lifting you're not giving your body enough time to recover and rebuild, which can increase your risk of injury and actually hinder your progress, explains Jay Cardiello, a fitness and nutrition expert who has sculpted the bodies of some of the music scene's biggest superstars, including 50 Cent and J.Lo. To ensure you're giving your body the downtime it needs to lean out, Cardiello suggests taking one or two days off per week."));
        clubs.add(new Club("You Replaced Sugar with Artificial Sweeteners",R.mipmap.hhone,"As evidence continues to stack up against sugar, consumers are looking for ways to have their cake and eat it too—literally. To meet the demand, food makers are churning out sugar-free packaged foods like puddings, cookies, and soda—but don't get it twisted; these options aren't going to help you trim down. In fact, they may have the opposite effect on your gut. Many artificial sweeteners cause insulin (our body's primary fat-storage hormone) to be released in your gut because they're sweet like sugar. Plus, when manufacturers take sugar out of products, they often add in bad-for-you fats like palm oil and cream to make up for the taste, They also use sugar alcohols, which can have a laxative effect if eaten in excess. The bottom line: If you're craving something sweet, skip \"sugar-free\" options and eat what you're really craving in moderation. (If you're diabetic, consult with your doctor for healthy, safe ways to cut down on processed \"sugar-free\" foods in your diet.) For even more ways to dial back on the sweet stuff and clobber cravings, check out the Zero Sugar Cookbook for no-added sugar recipes!"));
        clubs.add(new Club("You Guzzle Bottled Water",R.mipmap.hhtwo,"You know how important it is to stay hydrated, which is why you're never without a bottle of water by your side. While we commend you for getting your daily dose of H2O, you should seriously consider trading your throwaway bottle for the reusable, BPA-free variety. (We like S'well Bottles. They're $35 on Amazon.com.) Bisphenol A, commonly referred to as BPA, can negatively impact fertility in both men and women and has also been linked to obesity. Don't believe it? The science doesn't lie: A 2011 Harvard study found that adults with the highest concentration of BPA in their urine had significantly larger waists and odds of being obese than those in the lowest quartile. Fill your new BPA-free bottle with detox water for a delicious twist on plain H2O!"));
        clubs.add(new Club("You Refuel With a Post-Sweat Smoothie",R.mipmap.hhfour,"Whether it's a long run, a killer barre sesh, or a hot yoga workout, it's a mistake to feel like it isn't complete without a trip to the beverage bar. \"If you're in the habit of 'refueling' with a protein shake or smoothie after every single workout, you may want to reconsider,\" St. John cautions. \"For most workouts longer than one hour in length, eating a protein-rich meal afterward is completely sufficient. Consuming a protein shake in between is likely unnecessary and instead just increases caloric consumption."));
        clubs.add(new Club("You 'Save Calories for Later'",R.mipmap.hhfive,"If you regularly skimp on calories on days you have plans to grab drinks or a special dinner after work, you could be doing more harm than good. The reason: It's hard to maintain good eating habits and portion control when you're starved. To avoid overeating, snack on a cup of baby carrots or an ounce of almonds before you leave to meet your friends. If you're drinking alcohol, limit yourself to two drinks at most to save on calories and keep from getting inebriated and losing your self-control."));
        clubs.add(new Club("You Eat the Wrong Fish",R.mipmap.hhsix,"When it comes to belly-slimming meals, there's nothing healthier than a nice piece of fish, right? Well, that may have been true 100 years ago, but today that's not always the case. While the chicken of the sea can be an impeccable source of lean protein and heart-bolstering omega-3 fatty acids, certain varieties and preparations can bloat your belly. Let's look at farm-raised salmon (all Atlantic salmon is farm-raised) as an example. Although wild salmon is high in omega-3 acids, which fight weight gain-causing inflammation throughout the body, farm-raised salmon is packed with omega-6s, which actually increases it."));
        clubs.add(new Club("And the Wrong 'Healthy' Snacks",R.mipmap.hhseven,"With more us relying on snacks rather than full-on meals to fuel our day, it seems everyone is on the hunt for the next nibble that can keep them trim. Unfortunately, marketers are on to us. And they're slapping misleading health-centric phrases like \"whole wheat,\" \"gluten-free,\" and \"low-fat\" on foods that are full of as much (and many times, much more) sugary treats like ice cream and cookies. So if seemingly healthy snacks like flavored yogurt, whole grain cereal, pretzels, and dried fruit are part of your snacking repertoire, you might be working against your workout goals."));
        clubs.add(new Club("You're Obsessed with Antibacterials",R.mipmap.hheight,"We know it might seem a little crazy, but your hand sanitizer could be making you fat. Triclosan is a synthetic antibacterial agent frequently added to soap. Researchers refer it to as an \"obesogen\"—a compound that can potentially cause weight gain by disrupting the body's hormones. Studies suggest that triclosan can negatively affect the thyroid. As thyroid hormones control metabolism, any hit to the organ's functionally could cause you to gain weight. The evidence is of particular concern for hospital workers, researchers say, as they're exposed to the antibacterial agent on a regular basis and often show significantly higher levels of triclosan in their urine. A study in the journal PLOS One found a detectable level was associated with a 0.9-point increase in body mass index (BMI). If you're a frequent hand-washer, experts recommend sticking to good ol' soap—not the antibacterial kind—and to buy organic products when possible."));
        clubs.add(new Club("You Eat Low-Fat Fare",R.mipmap.hhnine,"You know that eating trans fats can increase your risk of heart disease, weight gain, and stroke, so you're smart to stay away. But not all fats need to make your \"do not eat\" list. In fact, consuming healthy fats such as olive and coconut oil can actually help you slim down and stay healthy. \"Fats not only help us absorb many of the vitamins from our diets, but they also help keep us fuller longer, which can aid weight loss efforts,\" explains nutritionist Lori Zanini. Not to mention, reduced-fat products tend to replace harmless fats with low-performing carbohydrates that digest quickly—causing a sugar rush and, immediately afterward, rebound hunger. Simply put, they can make you gain weight. So stick to full-fat processed food (if you're going to eat it at all) and work a few full-fat fresh products into your diet, too. Registered dietitians Lauren Slayton and Torey Armul incorporate things like olive oil, avocado, fish, butter, ghee, and coconut oil into their daily diets."));
        clubs.add(new Club("You Skip Your Zzzs for a Morning Sweat Sesh",R.mipmap.hhten,"Getting in a workout first thing in the morning is a great way to boost energy and get your day started on a healthier note. The problem? If you set your alarm for 5 a.m. but didn't get to bed until after midnight, you could be missing out on crucial sleep. Dieters who sleep five hours or less put on 2½ times more belly fat, according to research from Wake Forest. If you want to hit the gym before dawn, make sure you are going to bed at a reasonable hour to get the recommended six to eight hours her night."));
        clubs.add(new Club("Or You Sleep Too Much",R.mipmap.hheleven,"Unfortunately, it is possible to have too much of a good thing. While skimping on sleep is associated with weight gain, researchers at Wake Forest found that those who sleep more than eight hours a night packed on more belly fat, the dangerous kind that's associated with heart disease, diabetes, and stroke. Shoot for an average of six to seven hours of sleep per night—the optimal amount for weight control. And burn calories overnight with these 30 things to do 30 minutes before bed to lose weight."));

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
