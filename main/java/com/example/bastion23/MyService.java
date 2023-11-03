package com.example.bastion23;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import android.util.Log;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.sound);
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while (true){
                            mp3.start();
                            try{
                                Thread.sleep(2000);
                            }
                            catch (InterruptedException e){

                            }
                        }
                    }
                }
        ).start();
        final String CHANNEL_ID = "FG_service";
        NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_ID, NotificationManager.IMPORTANCE_LOW);
        getSystemService(NotificationManager.class).createNotificationChannel(channel);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("Music played")
                .setContentText("you just played the music !");
        startForeground(1001, builder.build());
        return super.onStartCommand(intent, flags, startId);
    }
}
