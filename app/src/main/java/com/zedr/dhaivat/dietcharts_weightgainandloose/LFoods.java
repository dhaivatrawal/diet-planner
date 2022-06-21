package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LFoods extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<LFoods.Club> clubs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lfoods);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterLFoods adapter = new RecyclerViewAdapterLFoods(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterLFoods adapter = new RecyclerViewAdapterLFoods(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new LFoods.Club("Peanut Butter",R.mipmap.lfone,"Peanut butter packs 8 grams of protein and up to 4 grams of fiber per serving, making it an ideal snack to help you fill up and stay satisfied. Peanuts contain L-arginine, an amino acid that works to improve blood flow throughout your body by helping blood vessels \"relax\" — all of which can help to mitigate fluid retention.\n" +
                "\n" +
                "Related: Our 1,200 Calorie Diet Meal Plan Can Help You Lose 20 Pounds in 7 Days"));
        clubs.add(new LFoods.Club("Chickpeas",R.mipmap.lftwo,"They're filled with fiber and plant-based protein, as well as immune-boosting antioxidants and bloat-busting minerals. Chickpeas easily go in soups, stews, salads, and side dishes. Plus, chickpea flour is a great baking alternative for a more nutrient-dense and filling end result."));
        clubs.add(new LFoods.Club("Pumpkin",R.mipmap.lfthree,"With more fiber than quinoa and more potassium than a banana, pumpkin puree is one of your best bets for snacking and cooking purposes. Try this the next time you're craving sweets: Add pureed pumpkin to unsweetened Greek yogurt with cinnamon and chopped pears for a nutritious dessert."));
        clubs.add(new LFoods.Club("Peas",R.mipmap.lffour,"A cup of peas packs 8 grams of protein and tons of key bloat-reducing nutrients. It's got nearly all of what you need daily for vitamin C, plus magnesium, potassium, and iron — all of which aid in counterbalancing sodium and bringing oxygen to blood cells."));
        clubs.add(new LFoods.Club("Tuna",R.mipmap.lffive,"It doesn't get any better than fish when it comes to healthy protein, especially tuna, salmon, and sardines. They're filled with important omega-3s and lean protein, helping you fill up and curb cravings."));
        clubs.add(new LFoods.Club("Salmon",R.mipmap.lfsix,"The polyunsaturated fatty acids plus minerals in salmon make it an ideal dinner choice. The vitamin D found in each fillet is linked with lowering your risk of chronic disease, and you'll also get 25% of your daily vitamin B6, which can help with mood and stress regulation."));
        clubs.add(new LFoods.Club("Potatoes",R.mipmap.lfseven,"Baked potatoes (yes — white potatoes!) are an excellent source of potassium, which can help beat bloat and counterbalance sodium. Since they've got filling fiber, spuds also help you stay fuller, longer. Avoid the deep fryer, though. Potatoes are a nutrient-dense food as long as they're not served the french-fry way."));
        clubs.add(new LFoods.Club("Seeds",R.mipmap.lfeight,"Mineral-packed seeds — especially sunflower and pumpkin — provide lots of immune-boosting zinc and seriously fill you up. The hearty combo of plant-based protein and fiber can stave off hunger pangs later on."));
        clubs.add(new LFoods.Club("Fermented Foods",R.mipmap.lfnine,"Fermented foods like miso, tempeh, and sauerkraut contain probiotics, a.k.a. friendly bacteria that help boost immunity, regulate gut function, and banish bloat. Unsweetened plain Greek yogurt and skyr can provide probiotic benefits too. Choose ones that have five strains or more of bacterial cultures per 6-ounce serving."));
        clubs.add(new LFoods.Club("Oats",R.mipmap.lften,"Probiotics introduce useful bacterial to your system, but the prebiotics in oats feed the good bacteria already living there, helping it proliferate."));
        clubs.add(new LFoods.Club("Nuts",R.mipmap.lfeleven,"Almonds, peanuts, walnuts, pistachios — at GH, we're nuts about nuts! People who snack on nuts may have lower abdominal fat than those who munch on carb-based treats, according to a 2015 study in the Journal of the American Heart Association. Nuts are rich in monounsaturated fats, a heart-healthy (and more satisfying) pick than their grain-based counterparts."));
        clubs.add(new LFoods.Club("Berries",R.mipmap.lftwelve,"Berries are packed with fiber (up to 9 grams a cup!) and antioxidants but contain less sugar than most fruits. That combo makes them a satisfying and healthy choice."));
        clubs.add(new LFoods.Club("Olive Oil",R.mipmap.lfthirteen,"Plant-based oils like extra-virgin olive oil create that \"full\" feeling and help you slim down overall. Skip battered foods deep-fried in oil, though! Fried snacks are associated with weight gain, so you're better off enjoying them only once in awhile."));
        clubs.add(new LFoods.Club("Eggs",R.mipmap.lffourteen,"High-protein breakfasts, especially ones that include eggs, have been linked to weight loss, reducing belly fat in the process. Add eggs to salads, stir-frys, and sautés, or pair them with 100% whole-grain toast and veggies for a hearty breakfast."));
        clubs.add(new LFoods.Club("Beans and Lentils",R.mipmap.lffifteen,"Beans and lentils are everywhere these days, and we couldn't be happier about it. They're filled with fiber and plant-based protein, plus minerals and B-vitamins. Overall, beans reduce bloat by aiding your nervous and muscular systems, helping you build lean body mass."));
        clubs.add(new LFoods.Club("Whole Grains",R.mipmap.lfsixteen,"Grains get a bad rap when it comes to weight loss, but that's because refined grains (read: processed foods!) are linked to wider waists. 100% whole grains are bloat-busting superstars, however, as they're packed with minerals and de-puff by counter-balancing salt. Stick to brown rice, quinoa, wheat, barley, millet, farro, sorghum, and amaranth for the biggest benefits."));
        clubs.add(new LFoods.Club("Dairy",R.mipmap.lfseventeen,"Add a cup of low-fat milk, a part-skim mozzarella stick, or a half cup of low-sodium cottage cheese to breakfast, and you may have a belly-busting win. While lots of research links calcium with lower body weights, results from a 2014 study suggest that calcium-containing foods may reduce waist circumference in those genetically predisposed to carrying weight in their midsection."));
        clubs.add(new LFoods.Club("Leafy Greens",R.mipmap.lfeighteen,"Plant-based omega-3s belong in any healthy eating plan, but leafy greens and cauliflower are especially helpful for tightening up. They're loaded with minerals like potassium, which can help offset the bloat-inducing effects of sodium."));
        clubs.add(new LFoods.Club("Avocados",R.mipmap.lfnineteen,"Good news for lovers of this fruit (yes, it's a fruit!): A 2013 study linked eating avocado regularly to lower waist circumference and BMI. What's more, the monounsaturated fats are heart-healthy and filling, reducing the urge to graze on processed foods later on."));
        clubs.add(new LFoods.Club("Bananas",R.mipmap.lftwenty,"Filled with potassium and magnesium, bananas offset the bloat caused salty processed foods and pack in plant-based prebiotics, \"feeding\" your good bacteria. Snack on one a day with a tablespoon of nut butter, or slice it into your morning cereal."));
        clubs.add(new LFoods.Club("Coffee and Tea",R.mipmap.lftwentyone,"Another win for your morning cup of joe: Caffeinated coffee keeps things moving through the digestive tract. Since staying regular is key to a tighter-looking tummy, drinking about 8 to 16 ounces of java at the same time every day can help you stay on schedule. Remember: Sugary drinks can lead to weight gain, so skip fancy flavorings and synthetic sweeteners containing sugar alcohols, which can cause bloating."));
        clubs.add(new LFoods.Club("Tomatoes",R.mipmap.lftwentytwo,"Tomatoes, mushrooms, carrots, cucumber, and other salad staples all help you stay hydrated due to their high H2O content. That extra water can offset fluid retention caused by excess salt."));
        clubs.add(new LFoods.Club("Asparagus",R.mipmap.lftwentythree,"As a prebiotic-filled veggie, asparagus is a great addition to soups, pastas, and omelets, or served as a side dish. For extra bloat-beating benefits, try pairing asparagus sticks with other crudité and dipping in hummus."));
        clubs.add(new LFoods.Club("Citrus Fruits",R.mipmap.lftwentyfour,"The potassium in citrus helps combat bloat while the antioxidants fight inflammation, which is associated with belly-fat storage. Since a key part of beating the bulge is proper hydration, adding citrus to your H2O can help non-water drinkers to sip up and ultimately slim down!"));
        clubs.add(new LFoods.Club("Onions",R.mipmap.lftwentyfive,"You already know that alliums like garlic, onion, leeks, scallions, and shallots add lots of flavor, but they also provide tons of prebiotic fiber. Sneak them into savory dishes, like omelets and healthy salads."));
        clubs.add(new LFoods.Club("Sweet Potato",R.mipmap.lftwentysix,"Sweet potatoes, butternut squash, and other good-for-you orange veggies are lower in calories and chock-full of potassium and beta-carotene. Their mineral-rich and fiber-full properties make them bloat-beating all-stars."));
        clubs.add(new LFoods.Club("Herbs and Spices",R.mipmap.lftwentyseven,"Flavor foods with herbs and spices whenever you can. It'll encourage you cut back on high-sodium staples and avoid the salt shaker, a major player in bloating. Plus, many have mild diuretic effects, helping you flush out excess water. We love basil, cilantro, rosemary, sage, tarragon, mint, oregano, and black and red chili peppers, to name a few."));

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
