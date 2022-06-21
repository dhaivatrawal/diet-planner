package com.zedr.dhaivat.dietcharts_weightgainandloose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LDiet extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<LDiet.Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ldiet);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterLDiet adapter = new RecyclerViewAdapterLDiet(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterLDiet adapter = new RecyclerViewAdapterLDiet(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new LDiet.Club("Day 1:","After starting your day with cucumber water, have oats porridge and mixed nuts for breakfast.\n" +
                "Have a roti with dal and gajar matar sabzi for lunch.\n" +
                "Follow that up with dal and lauki sabzi to go with a roti for dinner.\n" +
                "\n" +
                "6:30 AM\tCucumber Detox Water(1 glass)\n" +
                "8:00 AM\tOats Porridge in Skimmed Milk(1 bowl) and Mixed Nuts(25 grams)\n" +
                "\n" +
                "12:00 PM Skimmed Milk Paneer(100 grams)\n" +
                "2:00 PM\t Mixed Vegetable Salad(1 katori)\n" +
                "2:10 PM\t Dal(1 katori)Gajar Matar Sabzi(1 katori) and Roti (1 roti/chapati)\n" +
                "\n" +
                "4:00 PM\tCut Fruits(1 cup)Buttermilk(1 glass)\n" +
                "5:30 PM\tTea with Less Sugar and Milk(1 teacup)\n" +
                "8:50 PM\tMixed Vegetable Salad(1 katori)\n" +
                "9:00 PM\tDal(1 katori)Lauki Sabzi(1 katori) and Roti (1 roti/chapati)\n"));
        clubs.add(new LDiet.Club("Day 2:","\n" +
                "On the second day, eat a mixed vegetable stuffed roti with curd for breakfast.\n" +
                "For lunch, have half a katori of methi rice along with lentil curry.\n" +
                "End your day with sauteed vegetables and green chutney.\n" +
                "\n" +
                "6:30 AM\t Cucumber Detox Water(1 glass)\n" +
                "8:00 AM\t Curd(1.5 katori)Mixed Vegetable Stuffed Roti(2 piece)\n" +
                "12:00 PM Skimmed Milk Paneer(100 grams)\n" +
                "2:00 PM\tMixed Vegetable Salad(1 katori)\n" +
                "2:10 PM\tLentil Curry(0.75 bowl)Methi Rice(0.5 katori)\n" +
                "4:00 PM\tApple(0.5 small (2-3/4″ dia))Buttermilk(1 glass)\n" +
                "5:30 PM\tCoffee with Milk and Less Sugar(0.5 tea cup)\n" +
                "8:50 PM\tMixed Vegetable Salad(1 katori)\n" +
                "9:00 PM\tSauteed Vegetables with Paneer(1 katori)Roti (1 roti/chapati) and Green Chutney(2 tablespoon)\n"));
        clubs.add(new LDiet.Club("Day 3:","Breakfast on day 3 would include Multigrain Toast and Skim Milk Yogurt.\n" +
                "In the afternoon, have sauteed vegetables with paneer and some green chutney.\n" +
                "Half a katori of methi rice and some lentil curry to make sure you end the day on a healthy note.\n" +
                "\n" +
                "6:30 AM\t Cucumber Detox Water(1 glass)\n" +
                "8:00 AM\t Skim Milk Yoghurt(1 cup (8 fl oz))Multigrain Toast(2 toast)\n" +
                "12:00 PM Skimmed Milk Paneer(100 grams)\n" +
                "2:00 PM\t Mixed Vegetable Salad(1 katori)\n" +
                "2:10 PM\t Sauteed Vegetables with Paneer(1 katori)Roti (1 roti/chapati) and Green Chutney(2 tablespoon)\n" +
                "\n" +
                "4:00 PM\tBanana(0.5 small (6″ to 6-7/8″ long))Buttermilk(1 glass)\n" +
                "5:30 PM\tTea with Less Sugar and Milk(1 teacup)\n" +
                "8:50 PM\tMixed Vegetable Salad(1 katori)\n" +
                "9:00 PM\tLentil Curry(0.75 bowl)Methi Rice(0.5 katori)"));
        clubs.add(new LDiet.Club("Day 4:","Start Day 4 with a Fruit and Nuts Yogurt Smoothie and Egg Omelette\n" +
                "Follow that up with Moong Dal, Bhindi Sabzi, and roti.\n" +
                "Complete the day’s food intake with steamed rice and palak chole.\n" +
                "\n" +
                "6:30 AM\tCucumber Detox Water(1 glass)\n" +
                "8:00 AM\tFruit and Nuts Yogurt Smoothie(0.75 glass) and Egg Omelette(1 serve(one egg))\n" +
                "\n" +
                "12:00 PM Skimmed Milk Paneer(100 grams)\n" +
                "2:00 PM\t Mixed Vegetable Salad(1 katori)\n" +
                "2:10 PM\t Green Gram Whole Dal Cooked(1 katori)Bhindi sabzi(1 katori) and Roti (1 roti/chapati)\n" +
                "\n" +
                "4:00 PM\tOrange(1 fruit (2-5/8″ dia))Buttermilk(1 glass)\n" +
                "5:30 PM\tCoffee with Milk and Less Sugar(0.5 tea cup)\n" +
                "8:50 PM\tMixed Vegetable Salad(1 katori)\n" +
                "9:00 PM\tPalak Chole(1 bowl)Steamed Rice(0.5 katori)"));
        clubs.add(new LDiet.Club("Day 5:","Have a glass of skimmed milk and peas poha for breakfast on the fifth day.\n" +
                "Eat a missi roti with low fat paneer curry in the afternoon.\n" +
                "End the day with roti, curd and aloo baingan tamatar ki sabzi.\n" +
                "\n" +
                "6:30 AM\t Cucumber Detox Water(1 glass)\n" +
                "8:00 AM\t Skimmed Milk(1 glass)Peas Poha(1.5 katori)\n" +
                "12:00 PM Skimmed Milk Paneer(100 grams)\n" +
                "2:00 PM\t Mixed Vegetable Salad(1 katori)\n" +
                "2:10 PM\t Low Fat Paneer Curry(1.5 katori)Missi Roti(1 roti)\n" +
                "4:00 PM\t Papaya(1 cup 1″ pieces)Buttermilk(1 glass)\n" +
                "5:30 PM\t Tea with Less Sugar and Milk(1 teacup)\n" +
                "8:50 PM\t Mixed Vegetable Salad(1 katori)\n" +
                "9:00 PM\t Curd(1.5 katori)Aloo Baingan Tamatar Ki Sabzi(1 katori) and Roti (1 roti/chapati)"));
        clubs.add(new LDiet.Club("Day 6:","On Day 6, have idli with sambar for breakfast\n" +
                "For lunch, roti with curd and aloo baingan tamatar ki sabzi\n" +
                "To end Day 6, eat green gram with roti and bhindi sabzi\n" +
                "\n" +
                "6:30 AM\t Cucumber Detox Water(1 glass)\n" +
                "8:00 AM\t Mixed Sambar(1 bowl)Idli(2 idli)\n" +
                "12:00 PM Skimmed Milk Paneer(100 grams)\n" +
                "2:00 PM\t Mixed Vegetable Salad(1 katori)\n" +
                "2:10 PM\t Curd(1.5 katori)Aloo Baingan Tamatar Ki Sabzi(1 katori) and Roti (1 roti/chapati)\n" +
                "\n" +
                "4:00 PM\tCut Fruits(1 cup)Buttermilk(1 glass)\n" +
                "5:30 PM\tCoffee with Milk and Less Sugar(0.5 tea cup)\n" +
                "8:50 PM\tMixed Vegetable Salad(1 katori)\n" +
                "9:00 PM\tGreen Gram Whole Dal Cooked(1 katori)Bhindi sabzi(1 katori) and Roti (1 roti/chapati)"));
        clubs.add(new LDiet.Club("Day 7:","On the seventh day, start with besan chilla and green garlic chutney.\n" +
                "Have steamed rice and palak chole for lunch.\n" +
                "End the week on a healthy note with low fat paneer curry and missi roti.\n" +
                "\n" +
                "6:30 AM\t Cucumber Detox Water(1 glass)\n" +
                "8:00 AM\t Besan Chilla(2 cheela)Green Garlic Chutney(3 tablespoon)\n" +
                "12:00 PM Skimmed Milk Paneer(100 grams)\n" +
                "2:00 PM\t Mixed Vegetable Salad(1 katori)\n" +
                "2:10 PM\t Palak Chole(1 bowl)Steamed Rice(0.5 katori)\n" +
                "4:00 PM\t Apple(0.5 small (2-3/4″ dia))Buttermilk(1 glass)\n" +
                "5:30 PM\t Tea with Less Sugar and Milk(1 teacup)\n" +
                "8:50 PM\t Mixed Vegetable Salad(1 katori)\n" +
                "9:00 PM\t Low Fat Paneer Curry(1 katori)Missi Roti(1 roti)\n"));


    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
