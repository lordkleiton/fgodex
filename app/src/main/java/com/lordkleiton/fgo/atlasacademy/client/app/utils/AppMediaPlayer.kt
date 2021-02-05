package com.lordkleiton.fgo.atlasacademy.client.app.utils

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.util.Log

object AppMediaPlayer {
    private var mediaPlayer: MediaPlayer? = null
    private var currentUrl: String? = null

    fun stopPlayer() {
        mediaPlayer?.apply {
            if (isPlaying) stop()

            release()
        }

        mediaPlayer = null
    }

    private fun setupPlayer() {
        stopPlayer()

        mediaPlayer = MediaPlayer()

        mediaPlayer?.apply {
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
        }
    }

    fun getProgress() = mediaPlayer?.currentPosition

    private fun playAudio(url: String) {
        mediaPlayer?.apply {
            setDataSource(url)

            prepareAsync()

            setOnPreparedListener {
                start()
            }

            setOnCompletionListener { Log.i("hmm", "cabou") }
        }
    }

    fun play(url: String) {
        setupPlayer()

        playAudio(url)
    }
}