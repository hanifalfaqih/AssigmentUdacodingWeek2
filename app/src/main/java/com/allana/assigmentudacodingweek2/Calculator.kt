package com.allana.assigmentudacodingweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculator : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtValue1: EditText
    private lateinit var edtValue2: EditText
    private lateinit var btnPenjumlahan: Button
    private lateinit var btnPengurangan: Button
    private lateinit var btnPerkalian: Button
    private lateinit var btnPembagian: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        edtValue1 = findViewById(R.id.edt_value1)
        edtValue2 = findViewById(R.id.edt_value2)

        btnPenjumlahan = findViewById(R.id.btn_addition)
        btnPenjumlahan.setOnClickListener(this)

        btnPengurangan = findViewById(R.id.btn_substraction)
        btnPengurangan.setOnClickListener(this)

        btnPerkalian = findViewById(R.id.btn_multiplication)
        btnPerkalian.setOnClickListener(this)

        btnPembagian = findViewById(R.id.btn_division)
        btnPembagian.setOnClickListener(this)

        tvResult = findViewById(R.id.tv_result)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_addition -> {
                val inputValue1 = edtValue1.text.toString().trim()
                val inputValue2 = edtValue2.text.toString().trim()

                var isEmptyField = false
                var isInvalidDouble = false

                if (inputValue1.isEmpty()){
                    isEmptyField = true
                    edtValue1.error = "Field nilai tidak boleh kosong"
                }

                if (inputValue2.isEmpty()){
                    isEmptyField = true
                    edtValue2.error = "Field nilai tidak boleh kosong"
                }

                val value1 = toDouble(inputValue1)
                val value2 = toDouble(inputValue2)

                if (value1 == null){
                    isInvalidDouble = true
                    edtValue1.error = "Field ini harus berupa angka yang valid"
                }

                if (value2 == null){
                    isInvalidDouble = true
                    edtValue2.error = "Field ini harus berupa angka yang valid"
                }

                if (!isEmptyField && !isInvalidDouble){
                    val calculate = value1 as Double + value2 as Double
                    tvResult.text = calculate.toString()
                }
            }

            R.id.btn_substraction -> {
                val inputValue1 = edtValue1.text.toString().trim()
                val inputValue2 = edtValue2.text.toString().trim()

                var isEmptyField = false
                var isInvalidDouble = false

                if (inputValue1.isEmpty()){
                    isEmptyField = true
                    edtValue1.error = "Field nilai tidak boleh kosong"
                }

                if (inputValue2.isEmpty()){
                    isEmptyField = true
                    edtValue2.error = "Field nilai tidak boleh kosong"
                }

                val value1 = toDouble(inputValue1)
                val value2 = toDouble(inputValue2)

                if (value1 == null){
                    isInvalidDouble = true
                    edtValue1.error = "Field ini harus berupa angka yang valid"
                }

                if (value2 == null){
                    isInvalidDouble = true
                    edtValue2.error = "Field ini harus berupa angka yang valid"
                }

                if (!isEmptyField && !isInvalidDouble){
                    val calculate = value1 as Double - value2 as Double
                    tvResult.text = calculate.toString()
                }
            }

            R.id.btn_multiplication -> {
                val inputValue1 = edtValue1.text.toString().trim()
                val inputValue2 = edtValue2.text.toString().trim()

                var isEmptyField = false
                var isInvalidDouble = false

                if (inputValue1.isEmpty()){
                    isEmptyField = true
                    edtValue1.error = "Field nilai tidak boleh kosong"
                }

                if (inputValue2.isEmpty()){
                    isEmptyField = true
                    edtValue2.error = "Field nilai tidak boleh kosong"
                }

                val value1 = toDouble(inputValue1)
                val value2 = toDouble(inputValue2)

                if (value1 == null){
                    isInvalidDouble = true
                    edtValue1.error = "Field ini harus berupa angka yang valid"
                }

                if (value2 == null){
                    isInvalidDouble = true
                    edtValue2.error = "Field ini harus berupa angka yang valid"
                }

                if (!isEmptyField && !isInvalidDouble){
                    val calculate = value1 as Double * value2 as Double
                    tvResult.text = calculate.toString()
                }
            }

            R.id.btn_division -> {
                val inputValue1 = edtValue1.text.toString().trim()
                val inputValue2 = edtValue2.text.toString().trim()

                var isEmptyField = false
                var isInvalidDouble = false

                if (inputValue1.isEmpty()){
                    isEmptyField = true
                    edtValue1.error = "Field nilai tidak boleh kosong"
                }

                if (inputValue2.isEmpty()){
                    isEmptyField = true
                    edtValue2.error = "Field nilai tidak boleh kosong"
                }

                val value1 = toDouble(inputValue1)
                val value2 = toDouble(inputValue2)

                if (value1 == null){
                    isInvalidDouble = true
                    edtValue1.error = "Field ini harus berupa angka yang valid"
                }

                if (value2 == null){
                    isInvalidDouble = true
                    edtValue2.error = "Field ini harus berupa angka yang valid"
                }

                if (!isEmptyField && !isInvalidDouble){
                    val calculate = value1 as Double / value2 as Double
                    tvResult.text = calculate.toString()
                }
            }
        }
    }

    private fun toDouble(str: String): Double?{
        return try {
            str.toDouble()
        } catch (e: NumberFormatException){
            null
        }
    }
}