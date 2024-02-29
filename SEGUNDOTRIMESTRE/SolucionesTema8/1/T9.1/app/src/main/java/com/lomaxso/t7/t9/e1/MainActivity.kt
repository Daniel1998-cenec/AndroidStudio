package com.lomaxso.t7.t9.e1

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
        val videoPath = "android.resource://${packageName}/${R.raw.videodron}"
        val videoUri = Uri.parse(videoPath)

        // Configura el VideoView para reproducir el video
        videoView.setVideoURI(videoUri)

        // Configura los controles de reproducción del video
        val mediaController = android.widget.MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        // Inicia la reproducción del video
        videoView.start()

        val buttonPlay = findViewById<Button>(R.id.button_play)
        buttonPlay.setOnClickListener {
            videoView.start()
        } // click

        val buttonPause = findViewById<Button>(R.id.button_pause)
        buttonPause.setOnClickListener {
            videoView.pause()
        } // click
        val buttonRewind = findViewById<Button>(R.id.button_rewind)
        buttonRewind.setOnClickListener {
            videoView.seekTo(videoView.currentPosition - 10000)
        } // click
        val buttonForward = findViewById<Button>(R.id.button_forward)
        buttonForward.setOnClickListener {
            videoView.seekTo(videoView.currentPosition + 10000)
        } // click
    } // fun
} // class