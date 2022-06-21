package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class GDiet extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<GDiet.Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gdiet);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterGDiet adapter = new RecyclerViewAdapterGDiet(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterGDiet adapter = new RecyclerViewAdapterGDiet(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new GDiet.Club("Day 1 - 3096 Calories","\n" +
                "Breakfast: 722 Calories\n" +
                "\n" +
                "75g/2.65oz Granola\t- 368 Calories\n" +
                "100g/3.5oz Greek Yogurt\t - 120 Calories\n" +
                "Topping: 28g/1oz chopped Brazil Nuts, 1 handful each of Blueberries and Raspberries   -  234 Calories\n" +
                "\n" +
                "Morning Snack: 246 Calories\n" +
                "\n" +
                "\n" +
                "2 Oatcakes (oat crackers)  -  90 Calories\n" +
                "1 tablespoon Peanut Butter   -  94 Calories\n" +
                "1 Nectarine   -  62 Calories\n" +
                "\n" +
                "Lunch: 844 Calories\n" +
                "\n" +
                "2 Whole Wheat Pita Breads   -  308 Calories\n" +
                "100g/3.5oz Roast Chicken   -  190 Calories\n" +
                "1 medium Avocado, sliced or mashed   -  322 Calories\n" +
                "Large handful of Spinach, Watercress and Rocket (Arugula)   -  24 Calories\n" +
                "\n" +
                "Afternoon Snack: 250 Calories\n" +
                "\n" +
                "50g/1.75oz Trail Mix   -  250 Calories\n" +
                "\n" +
                "Dinner: 929 Calories\n" +
                "\n" +
                "140g/5oz Salmon Fillet  -  275 Calories\n" +
                "100g/3.5oz Brown Basmati Rice (dry weight)   -  360 Calories\n" +
                "Tahini Broccoli - 85g/3oz cooked Broccoli, tossed in 1 tbsp Olive Oil, 1 tbsp Tahini and a squeeze of Lemon Juice   -  239 Calories\n" +
                "80g (2.8oz) Green Peas (Petits Pois)   -  55 Calories\n" +
                "\n" +
                "Evening Snack: 105 Calories\n" +
                "\n" +
                "Medium Banana   -  105 Calories"));
        clubs.add(new GDiet.Club("Day 2 - 3007 Calories","\n" +
                "Breakfast: 671 Calories\n" +
                "\n" +
                "Scrambled Eggs on Rye Toast (3 Eggs, 2 Slices of Buttered Rye Toast)\t577 Calories\n" +
                "125ml/1/2 cup Prune Juice\t94 Calories\n" +
                "\n" +
                "Morning Snack: 226 Calories\n" +
                "\n" +
                "28g/1oz Pumpkin Seeds\t166 Calories\n" +
                "1 Pear\t60 Calories\n" +
                "\n" +
                "Lunch: 819 Calories\n" +
                "\n" +
                "Quinoa & Mozzarella Salad\t\n" +
                "100g/3.5oz (dry weight) Quinoa, cooked\t374 Calories\n" +
                "56g/2oz Buffalo Mozzarella\t159 Calories\n" +
                "28g/1oz Toasted Pine Nuts\t151 Calories\n" +
                "1 large handful of Baby Spinach, 1 tbsp Olive Oil, 1 bunch fresh Basil\t135 Calories\n" +
                "\n" +
                "Afternoon Snack: 233 Calories\n" +
                "\n" +
                "3 Oat Cakes (Oat Crackers)\t113 Calories\n" +
                "3 tbsp Hummus\t120 Calories\n" +
                "\n" +
                "Dinner: 756 Calories\n" +
                "\n" +
                "Shrimp (Prawn) & Cherry Tomato Pasta\t\n" +
                "125g/4.5oz Whole Wheat Spelt Penne\t420 Calories\n" +
                "Shrimp (Prawn) & Cherry Tomato Sauce: 100g/3.5oz Shrimp (Prawn), 85g/3oz Cherry Tomatoes, 1 tbsp Olive Oil, 2 tbsp chopped Parsley\t203 Calories\n" +
                "Salad: 1/2 bag Mixed Salad, 1 tbsp Olive Oil, 1 tsp Balsamic Vinegar\t133 Calories\n" +
                "\n" +
                "Evening Snack: 302 Calories\n" +
                "\n" +
                "Smoothie: Blend 1/2 Banana, 1 tbsp Almond Butter, a large handful of Blueberries, 150g/5oz Whole Milk Yoghurt\t302 Calories"));
        clubs.add(new GDiet.Club("Day 3 - 2996 Calories","\n" +
                "Breakfast: 821 Calories\n" +
                "\n" +
                "Blueberry, Nut & Cinnamon Oatmeal\t\n" +
                "Oatmeal: 60g/2oz Oats, 250ml/1 cup Whole Milk, 28g/1oz Raisins, 2 tbsp Ground Almonds, 1/2 tsp Cinnamon\t   543 Calories\n" +
                "Topping: 28g/1oz Walnuts or Pecans, 1 handful Blueberries\t208 Calories\n" +
                "125ml/1/2 cup Grape Juice\t70 Calories\n" +
                "\n" +
                "Morning Snack: 185 Calories\n" +
                "\n" +
                "Large Handful Cashew Nuts & Raisins\t185 Calories\n" +
                "\n" +
                "Lunch:778 Calories\n" +
                "\n" +
                "Smoked Mackerel Pâté: 100g/3.5oz Smoked Mackerel Fillets, mashed with 2 tbsp Natural Yoghurt, 1 tbsp chopped Dill, a squeeze of Lemon and Black Pepper\t  431 Calories\n" +
                "6 Oat Cakes (Oat Crackers)\t270 Calories\n" +
                "1 Apple\t   77 Calories\n" +
                "\n" +
                "Afternoon Snack: 119 Calories\n" +
                "\n" +
                "Granola Bar\t119 Calories\n" +
                "\n" +
                "Dinner: 760 Calories\n" +
                "\n" +
                "120g/ 4oz Grilled Fillet Steak\t 332 Calories\n" +
                "Baked Potato with Garlic Butter\t 269 Calories\n" +
                "Spinach & Green Beans, sautéed in 1 tbsp Olive Oil    159 Calories\n" +
                "\n" +
                "Evening Snack: 333 Calories\n" +
                "\n" +
                "1 small pot Greek Yogurt\t134 Calories\n" +
                "Small Banana, sliced\t72 Calories\n" +
                "10g/0.4oz Crushed Walnuts and 10g/0.4oz Crushed Dark Chocolate \t127 Calories"));
        clubs.add(new GDiet.Club("Day 4 - Vegetarian - 3357 Calories","\n" +
                "Breakfast: 728 Calories\n" +
                "\n" +
                "3 Vegetarian Sausages, 2 Grilled Portabella Mushrooms, 1 large Grilled Tomato, 85g/3oz Baked Beans\t373\n" +
                "2 slices Buttered Wheat Toast\t240\n" +
                "250ml/1cup Pineapple Juice\t115\n" +
                "\n" +
                "Morning Snack: 288 Calories\n" +
                "\n" +
                "Banana, Honey & Almond Smoothie\tCalories\n" +
                "Blend: 1 small Banana, 1 tbsp Almond Butter, 100g/3.5oz Greek Yoghurt, 1 tsp Honey, water to thin, as necessary\t288\n" +
                "\n" +
                "Lunch: 835 Calories\n" +
                "\n" +
                "Goat's Cheese, Walnut & Cranberry Salad\tCalories\n" +
                "56g/2oz Soft Goat's Cheese\t152\n" +
                "Salad: 85g/3oz Mixed Salad Leaves, 56g/2oz Cherry Tomatoes, 28g/1oz Walnuts, 2 tbsp Dried Cranberries, 1 tbsp Olive Oil, 1 tbsp Balsamic Vinegar\t373\n" +
                "2 Wheat Pita Breads\t310\n" +
                "\n" +
                "Afternoon Snack: 337 Calories\n" +
                "\n" +
                "2 Rye Crackers\t70\n" +
                "2 tbsp Cream Cheese\t101\n" +
                "28g/1oz Pumpkin Seeds\t166\n" +
                "\n" +
                "Dinner: 957 Calories\n" +
                "\n" +
                "Zucchini & Parmesan Frittata: 3 Eggs, 1 Zucchini (sautéed), 56g/2oz Parmesan, 1 tbsp Olive Oil for cooking\t582\n" +
                "1 Medium Sweet Potato cut into Wedges, roasted in 1 tbsp Sunflower Oil\t238\n" +
                "Green Salad, dressed with 1 tbsp Olive Oil and Lemon Juice\t137\n" +
                "\n" +
                "Evening Snack: 212 Calories\n" +
                "\n" +
                "40g/1.4oz 85% Dark Chocolate\t212"));
        clubs.add(new GDiet.Club("Day 5 - Vegan - 3146 Calories","\n" +
                "Breakfast: 789 Calories\n" +
                "\n" +
                "2 slices Wheat Toast\t139\n" +
                "3 tbsp Peanut Butter\t400\n" +
                "Large bowl of Fruit Salad\t250\n" +
                "\n" +
                "Morning Snack: 240 Calories\n" +
                "\n" +
                "Oatmeal Raisin Cliff Bar\t240\n" +
                "\n" +
                "Lunch: 565 Calories\n" +
                "\n" +
                "Lentil & Avocado Salad (1/2 bag Rocket (Arugula), Spinach and Watercress Salad, 1/2 Avocado, cubed, 100g/1/2 cup cooked Brown/Green Lentils\t294\n" +
                "28g/1oz Toasted Pine Nuts\t151\n" +
                "Dressing: 1 tbsp Olive Oil, squeeze of Lemon Juice\t120\n" +
                "\n" +
                "Afternoon Snack: 245 Calories\n" +
                "Food Items\tCalories\n" +
                "10 Brazil Nuts\t140\n" +
                "1 Banana\t105\n" +
                "\n" +
                "Dinner: 955 Calories\n" +
                "Tofu, Cashew & Broccoli Stir-Fry\n" +
                "100g/3.5oz Soba Noodles (dry weight)\t330\n" +
                "100g/3.5oz Firm Tofu\t129\n" +
                "56g/2oz Cashew Nuts, 1 tbsp Sesame Oil, 50g/1.75oz Broccoli, 50g/1.75oz Baby Corn\t496\n" +
                "\n" +
                "Evening Snack: 352 Calories\n" +
                "\n" +
                "1/3 tub of Hummus\t330\n" +
                "Carrot & Celery Sticks\t22"));
        clubs.add(new GDiet.Club("Day 6 - High Calorie - 5018 Calories","Breakfast: 1161 Calories\n" +
                "\n" +
                "Bircher Muesli: 200g/7oz Greek Yogurt, 80g/1/2 cup Oats, 50g/1.75oz Hazelnuts, chopped, 28g/1oz Raisins, 1 Apple Grated\t1036\n" +
                "1 Glass Grape Juice\t125\n" +
                "\n" +
                "Morning Snack: 379 Calories\n" +
                "\n" +
                "56g/2oz Mixed Nuts\t379\n" +
                "\n" +
                "Lunch: 1173 Calories\n" +
                "\n" +
                "Salad: Green Salad Leaves, 1/2 Avocado, Cherry Tomatoes, 85g/3oz Char Grilled Artichokes in Oil, 1 tbsp Olive Oil, Lemon Juice, 28g/1oz Pine Nuts, 28g/1oz Pumpkin Seeds\t791\n" +
                "56g/2oz Feta\t140\n" +
                "Buttered Wheat Roll\t242\n" +
                "\n" +
                "Afternoon Snack: 403 Calories\n" +
                "\n" +
                "1 can Sardines in Tomato Sauce\t195\n" +
                "2 slices Buttered Rye Bread\t208\n" +
                "\n" +
                "Dinner: 1388 Calories\n" +
                "\n" +
                "Bolognaise: 150g Beef Mince, 1 small Onion, 1/2 Can Tomatoes, 1 tbsp Olive Oil\t563\n" +
                "100g/3.5oz (dry weight) Whole Wheat Spaghetti\t350\n" +
                "20g/0.7oz Parmesan\t80\n" +
                "55g/2oz Green Salad, dressed wit 1 tbsp Olive Oil and Lemon Juice\t130\n" +
                "50g/1.75oz Dark Chocolate\t265\n" +
                "\n" +
                "Evening Snack: 514 Calories\n" +
                "\n" +
                "56g/2oz Granola\t277\n" +
                "125ml/1/2 cup Whole Milk\t73\n" +
                "28g/1oz Almonds\t164"));
        clubs.add(new GDiet.Club("Day 7 - High Protein Day - 5059 Calories","Breakfast: 1009 Calories\n" +
                "\n" +
                "4 Egg Omelet with 150g/5oz Smoked Salmon\t550\n" +
                "Whole Wheat English Muffin, Buttered\t277\n" +
                "1 glass of Prune Juice\t182\n" +
                "\n" +
                "Morning Snack: 524 Calories\n" +
                "\n" +
                "Protein Shake\t\n" +
                "2 scoops Whey Protein Powder\t236\n" +
                "100g/3.5oz Greek Yogurt, 1/2 Cup Whole Milk\t169\n" +
                "1 small Banana, 1 handful of Blueberries\t119\n" +
                "\n" +
                "Lunch: 1751 Calories\n" +
                "\n" +
                "150g/5oz (dry weight) Quinoa\t561\n" +
                "150g/5oz Roast Chicken\t285\n" +
                "Handful of Baby Spinach, 1 tbsp Olive Oil, Lemon Juice, 56g/2oz Walnuts\t505\n" +
                "150g/5oz Greek Yogurt, 60g/1/2 cup Raspberries, 1oz Flaked Almonds\t400\n" +
                "\n" +
                "Afternoon Snack: 270 Calories\n" +
                "\n" +
                "Cliff Protein Bar\t270\n" +
                "\n" +
                "Dinner: 1211 Calories\n" +
                "\n" +
                "170g/6oz Halibut Fillet, topped with 2 tbsp Pesto, 1 tbsp Olive Oil, baked in foil\t519\n" +
                "150g/5oz (dry weight) Brown Rice\t543\n" +
                "85g/3oz Peas, 85g/3oz Sweet Corn\t149\n" +
                "\n" +
                "Evening Snack: 294 Calories\n" +
                "\n" +
                "3 Oat Cakes (Oat Crackers)\t144\n" +
                "3 Slices of Ham\t120\n" +
                "28g/1oz Cottage Cheese\t30"));

    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
