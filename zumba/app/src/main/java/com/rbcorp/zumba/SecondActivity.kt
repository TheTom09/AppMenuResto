package com.rbcorp.zumba

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        button2.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val offlineUri = Uri.parse("android.resource://$packageName/${R.raw.clip}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()

}
}