package com.star.tmnt

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tmnt.*

class TmntActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tmnt)

        characterlist.setOnItemClickListener { _, _, index, _ ->

            val id = when (index) {
                0 -> R.drawable.tmntleo
                1 -> R.drawable.tmntmike
                2 -> R.drawable.tmntdon
                else -> R.drawable.tmntraph
            }

            turtle.setImageResource(id)
        }
    }

    fun radioButtonClick(view: View) {

        val id = when (view) {
            leo -> R.drawable.tmntleo
            mike -> R.drawable.tmntmike
            don -> R.drawable.tmntdon
            else -> R.drawable.tmntraph
        }

        turtle.setImageResource(id)
    }
}
