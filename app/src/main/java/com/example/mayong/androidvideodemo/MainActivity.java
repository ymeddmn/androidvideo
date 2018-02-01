package com.example.mayong.androidvideodemo;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.VideoView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private String path = "http://112.253.22.157/17/z/z/y/u/zzyuasjwufnqerzvyxgkuigrkcatxr/hc.yinyuetai.com/D046015255134077DDB3ACA0D7E68D45.flv";
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(!videoView.isPlaying()){

            videoView.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(videoView.isPlaying()){

            videoView.pause();
        }
    }


    private void initView() {
        videoView = findViewById(R.id.surface);
    }

    private void init() throws IOException {
       videoView.setVideoURI(Uri.parse(path));
       videoView.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(videoView.isPlaying()){
            videoView.pause();
        }
        videoView.stopPlayback();
    }
}