package com.android.aaina.fragmentapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fManager = supportFragmentManager
        var tx = fManager.beginTransaction()// gets the FragmentTransaction class object
        tx.add(R.id.frame1,HomeFrag())// add the fragment
        tx.commit()

        home.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,HomeFrag())
            tx.addToBackStack("true")
            tx.commit()
        }

        veg.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,VegFrag())
            tx.addToBackStack("true")
            tx.commit()
        }

        nonveg.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,NonVegFrag())
            tx.addToBackStack("true")
            tx.commit()
        }

        starters.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,StartersFrag())
            tx.addToBackStack("true")
            tx.commit()
        }

        pizza.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,PizzaFrag())
            tx.addToBackStack("true")
            tx.commit()
        }
        desserts.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,DessertsFrag())
            tx.addToBackStack("true")
            tx.commit()
        }

        beverages.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,BeveragesFrag())
            tx.addToBackStack("true")
            tx.commit()
        }

        offers.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,OffersFrag())
            tx.addToBackStack("true")
            tx.commit()
        }

        contactus.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,ContactUsFrag())
            tx.addToBackStack("true")
            tx.commit()
        }

    }


}
