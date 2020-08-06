package com.allana.assigmentudacodingweek2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.allana.assigmentudacodingweek2.R
import com.allana.assigmentudacodingweek2.model.Books
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBookAdapter(val listBook: ArrayList<Books>) : RecyclerView.Adapter<ListBookAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvBookTitle: TextView = itemView.findViewById(R.id.tv_title)
        var tvBookAuthor: TextView = itemView.findViewById(R.id.tv_author)
        var imageBook: ImageView = itemView.findViewById(R.id.img_item_book)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_books, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBook.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBook[position]

        Glide.with(holder.itemView.context)
            .load(book.imageBook)
            .apply(RequestOptions().override(125, 175))
            .into(holder.imageBook)

        holder.tvBookTitle.text = book.bookTitle
        holder.tvBookAuthor.text = book.bookAuthor
    }
}