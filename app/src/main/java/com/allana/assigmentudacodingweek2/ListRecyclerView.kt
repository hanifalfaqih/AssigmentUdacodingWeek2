package com.allana.assigmentudacodingweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.allana.assigmentudacodingweek2.adapter.ListBookAdapter
import com.allana.assigmentudacodingweek2.data.BooksData
import com.allana.assigmentudacodingweek2.model.Books

class ListRecyclerView : AppCompatActivity() {

    private lateinit var rvBooks: RecyclerView
    private var list: ArrayList<Books> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_recycler_view)

        rvBooks = findViewById(R.id.rv_books)
        rvBooks.setHasFixedSize(true)

        list.addAll(BooksData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvBooks.layoutManager = LinearLayoutManager(this)
        val listBookAdapter = ListBookAdapter(list)
        rvBooks.adapter = listBookAdapter
    }
}