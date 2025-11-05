package ru.yandex.practicum.sprint8koh35

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("MainActivity","onCreate $this")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>(R.id.button).apply {
            setOnClickListener {
                val intent = Intent(this@MainActivity, MainActivity::class.java)
                this@MainActivity.startActivity(intent)
            }
        }

        onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                TODO("Not yet implemented")
            }

        } )
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart $this")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume $this")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause $this")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","onRestart $this")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop $this")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestroy $this")
    }
}