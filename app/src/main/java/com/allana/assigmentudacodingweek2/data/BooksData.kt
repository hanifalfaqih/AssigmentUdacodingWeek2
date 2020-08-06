package com.allana.assigmentudacodingweek2.data

import com.allana.assigmentudacodingweek2.R
import com.allana.assigmentudacodingweek2.model.Books

object BooksData {

    private val bookTitle = arrayOf(
        "Sebuah Seni untuk Bersikap Bodo Amat",
        "Good Is Not Enough",
        "Mindset",
        "Atomic Habits: Perubahan Kecil yang Memberikan Hasil Luar Biasa",
        "Self Theories",
        "How to Win Friends And Influence People In The Digital Age (Edisi Revisi)",
        "Rich Dad Poor Dad (Edisi Revisi)",
        "OUTLIERS: Rahasia di Balik Kesukses - Cover Baru",
        "5 Second Rule",
        "Disruption "
    )

    private val bookAuthor = arrayOf(
        "Mark Manson",
        "Frans Goldena",
        "Carol S. Dweck, Ph.d.",
        "James Clear",
        "Carol S. Dweck, Ph.d.",
        "Dale Carnegie & Associates",
        "Robert T. Kiyosaki",
        "Malcolm Gladwell",
        "Mel Robbins",
        "Rhenald Kasali"
    )

    private val imageBook = intArrayOf(
        R.drawable.sebuah_seni_untuk_bersikap_bodo_amat,
        R.drawable.good_is_enough,
        R.drawable.mindset,
        R.drawable.atomic_habits,
        R.drawable.self_theories,
        R.drawable.how_to_win_friends_and_influence_people_in_the_digital_age,
        R.drawable.rich_dad_poor_dad,
        R.drawable.outliers,
        R.drawable.five_second,
        R.drawable.disruption
    )

    val listData: ArrayList<Books>
    get() {
        val list = arrayListOf<Books>()
        for (position in bookTitle.indices){
            val book = Books()
            book.bookTitle = bookTitle[position]
            book.bookAuthor = bookAuthor[position]
            book.imageBook = imageBook[position]
            list.add(book)
        }
        return list
    }
}