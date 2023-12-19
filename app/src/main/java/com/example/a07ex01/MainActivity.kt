package com.example.a07ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showSnack(view: View) {
        var rotulo = findViewById<TextView>(R.id.textView)
        var s = Snackbar.make(view, rotulo.text, Snackbar.LENGTH_INDEFINITE)
        s.setAction("Fechar", {s.dismiss()})
        s.show()
    }
}