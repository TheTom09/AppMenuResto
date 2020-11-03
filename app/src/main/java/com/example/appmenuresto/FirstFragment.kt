package com.example.appmenuresto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmenuresto.data.FoodItem
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

 //       view.findViewById<Button>(R.id.add_to_cart).setOnClickListener {
 //           findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
 //       }

        val foodItems = listOf(
            FoodItem( "Salade caesar et petits légumes", 8.99, "Delicious"),
            FoodItem( "Tartare de Saumon", 9.99, "Delicious"),
            FoodItem( "Carpaccio de boeuf", 9.99, "Delicious"),
            FoodItem( "Foie gras maison", 11.99, "Delicious"),
            FoodItem( "Makis saumon,concombre,avocats", 6.99, "Delicious"),
            FoodItem( "Tomates à la mozzarella", 6.99, "Delicious")
        )
        restaurantsRecyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = RestaurantsAdapter(foodItems)
        }

    }
}