package com.lomaxso.t9.e2

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.video_view)

        // Especifica la ruta del video
        val videoPath = "android.resource://${packageName}/${R.raw.vddron}"
        val videoUri = Uri.parse(videoPath)

        // Configura el VideoView para reproducir el video
        videoView.setVideoURI(videoUri)

        // Configura los controles de reproducción del video
        val mediaController = android.widget.MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        val btn1 = findViewById<Button>(R.id.btn_v1)
        btn1.setOnClickListener {
            val videoPath = "android.resource://${packageName}/${R.raw.vddron}"
            val videoUri = Uri.parse(videoPath)
            // Configura el VideoView para reproducir el video
            videoView.setVideoURI(videoUri)
            videoView.seekTo(0)
            videoView.start()
        } // click

        val btn2 = findViewById<Button>(R.id.btn_v2)
        btn2.setOnClickListener {
            val videoPath = "android.resource://${packageName}/${R.raw.vdpelea}"
            val videoUri = Uri.parse(videoPath)

            // Configura el VideoView para reproducir el video
            videoView.setVideoURI(videoUri)
            videoView.start()
        } // click

        val btn3 = findViewById<Button>(R.id.btn_v3)
        btn3.setOnClickListener {
            val videoPath = "android.resource://${packageName}/${R.raw.vdmusic}"
            val videoUri = Uri.parse(videoPath)

            // Configura el VideoView para reproducir el video
            videoView.setVideoURI(videoUri)
            videoView.start()
        } // click


    } // fun
} // class