package com.example.superbutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    MediaPlayer player, player1, player2, player3, player4, player5, player6, player7, player8, player9, player10, player11, player12, player13, player14, player15, player16, player17;
    AudioManager audioManager;
    static int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        player = MediaPlayer.create(this, R.raw.yamadan);
        player1 = MediaPlayer.create(this, R.raw.sound1);
        player2 = MediaPlayer.create(this, R.raw.sound2);
        player3 = MediaPlayer.create(this, R.raw.sound3);
        player4 = MediaPlayer.create(this, R.raw.sound4);
        player5 = MediaPlayer.create(this, R.raw.sound5);
        player6 = MediaPlayer.create(this, R.raw.sound6);
        player7 = MediaPlayer.create(this, R.raw.sound7);
        player8 = MediaPlayer.create(this, R.raw.sound8);
        player9 = MediaPlayer.create(this, R.raw.sound9);
        player10 = MediaPlayer.create(this, R.raw.sound10);
        player11 = MediaPlayer.create(this, R.raw.sound11);
        player12 = MediaPlayer.create(this, R.raw.sound12);
        player13 = MediaPlayer.create(this, R.raw.sound13);
        player14 = MediaPlayer.create(this, R.raw.sound14);
        player15 = MediaPlayer.create(this, R.raw.sound15);
        player16 = MediaPlayer.create(this, R.raw.sound16);
        player17 = MediaPlayer.create(this, R.raw.sound17);
        audioManager = (AudioManager) getApplicationContext().getSystemService(AUDIO_SERVICE);
        count = 0;
    }

    @Override
    public void onClick(View v) {
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        animation.setDuration(150);
        button.startAnimation(animation);
        if (count == 5){
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
            player10.start();
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
        } else {
            switch (randomizer()) {
                case 0:
                    player10.start();
                    break;
                case 1:
                    player.start();
                    break;
                case 2:
                    player1.start();
                    break;
                case 3:
                    player2.start();
                    break;
                case 4:
                    player3.start();
                    break;
                case 5:
                    player4.start();
                    break;
                case 6:
                    player5.start();
                    break;
                case 7:
                    player6.start();
                    break;
                case 8:
                    player7.start();
                    break;
                case 9:
                    dialogLaunch();
                    break;
                case 10:
                    player9.start();
                    break;
                case 11:
                    player17.start();
                    break;
                case 12:
                    player8.start();
                    break;
                case 13:
                    player11.start();
                    break;
                case 14:
                    player12.start();
                    break;
                case 15:
                    player13.start();
                    break;
                case 16:
                    player14.start();
                    break;
                case 17:
                    player15.start();
                    break;
                case 18:
                    player16.start();
                    break;
            }
        }
        count++;
    }

    public void dialogLaunch(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Скачивание 15.0GB гейского порно");
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_progress, null);
        builder.setView(view);
        ProgressBar progressBar = view.findViewById(R.id.progressBar);

        Handler handler = new Handler();
        final int[] count = {0};
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (progressBar.getProgress() < 100){
                    progressBar.setProgress(count[0]);
                    count[0]++;
                    handler.postDelayed(this, 70);
                } else {
                    Toast.makeText(getApplicationContext(), "Гейское порно скачано", Toast.LENGTH_SHORT).show();

                }
            }
        }, 10);
        builder.setPositiveButton("Фоновая загрузка", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                if (progressBar.getProgress() < 100){
                    Toast.makeText(getApplicationContext(), "Фоновая загрузка гейского порно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        builder.create().show();

    }

    public int randomizer(){
        int i = (int)(Math.random()*19);
        return i;
    }
}