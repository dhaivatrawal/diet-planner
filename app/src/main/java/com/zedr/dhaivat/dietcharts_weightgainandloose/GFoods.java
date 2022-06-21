package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class GFoods extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<GFoods.Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gfoods);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterGFoods adapter = new RecyclerViewAdapterGFoods(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterGFoods adapter = new RecyclerViewAdapterGFoods(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new GFoods.Club("Milk","Milk has been used as a weight gainer or muscle builder for decades (1Trusted Source).\n" +
                "\n" +
                "It provides a good balance of proteins, carbs and fats and is a good source of calcium, as well as other vitamins and minerals (2).\n" +
                "\n" +
                "For those trying to add more muscle, milk is an excellent protein source that provides both casein and whey proteins. Research has even shown it can help you add muscle when combined with weight lifting (3Trusted Source, 4Trusted Source).\n" +
                "\n" +
                "Additionally, studies have found that milk, or whey and casein combined, can lead to greater mass gain than other protein sources (4Trusted Source, 5Trusted Source).\n" +
                "\n" +
                "Try drinking around one or two glasses as a snack, with a meal, or before and after a workout if you are training."));
        clubs.add(new GFoods.Club("Rice","Rice is a convenient, low-cost carb source to help you gain weight. Just 1 cup (165 grams) of cooked rice provides 190 calories, 43 grams of carbs and very little fat (6).\n" +
                "\n" +
                "It is also fairly calorie-dense, meaning you can easily obtain a high amount of carbs and calories from a single serving. This helps you eat more food, especially if you have a poor appetite or get full quickly.\n" +
                "\n" +
                "When you’re on the go or in a rush, two-minute packs of microwavable rice can be easily added to other protein sources and pre-made meals.\n" +
                "\n" +
                "Another popular method is to prepare a large pot of rice for the week and combine it with some proteins and healthy fats.\n" +
                "\n" +
                "However, extremely large amounts may not be wise due to their potential arsenic and phytic acid content. Arsenic can cause toxicity and phytic acid can reduce the absorption of zinc and iron (7Trusted Source)."));

        clubs.add(new GFoods.Club("Homemade Protein Smoothies","Drinking homemade protein smoothies can be a highly nutritious and quick way to gain weight.\n" +
                "\n" +
                "Making your own smoothies is the best way since commercial versions are often full of sugar and lack nutrients. It also gives you full control over the flavor and nutrient content.\n" +
                "\n" +
                "Here are just a few tasty variations you can try. You can combine each with 2 cups (470 ml) of milk or an alternative like almond milk.\n" +
                "\n" +
                "Chocolate banana nut shake: Combine 1 banana, 1 scoop of chocolate whey protein and 1 tablespoon (15 ml) of peanut or another nut butter.\n" +
                "Vanilla berry shake: Combine 1 cup (237 ml) of fresh or frozen mixed berries, ice, 1 cup (237 ml) of high-protein natural yogurt and 1 scoop of vanilla whey protein.\n" +
                "Chocolate hazelnut shake: Combine 15 ounces (444 ml) of chocolate milk with 1 scoop of chocolate whey protein, 1 tablespoon (15 ml) of hazelnut butter and 1 avocado.\n" +
                "Caramel apple shake: Combine 1 sliced apple, 1 cup (237 ml) of natural yogurt, 1 scoop of caramel- or vanilla-flavored whey protein and 1 tablespoon (15 ml) of sugar-free caramel sauce or flavoring.\n" +
                "Vanilla blueberry shake: Combine 1 cup (237 ml) of fresh or frozen blueberries, 1 scoop of vanilla whey protein, 1 cup (237 ml) of vanilla yogurt and sweetener if needed.\n" +
                "Super green shake: Combine 1 cup (237 ml) of spinach, 1 avocado, 1 banana, 1 cup (237 ml) of pineapple and 1 scoop of unflavored or vanilla whey protein.\n" +
                "All of these smoothies provide around 400–600 calories, along with a high amount of protein and other important vitamins and minerals."));
        clubs.add(new GFoods.Club("Nuts and Nut Butters","Nuts and nut butters are a perfect choice if you're looking to gain weight.\n" +
                "\n" +
                "Just one small handful of almonds contains over 7 grams of protein and 18 grams of healthy fats (8).\n" +
                "\n" +
                "Since they’re very calorie-dense, just two handfuls per day with a meal or as a snack can quickly add hundreds of calories.\n" +
                "\n" +
                "Nut butters can also be added to a variety of snacks or dishes, such as smoothies, yogurts and much more.\n" +
                "\n" +
                "However, make sure you pick 100% nut butters with no added sugar or extra oils."));
        clubs.add(new GFoods.Club("Red Meats","Red meats are probably one of the best muscle-building foods available.\n" +
                "\n" +
                "For example, steak contains around 3 grams of leucine per 6 ounces (170 grams). Leucine is the key amino acid your body needs to stimulate muscle protein synthesis and add new muscle tissue (9Trusted Source).\n" +
                "\n" +
                "In addition to this, red meats are one of the best natural sources of dietary creatine, which is possibly the world's best muscle-building supplement (10Trusted Source).\n" +
                "\n" +
                "Consider choosing fattier cuts, which provide more calories than leaner meats, helping you take in extra calories and add weight.\n" +
                "\n" +
                "In one study, 100 elderly women added 6 ounces (170 grams) of red meat to their diets and performed resistance training six days a week for six weeks.\n" +
                "\n" +
                "The women gained mass, had an 18% increase in strength and an increase in the important muscle-building hormone IGF-1 (11Trusted Source).\n" +
                "\n" +
                "Both lean and fatty meats are a great source of protein, though fatty meat provides more calories, which can help you gain weight."));
        clubs.add(new GFoods.Club("Potatoes and Starches","Potatoes and other starchy foods are a very easy and cost-effective way to add in extra calories.\n" +
                "\n" +
                "Try to choose one of these healthy sources of starchy carbs:\n" +
                "\n" +
                "Quinoa\n" +
                "Oats\n" +
                "Corn\n" +
                "Buckwheat\n" +
                "Potatoes and sweet potatoes\n" +
                "Squash\n" +
                "Winter root vegetables\n" +
                "Beans and legumes\n" +
                "Not only do potatoes and other starches add carbs and calories to help you gain weight — they also increase your muscle glycogen stores.\n" +
                "\n" +
                "Glycogen is the predominant fuel source for most sports and activities (12Trusted Source, 13Trusted Source).\n" +
                "\n" +
                "Many of these carb sources also provide important nutrients and fiber, as well as resistant starch, which can help nourish your gut bacteria ."));
        clubs.add(new GFoods.Club("Salmon and Oily Fish","Like red meat, salmon and oily fish are excellent sources of protein and important healthy fats.\n" +
                "\n" +
                "Out of all the nutrients that salmon and oily fish provide, omega-3 fatty acids are among the most significant and well known.\n" +
                "\n" +
                "They offer numerous benefits for your health and fight diseases (16Trusted Source).\n" +
                "\n" +
                "Just one 6-ounce (170-gram) fillet of salmon provides around 350 calories and 4 grams of omega-3 fats. The same serving packs 34 grams of high-quality protein, helping you build muscle or gain weight (17)."));
        clubs.add(new GFoods.Club("Protein Supplements","Taking protein supplements is a common strategy for athletes and bodybuilders who want to gain weight.\n" +
                "\n" +
                "Whey protein supplements and mass gainers can be a very easy and cost-effective strategy to gain weight, especially when combined with strength training (18Trusted Source, 19Trusted Source).\n" +
                "\n" +
                "Some people think whey protein is unhealthy or unnatural, but this isn't the case. Whey protein is made from dairy and has been shown to improve markers of health and reduce disease risk (20, 21Trusted Source, 22Trusted Source).\n" +
                "\n" +
                "It may be even more important if you're also training since your daily protein requirements increase.\n" +
                "\n" +
                "Like meats and other animal products, whey protein contains all the essential amino acids required to stimulate muscle growth (23Trusted Source, 24Trusted Source, 25Trusted Source).\n" +
                "\n" +
                "You can use it before or after your workout and at any other point during the day.\n" +
                "\n" +
                "If you'd like to try protein supplements, there's a wide variety available on Amazon."));
        clubs.add(new GFoods.Club("Dried Fruit","Dried fruit is a high-calorie snack that also provides antioxidants and micronutrients (26Trusted Source).\n" +
                "\n" +
                "You can get many different types of dried fruit.\n" +
                "\n" +
                "However, they have a very high sugar content and are not ideal for weight loss diets.\n" +
                "\n" +
                "On the other hand, this makes them great for gaining weight, especially since they’re convenient to eat and taste great.\n" +
                "\n" +
                "While many people think fruits lose most of their nutrients when dried, this isn't the case. Dried fruits contain lots of fiber and most of their vitamins and minerals remain intact (26Trusted Source, 27Trusted Source).\n" +
                "\n" +
                "Try combining some dried fruit with a protein source, such as cuts of meat or a whey protein shake. They also mix well with nuts and natural yogurt, providing a blend of healthy fats, protein and other key nutrients."));
        clubs.add(new GFoods.Club("Whole-Grain Bread","Whole-grain breads are another good carb source to help you gain weight.\n" +
                "\n" +
                "You can make some very simple, high-calorie and well-balanced meals by combining bread with protein sources such as eggs, meat and cheese.\n" +
                "\n" +
                "When purchasing bread, aim for natural whole-grain and seeded breads. Healthy versions, such as Ezekiel bread, are available in most grocery stores."));
        clubs.add(new GFoods.Club("Avocados","Avocados are loaded with healthy fats.\n" +
                "\n" +
                "Unlike other whole fruits, avocados are fairly calorie-dense and therefore a great food to help you gain weight.\n" +
                "\n" +
                "Just one large avocado provides around 322 calories, 29 grams of fat and 17 grams of fiber (28).\n" +
                "\n" +
                "Avocados are also high in vitamins, minerals and various beneficial plant compounds.\n" +
                "\n" +
                "Try adding avocados to your main meals and other dishes such as omelets or sandwiches."));
        clubs.add(new GFoods.Club("Healthy Cereals","Healthy cereals can be an excellent source of carbs, calories and nutrients.\n" +
                "\n" +
                "While you should avoid processed, high-sugar cereals, healthier forms like oatmeal can be a great carb source to add to your diet.\n" +
                "\n" +
                "Grain-based cereals and oats also contain beneficial nutrients like fiber and healthy antioxidants (29Trusted Source).\n" +
                "\n" +
                "When purchasing cereals, focus on these healthy choices:\n" +
                "\n" +
                "Oats\n" +
                "Granola\n" +
                "Multigrains\n" +
                "Bran\n" +
                "Ezekiel"));
        clubs.add(new GFoods.Club("Cereal Bars","Some of the healthier cereal bars on the market can be a great snack when you’re on the go.\n" +
                "\n" +
                "They are also a good choice before or after a training session since they tend to contain a mix of slow- and fast-digesting carbs.\n" +
                "\n" +
                "As with cereals, try to stick to bars made from healthy whole grains. You can also find bars that contain other healthy ingredients, such as dried fruits, nuts or seeds.\n" +
                "\n" +
                "As a snack or meal on the go, try combining a cereal bar with other protein sources, such as natural yogurt, boiled eggs, cold cuts of meat or a protein shake."));
        clubs.add(new GFoods.Club("Dark Chocolate","High-quality dark chocolate provides a ton of antioxidants and health benefits.\n" +
                "\n" +
                "Most people recommend getting dark chocolate with a cocoa content of at least 70%.\n" +
                "\n" +
                "Like other high-fat foods, dark chocolate has a very high calorie density, meaning it's very easy to get many calories from it.\n" +
                "\n" +
                "Each 100-gram (3.5-ounce) bar has around 600 calories and is packed with micronutrients and health-promoting compounds, including fiber, magnesium and antioxidants"));
        clubs.add(new GFoods.Club("Cheese","Cheese has been a staple food for centuries.\n" +
                "\n" +
                "Like dark chocolate, it’s high in calories and fats. If you eat it in larger quantities, it’s also a very good source of protein (31).\n" +
                "\n" +
                "Since cheese is incredibly tasty, you can incorporate it into most dishes and easily add several hundred extra calories.\n" +
                "\n" +
                "Summary Cheese is a very good source of protein and rich in healthy fats. Add it to meals if you need a calorie and flavor boost."));
        clubs.add(new GFoods.Club("Whole Eggs","Eggs are one of the healthiest muscle-building foods on the planet. They provide a great combination of high-quality proteins and healthy fats.\n" +
                "\n" +
                "It's also very important to eat the whole egg. In fact, almost all of the beneficial nutrients in eggs are found in the yolk.\n" +
                "\n" +
                "As long as you don’t have an intolerance to eggs, there is no need to limit your egg consumption — you can easily eat three eggs per day if you want.\n" +
                "\n" +
                "In fact, many athletes or bodybuilders will eat six or more daily."));
        clubs.add(new GFoods.Club("Full-Fat Yogurt","Full-fat yogurt is another healthy and convenient snack. It has a great nutritional profile, including a well-balanced mix of protein, carbs and fat.\n" +
                "\n" +
                "There are numerous snacks and healthy weight-gain recipes based on yogurt. Here are a few:\n" +
                "\n" +
                "Yogurt and fruit: Combine 1–2 cups of yogurt with fresh or dried fruit. You can also add nuts, seeds, honey, granola or coconut flakes.\n" +
                "Chocolate peanut butter pudding: Mix 1–2 cups of yogurt with 100% cocoa powder, peanut or any nut butter and a sweetener such as stevia. You can also add a scoop of whey for more protein.\n" +
                "Yogurt parfait: Combine 1–2 cups of yogurt with granola and mixed berries in layers to create a tasty and well-balanced breakfast or healthy snack.\n" +
                "Smoothies: Yogurt is an excellent addition to virtually any smoothie to increase the protein content and give it a more creamy, milkshake-like thickness."));
        clubs.add(new GFoods.Club("Healthy Fats and Oils","Healthy fats and oils are some of the most calorie–dense foods on the planet.\n" +
                "\n" +
                "Simply adding a tablespoon (15 ml) of oil to sauces, salads and during cooking can quickly add 135 calories.\n" +
                "\n" +
                "Healthy oils include extra virgin olive oil, avocado oil and coconut oil."));


    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
