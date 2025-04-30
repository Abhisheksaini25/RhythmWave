package com.example.musicstream

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.musicstream.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {

    lateinit var binding:ActivityPlayerBinding
    lateinit var exoPlayer: ExoPlayer

    var playerListener = object : Player.Listener{
        override fun onIsPlayingChanged(isPlaying: Boolean) {
            super.onIsPlayingChanged(isPlaying)
            showGif(isPlaying)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MyExoplayer.getCurrentSong()?.apply {

            binding.songsTitleTextView.text = title
            binding.songsSubtitleTextView.text = subtitle
            Glide.with(binding.songCoverImageView).load(coverUrl)
                .circleCrop()
                .into(binding.songCoverImageView)

            Glide.with(binding.songGifImageView).load(R.drawable.media_playing)
                .circleCrop()
                .into(binding.songGifImageView)

            exoPlayer = MyExoplayer.getInstance()!!
            binding.playerView.player = exoPlayer
            exoPlayer.addListener(playerListener)
        }
    }

    fun showGif(show:Boolean){
        if(show)
            binding.songGifImageView.visibility = View.VISIBLE
        else
            binding.songGifImageView.visibility = View.INVISIBLE
    }
}