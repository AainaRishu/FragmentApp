package com.android.aaina.fragmentapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.home.*
import kotlinx.android.synthetic.main.home.view.*
import kotlinx.android.synthetic.main.pizza.view.*

class PizzaFrag : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.pizza,
            container,false)

        v.orderpizza.setOnClickListener {
            Toast.makeText(activity, " Your Pizza has been ordered...",
                Toast.LENGTH_LONG).show()
        }

        return v
    }

}