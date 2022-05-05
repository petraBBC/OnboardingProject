package com.example.onboardingproject

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView

class PickSports : AppCompatActivity() {
    private var cardClicked: Boolean = false

    override fun onCreateView(
        parent: View?,
        name: String,
        context: Context,
        attrs: AttributeSet
    ): View? {
        return super.onCreateView(parent, name, context, attrs)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_sports)
        supportActionBar?.hide()

        val footballCard:CardView = findViewById(R.id.football)
        val formula1Card:CardView = findViewById(R.id.formula1)
        val golfCard:CardView = findViewById(R.id.golf)
        val rugbyLeagueCard:CardView = findViewById(R.id.rugbyLeague)
        val tennisCard:CardView = findViewById(R.id.tennis)
        val rugbyUnionCard:CardView = findViewById(R.id.rugbyUnion)
        val cricketCard:CardView = findViewById(R.id.cricket)
        val boxingCard:CardView = findViewById(R.id.boxing)
        val athleticsCard:CardView = findViewById(R.id.athletics)
        val nextButton = findViewById<Button>(R.id.nextButton)

        footballCard.setOnClickListener(){
          setCardColour(R.id.football_layout)
        }
        formula1Card.setOnClickListener(){
            setCardColour(R.id.formula1_layout)
        }
        golfCard.setOnClickListener(){
            setCardColour(R.id.golf_layout)
        }
        rugbyLeagueCard.setOnClickListener(){
            setCardColour(R.id.rugbyLeague_layout)
        }
        tennisCard.setOnClickListener(){
            setCardColour(R.id.tennis_layout)
        }
        rugbyUnionCard.setOnClickListener(){
            setCardColour(R.id.rugbyUnion_layout)
        }
        cricketCard.setOnClickListener(){
            setCardColour(R.id.cricket_layout)
        }
        boxingCard.setOnClickListener(){
            setCardColour(R.id.boxing_layout)
        }
        athleticsCard.setOnClickListener(){
            setCardColour(R.id.athletics_layout)
        }

        nextButton.setOnClickListener(){
            val intent  = Intent(this, DisplayArticles::class.java)
            startActivity(intent)
        }
    }

    @SuppressLint("ResourceType")
    private fun setCardColour(sport:Int){
        val backgroundCard:RelativeLayout = findViewById(sport)
        if(cardClicked){
            backgroundCard.setBackgroundColor(resources.getInteger(R.color.card_grey))
            cardClicked = false
        }
        else if(!cardClicked) {
            backgroundCard.setBackgroundColor(resources.getInteger(R.color.blue))
            cardClicked = true
        }
    }
    // Refactor change from a shared cardclicked to each cardview has a clicked
}
