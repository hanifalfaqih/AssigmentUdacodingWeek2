package com.allana.assigmentudacodingweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnToCalculator: Button
    private lateinit var btnToListRecyclerView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToCalculator = findViewById(R.id.btn_calculator)
        btnToCalculator.setOnClickListener(this)

        btnToListRecyclerView = findViewById(R.id.btn_list_recyclerview)
        btnToListRecyclerView.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_calculator -> {
                val goToCalculator = Intent(this@MainActivity, Calculator::class.java)
                startActivity(goToCalculator)
            }

            R.id.btn_list_recyclerview -> {
                val goToListRecyclerView = Intent(this@MainActivity, ListRecyclerView::class.java)
                startActivity(goToListRecyclerView)
            }
        }
    }
}