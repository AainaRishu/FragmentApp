package com.android.aaina.fragmentapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.home.*
import kotlinx.android.synthetic.main.home.view.*
import kotlinx.android.synthetic.main.starters.view.*

class StartersFrag : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.starters,
            container,false)

        v.orderstarter.setOnClickListener {
            Toast.makeText(activity, " Your Starters has been ordered...",
                Toast.LENGTH_LONG).show()
        }

        return v
    }

}