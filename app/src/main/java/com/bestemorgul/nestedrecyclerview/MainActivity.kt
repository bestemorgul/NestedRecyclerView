package com.bestemorgul.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.lang.System.console

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val parentList = ArrayList<Categories>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.categoriesRV)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        val adapter = CategoriesAdapter(parentList)
        recyclerView.adapter = adapter
    }

    private fun addDataToList() {

        val childItems1 = ArrayList<Movies>()
        childItems1.add(Movies("Inception", R.drawable.inception))
        childItems1.add(Movies("Avengers: End Game", R.drawable.avengers))
        childItems1.add(Movies("Thor: Ragnarok", R.drawable.thor))
        childItems1.add(Movies("Red Notice", R.drawable.rednotice))

        parentList.add(
            Categories("Action",
                R.drawable.action,
                childItems1))

        val childItem2 = ArrayList<Movies>()
        childItem2.add(Movies("Yes Day", R.drawable.yesday))
        childItem2.add(Movies("Hangover", R.drawable.hangover))
        childItem2.add(Movies("Free Guy", R.drawable.freeguy))
        childItem2.add(Movies("I Feel Pretty", R.drawable.pretty))
        parentList.add(
            Categories(
                "Comedy",
                R.drawable.comedy,
                childItem2
            )
        )
        val childItem3 = ArrayList<Movies>()
        childItem3.add(Movies("A Quiet Place", R.drawable.quietplace))
        childItem3.add(Movies("Fantasy Island", R.drawable.fantasyisland))
        childItem3.add(Movies("Nightbooks", R.drawable.nightbooks))
        childItem3.add(Movies("Incantation", R.drawable.incantation))
        parentList.add(
            Categories(
                "Horror",
                R.drawable.horror,
                childItem3
            )
        )
        val childItem4 = ArrayList<Movies>()
        childItem4.add(Movies("Divergent", R.drawable.divergent))
        childItem4.add(Movies("Dune", R.drawable.dune))
        childItem4.add(Movies("The Martian", R.drawable.martian))
        childItem4.add(Movies("Avatar", R.drawable.avatar))
        parentList.add(
            Categories(
                "Science Fiction",
                R.drawable.science,
                childItem4
            )
        )
        val childItem5 = ArrayList<Movies>()
        childItem5.add(Movies("Purple Hearts", R.drawable.purplehearts))
        childItem5.add(Movies("Redeeming Love", R.drawable.redeeming))
        childItem5.add(Movies("Through My Window", R.drawable.window))
        childItem5.add(Movies("365 Days: This Day", R.drawable.thisday))
        parentList.add(
            Categories(
                "Romance",
                R.drawable.romance,
                childItem5
            )
        )
    }

}