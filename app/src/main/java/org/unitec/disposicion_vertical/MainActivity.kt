package org.unitec.disposicion_vertical

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //https://github.com/daton/aplicaciones-moviles/tree/master/wireframes
       // Toast.makeText(this "la primera",Toast.LENGTH_LONG).show();

        var vibrador = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrador.vibrate(890)




    }
}
