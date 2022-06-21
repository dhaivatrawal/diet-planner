package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LHabits extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<LHabits.Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lhabits);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterLHabits adapter = new RecyclerViewAdapterLHabits(clubs);

        initializeData();
        initializeAdapter();

    }

    private void initializeAdapter() {

        RecyclerViewAdapterLHabits adapter = new RecyclerViewAdapterLHabits(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new LHabits.Club("Drink Water, Especially Before Meals","It is often claimed that drinking water can help with weight loss — and that’s true.\n" +
                "\n" +
                "Drinking water can boost metabolism by 24–30% over a period of 1–1.5 hours, helping you burn off a few more calories.\n" +
                "\n" +
                "One study showed that drinking a half-liter (17 ounces) of water about half an hour before meals helped dieters eat fewer calories and lose 44% more weight, compared to those who didn’t drink the water."));
        clubs.add(new LHabits.Club("Eat Eggs For Breakfast","Eating whole eggs can have all sorts of benefits, including helping you lose weight.\n" +
                "\n" +
                "Studies show that replacing a grain-based breakfast with eggs can help you eat fewer calories for the next 36 hours as well as lose more weight and body fat (4Trusted Source, 5Trusted Source).\n" +
                "\n" +
                "If you don’t eat eggs, that's fine. Any source of quality protein for breakfast should do the trick.\n" +
                "\n"));
        clubs.add(new LHabits.Club("Drink Coffee (Preferably Black)","Coffee has been unfairly demonized. Quality coffee is loaded with antioxidants and can have numerous health benefits.\n" +
                "\n" +
                "Studies show that the caffeine in coffee can boost metabolism by 3–11% and increase fat burning by up to 10–29% (6Trusted Source, 7Trusted Source, 8Trusted Source).\n" +
                "\n" +
                "Just make sure not to add a bunch of sugar or other high-calorie ingredients to your coffee. That will completely negate any benefits.\n" +
                "\n" +
                "You can shop for coffee at your local grocery store, as well as online."));
        clubs.add(new LHabits.Club("Drink Green Tea","Like coffee, green tea also has many benefits, one of them being weight loss.\n" +
                "\n" +
                "Though green tea contains small amounts of caffeine, it is loaded with powerful antioxidants called catechins, which are believed to work synergistically with caffeine to enhance fat burning (9, 10Trusted Source).\n" +
                "\n" +
                "Although the evidence is mixed, many studies show that green tea (either as a beverage or a green tea extract supplement) can help you lose weight (11Trusted Source, 12Trusted Source).\n" +
                "\n" +
                "Green tea is available at most pharmacies, health stores, and grocery stores, as well as online."));
        clubs.add(new LHabits.Club("Try Intermittent Fasting","Intermittent fasting is a popular eating pattern in which people cycle between periods of fasting and eating.\n" +
                "\n" +
                "Short-term studies suggest intermittent fasting is as effective for weight loss as continuous calorie restriction (13Trusted Source).\n" +
                "\n" +
                "Additionally, it may reduce the loss of muscle mass typically associated with low-calorie diets. However, higher-quality studies are needed before any stronger claims can be made."));
        clubs.add(new LHabits.Club("Take a Glucomannan Supplement","A fiber called glucomannan has been linked to weight loss in several studies.\n" +
                "\n" +
                "This type of fiber absorbs water and sits in your gut for a while, making you feel more full and helping you eat fewer calories (15).\n" +
                "\n" +
                "Studies show that people who supplement with glucomannan lose a bit more weight than those who don't (16Trusted Source).\n" +
                "\n" +
                "You can find glucomannan supplements not only at vitamin shops and pharmacies but also online."));
        clubs.add(new LHabits.Club("Cut Back on Added Sugar","Added sugar is one of the worst ingredients in the modern diet. Most people consume way too much.\n" +
                "\n" +
                "Studies show that sugar (and high-fructose corn syrup) consumption is strongly associated with an increased risk of obesity, as well as conditions including type 2 diabetes and heart disease (17Trusted Source, 18Trusted Source, 19Trusted Source).\n" +
                "\n" +
                "If you want to lose weight, cut back on added sugar. Just make sure to read labels, because even so-called health foods can be loaded with sugar."));
        clubs.add(new LHabits.Club("Eat Less Refined Carbs","Refined carbohydrates include sugar and grains that have been stripped of their fibrous, nutritious parts. These include white bread and pasta.\n" +
                "\n" +
                "Studies show that refined carbs can spike blood sugar rapidly, leading to hunger, cravings and increased food intake a few hours later. Eating refined carbs is strongly linked to obesity (20Trusted Source, 21Trusted Source, 22).\n" +
                "\n" +
                "If you're going to eat carbs, make sure to eat them with their natural fiber."));
        clubs.add(new LHabits.Club("Go on a Low-Carb Diet","If you want to get all the benefits of carb restriction, then consider going all the way and committing to a low-carb diet.\n" +
                "\n" +
                "Numerous studies show that such a regimen can help you lose 2–3 times as much weight as a standard low-fat diet while also improving your health."));
        clubs.add(new LHabits.Club("Use Smaller Plates","Using smaller plates has been shown to help some people automatically eat fewer calories (26Trusted Source).\n" +
                "\n" +
                "However, the plate-size effect doesn’t appear to affect everyone. Those who are overweight seem to be more affected."));
        clubs.add(new LHabits.Club("Exercise Portion Control or Count Calories","Portion control — simply eating less — or counting calories can be very useful, for obvious reasons (29Trusted Source).\n" +
                "\n" +
                "Some studies show that keeping a food diary or taking pictures of your meals can help you lose weight (30Trusted Source, 31).\n" +
                "\n" +
                "Anything that increases your awareness of what you are eating is likely to be beneficial."));
        clubs.add(new LHabits.Club("Keep Healthy Food Around in Case You Get Hungry","Keeping healthy food nearby can help prevent you from eating something unhealthy if you become excessively hungry.\n" +
                "\n" +
                "Snacks that are easily portable and simple to prepare include whole fruits, nuts, baby carrots, yogurt and hard-boiled eggs."));
        clubs.add(new LHabits.Club("Take Probiotic Supplements","Taking probiotic supplements containing bacteria of the Lactobacillus subfamily have been shown to reduce fat mass (32Trusted Source, 33Trusted Source).\n" +
                "\n" +
                "However, the same doesn’t apply to all Lactobacillus species. Some studies have linked L. acidophilus with weight gain (34).\n" +
                "\n" +
                "You can shop for probiotic supplements at many grocery stores, as well as online."));
        clubs.add(new LHabits.Club("Eat Spicy Foods","Chili peppers contain capsaicin, a spicy compound that can boost metabolism and reduce your appetite slightly (35Trusted Source, 36Trusted Source).\n" +
                "\n" +
                "However, people may develop tolerance to the effects of capsaicin over time, which may limit its long-term effectiveness."));
        clubs.add(new LHabits.Club("Do Aerobic Exercise","Doing aerobic exercise (cardio) is an excellent way to burn calories and improve your physical and mental health.\n" +
                "\n" +
                "It appears to be particularly effective for losing belly fat, the unhealthy fat that tends to build up around your organs and cause metabolic disease."));
        clubs.add(new LHabits.Club("Lift Weights","One of the worst side effects of dieting is that it tends to cause muscle loss and metabolic slowdown, often referred to as starvation mode (40Trusted Source, 41Trusted Source).\n" +
                "\n" +
                "The best way to prevent this is to do some sort of resistance exercise such as lifting weights. Studies show that weight lifting can help keep your metabolism high and prevent you from losing precious muscle mass (42Trusted Source, 43Trusted Source).\n" +
                "\n" +
                "Of course, it's important not just to lose fat — you also want to build muscle. Resistance exercise is critical for a toned body."));
        clubs.add(new LHabits.Club("Eat More Fiber","Fiber is often recommended for weight loss.\n" +
                "\n" +
                "Although the evidence is mixed, some studies show that fiber (especially viscous fiber) can increase satiety and help you control your weight over the long term ."));
        clubs.add(new LHabits.Club("Eat More Vegetables and Fruits","Vegetables and fruits have several properties that make them effective for weight loss.\n" +
                "\n" +
                "They contain few calories but a lot of fiber. Their high water content gives them low energy density, making them very filling.\n" +
                "\n" +
                "Studies show that people who eat vegetables and fruits tend to weigh less (46Trusted Source).\n" +
                "\n" +
                "These foods are also very nutritious, so eating them is important for your health."));
        clubs.add(new LHabits.Club("Get Good Sleep","Sleep is highly underrated but may be just as important as eating healthy and exercising.\n" +
                "\n" +
                "Studies show that poor sleep is one of the strongest risk factors for obesity, as it’s linked to an 89% increased risk of obesity in children and 55% in adults."));
        clubs.add(new LHabits.Club("Beat Your Food Addiction","A recent study found that 19.9% of people in North America and Europe fulfill the criteria for food addiction (48Trusted Source).\n" +
                "\n" +
                "If you experience overpowering cravings and can't seem to curb your eating no matter how hard you try, you may suffer from addiction.\n" +
                "\n" +
                "In this case, seek professional help. Trying to lose weight without first combating food addiction is next to impossible."));
        clubs.add(new LHabits.Club("Eat More Protein","Protein is the single most important nutrient for losing weight.\n" +
                "\n" +
                "Eating a high-protein diet has been shown to boost metabolism by 80–100 calories per day while shaving 441 calories per day off your diet .\n" +
                "\n" +
                "One study also showed that eating 25% of your daily calories as protein reduced obsessive thoughts about food by 60% while cutting desire for late-night snacking in half .\n" +
                "\n" +
                "Simply adding protein to your diet is one of the easiest and most effective ways to lose weight."));
        clubs.add(new LHabits.Club("Supplement With Whey Protein","If you struggle to get enough protein in your diet, taking a supplement — such as protein powder — can help.\n" +
                "\n" +
                "One study showed that replacing some of your calories with whey protein can cause weight loss of about 8 pounds over time while increasing muscle mass (53Trusted Source).\n" +
                "\n" +
                "Whey protein is available at most health stores and online."));
        clubs.add(new LHabits.Club("Don't Do Sugary Drinks, Including Soda and Fruit Juice","Sugar is bad, but sugar in liquid form is even worse. Studies show that calories from liquid sugar may be the single most fattening aspect of the modern diet (54Trusted Source).\n" +
                "\n" +
                "For example, one study showed that sugar-sweetened beverages are linked to a 60% increased risk of obesity in children for each daily serving (55Trusted Source).\n" +
                "\n" +
                "Keep in mind that this applies to fruit juice as well, which contains a similar amount of sugar as a soft drink like Coke (56Trusted Source).\n" +
                "\n" +
                "Eat whole fruit, but limit or avoid fruit juice altogether."));
        clubs.add(new LHabits.Club("Eat Whole, Single-Ingredient Foods (Real Food)","If you want to be a leaner, healthier person, then one of the best things you can do for yourself is to eat whole, single-ingredient foods.\n" +
                "\n" +
                "These foods are naturally filling, and it's very difficult to gain weight if the majority of your diet is based on them.\n" +
                "\n" +
                "Here are 20 of the most weight loss-friendly foods on earth."));
        clubs.add(new LHabits.Club("Don't Diet — Eat Healthy Instead","One of the biggest problems with diets is that they rarely work in the long term.\n" +
                "\n" +
                "If anything, people who diet tend to gain more weight over time, and studies show that dieting is a consistent predictor of future weight gain (57Trusted Source).\n" +
                "\n" +
                "Instead of going on a diet, aim to become a healthier, happier and fitter person. Focus on nourishing your body instead of depriving it.\n" +
                "\n" +
                "Weight loss should then follow naturally."));
        clubs.add(new LHabits.Club("Chew More Slowly","Your brain may take a while to register that you've had enough to eat. Some studies show that chewing more slowly can help you eat fewer calories and increase the production of hormones linked to weight loss .\n" +
                "\n" +
                "Also consider chewing your food more thoroughly. Studies show that increased chewing may reduce calorie intake at a meal.\n" +
                "\n" +
                "These practices are a component of mindful eating, which aims to help you slow down your food intake and pay attention to each bite."));
    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}



