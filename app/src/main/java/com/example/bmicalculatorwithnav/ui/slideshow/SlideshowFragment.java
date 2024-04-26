package com.example.bmicalculatorwithnav.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bmicalculatorwithnav.R;
import com.example.bmicalculatorwithnav.Recipe;
import com.example.bmicalculatorwithnav.databinding.FragmentSlideshowBinding;

import java.util.ArrayList;
import java.util.List;

public class SlideshowFragment extends Fragment { private List<Recipe> recipes = new ArrayList<>();
    private TextView recipeTitleTextView;
    private TextView recipeDescriptionTextView;
    private ImageView recipeImageView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        // Inicjalizacja widoków przepisów
        TextView recipeTitle1 = root.findViewById(R.id.recipe_title_1);
        TextView recipeDescription1 = root.findViewById(R.id.recipe_description_1);
        ImageView recipeImage1 = root.findViewById(R.id.recipe_image_1);
        TextView recipeTitle2 = root.findViewById(R.id.recipe_title_2);
        TextView recipeDescription2 = root.findViewById(R.id.recipe_description_2);
        ImageView recipeImage2 = root.findViewById(R.id.recipe_image_2);

        recipeTitle1.setText("Delicious Pasta");
        recipeDescription1.setText("Ingredients:\n" +
                "\n" +
                "    300g spaghetti pasta\n" +
                "    400g ground beef\n" +
                "    1 onion, chopped\n" +
                "    2 cloves garlic, minced\n" +
                "    1 carrot, diced\n" +
                "    1 jar (400g) tomato passata\n" +
                "    2 tablespoons tomato paste\n" +
                "    1 teaspoon dried oregano\n" +
                "    1 teaspoon dried basil\n" +
                "    Salt and pepper to taste\n" +
                "    Olive oil\n" +
                "    Freshly grated parmesan cheese for serving\n" +
                "\n" +
                "Instructions:\n" +
                "\n" +
                "    Cooking the pasta:\n" +
                "        In a large pot, bring salted water to a boil.\n" +
                "        Add the spaghetti pasta and cook according to the package instructions until al dente.\n" +
                "        Drain the pasta, reserving some of the cooking water.\n" +
                "\n" +
                "    Making the bolognese sauce:\n" +
                "        In a large saucepan, heat a drizzle of olive oil over medium heat.\n" +
                "        Add the chopped onion and sauté until soft and translucent, about 5 minutes.\n" +
                "        Add the minced garlic and sauté for another minute.\n" +
                "        Add the ground beef and cook, breaking it up with a spoon, until browned.\n" +
                "        Add the diced carrot and cook for a few minutes until softened.\n" +
                "        Pour in the tomato passata and tomato paste, add the dried herbs, salt, and pepper to taste.\n" +
                "        Bring the sauce to a simmer, reduce the heat, and let it simmer gently for about 15-20 minutes until thickened and flavors meld.\n" +
                "        If the sauce becomes too thick, add some of the reserved pasta cooking water.\n" +
                "\n" +
                "    Serving:\n" +
                "        Plate servings of spaghetti on plates.\n" +
                "        Ladle the hot bolognese sauce over the top.\n" +
                "        Sprinkle with freshly grated parmesan cheese.\n" +
                "        Serve immediately and enjoy the delicious taste of spaghetti bolognese!\n" +
                "\n");
        recipeImage1.setImageResource(R.drawable.spaghetti_image);
        // Ustawienie danych dla drugiego przepisu
        recipeTitle2.setText("Tasty Pizza");
        recipeDescription2.setText("Ingredients:\n" +
                "\n" +
                "    Pizza dough (store-bought or homemade)\n" +
                "    Tomato sauce\n" +
                "    Mozzarella cheese, shredded\n" +
                "    Toppings of your choice (e.g., pepperoni, mushrooms, bell peppers, onions, olives, etc.)\n" +
                "    Fresh basil leaves\n" +
                "    Olive oil\n" +
                "    Salt and pepper to taste\n" +
                "\n" +
                "Instructions:\n" +
                "\n" +
                "    Preparing the pizza dough:\n" +
                "        If using store-bought dough, follow the package instructions for proofing and shaping.\n" +
                "        If making homemade dough, follow your favorite pizza dough recipe and allow it to rise until doubled in size.\n" +
                "\n" +
                "    Preparing the toppings:\n" +
                "        Preheat your oven to the highest temperature setting (usually around 475-500°F or 245-260°C).\n" +
                "        Prepare your desired toppings by slicing or chopping them as needed.\n" +
                "\n" +
                "    Assembling the pizza:\n" +
                "        Roll out the pizza dough on a floured surface to your desired thickness.\n" +
                "        Transfer the rolled-out dough to a pizza stone or baking sheet lined with parchment paper.\n" +
                "        Spread a layer of tomato sauce evenly over the dough, leaving a small border around the edges.\n" +
                "        Sprinkle shredded mozzarella cheese over the sauce.\n" +
                "        Add your favorite toppings on top of the cheese layer.\n" +
                "        Drizzle a little olive oil over the toppings and season with salt and pepper to taste.\n" +
                "\n" +
                "    Baking the pizza:\n" +
                "        Carefully transfer the assembled pizza to the preheated oven.\n" +
                "        Bake for about 10-15 minutes, or until the crust is golden brown and the cheese is bubbly and melted.\n" +
                "        Keep an eye on the pizza towards the end of the baking time to prevent burning.\n" +
                "\n" +
                "    Serving:\n" +
                "        Once the pizza is done baking, remove it from the oven and let it cool slightly.\n" +
                "        Garnish with fresh basil leaves for extra flavor and freshness.\n" +
                "        Slice the pizza into wedges and serve hot.");
        recipeImage2.setImageResource(R.drawable.pizza_image);
        return  root;
    }

    private void displayRecipe(Recipe recipe) {
        recipeTitleTextView.setText(recipe.getTitle());
        recipeDescriptionTextView.setText(recipe.getDescription());
        recipeImageView.setImageResource(recipe.getImageResourceId());
    }
}