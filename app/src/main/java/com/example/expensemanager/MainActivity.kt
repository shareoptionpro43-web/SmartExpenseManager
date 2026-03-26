package com.example.expensemanager

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val amount = findViewById<EditText>(R.id.etAmount)
        val category = findViewById<EditText>(R.id.etCategory)
        val date = findViewById<EditText>(R.id.etDate)
        val notes = findViewById<EditText>(R.id.etNotes)
        val saveBtn = findViewById<Button>(R.id.btnSave)

        saveBtn.setOnClickListener {

            val amt = amount.text.toString()
            val cat = category.text.toString()
            val dt = date.text.toString()
            val note = notes.text.toString()

            if (amt.isEmpty() || cat.isEmpty()) {
                Toast.makeText(this, "Please enter required fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Expense Saved!", Toast.LENGTH_SHORT).show()

                amount.text.clear()
                category.text.clear()
                date.text.clear()
                notes.text.clear()
            }
        }
    }
}
