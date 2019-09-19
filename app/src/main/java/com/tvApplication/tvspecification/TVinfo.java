package com.tvApplication.tvspecification;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import static android.os.Build.VERSION.SDK_INT;

public class TVinfo extends AppCompatActivity {
    public TextView privacy_policy, version_release, version_incremental, version_sdk_number, board, bootloader, brand, cpu_abi, cpu_abi2, display, fingerprint, hardware, host, id, manufacturer, model, product, serial, tags, time, type, unknown, user, resolution, support4k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvinfo);
        getSupportActionBar().hide();
        version_release = findViewById(R.id.versionRelease);
        version_incremental = findViewById(R.id.versionIncremental);
        version_sdk_number = findViewById(R.id.versionSdkNumber);
        board = findViewById(R.id.board);
        bootloader = findViewById(R.id.bootloader);
        brand = findViewById(R.id.brand);
        cpu_abi = findViewById(R.id.cpuABI);
        cpu_abi2 = findViewById(R.id.cpuABI2);
        display = findViewById(R.id.display);
        fingerprint = findViewById(R.id.fingerprint);
        hardware = findViewById(R.id.hardware);
        host = findViewById(R.id.host);
        id = findViewById(R.id.id);
        manufacturer = findViewById(R.id.manufacturer);
        model = findViewById(R.id.model);
        product = findViewById(R.id.product);
        serial = findViewById(R.id.serial);
        tags = findViewById(R.id.tags);
        time = findViewById(R.id.time);
        type = findViewById(R.id.typeView);
        unknown = findViewById(R.id.unknown);
        user = findViewById(R.id.user);
        resolution = findViewById(R.id.resolution);
        support4k = findViewById(R.id.Support4k);

        version_release.setText(Build.VERSION.RELEASE);
        version_incremental.setText(Build.VERSION.INCREMENTAL);
        version_sdk_number.setText(SDK_INT + "");
        board.setText(Build.BOARD);
        bootloader.setText(Build.BOOTLOADER);
        brand.setText(Build.BRAND);
        cpu_abi.setText(Build.CPU_ABI);
        cpu_abi2.setText(Build.CPU_ABI2);
        display.setText(Build.DISPLAY);
        fingerprint.setText(Build.FINGERPRINT);
        hardware.setText(Build.HARDWARE);
        host.setText(Build.HOST);
        id.setText(Build.ID);
        manufacturer.setText(Build.MANUFACTURER);
        model.setText(Build.MODEL);
        product.setText(Build.PRODUCT);
        serial.setText(Build.SERIAL);
        tags.setText(Build.TAGS);
        time.setText(Build.TIME + "");
        type.setText(Build.TYPE);
        unknown.setText(Build.UNKNOWN);
        user.setText(Build.USER);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        if (height < 3830) {
            support4k.setText("False");
        } else {
            support4k.setText("True");
        }
        resolution.setText(height + " x " + width);
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Quit Application")
                .setMessage("Are you sure you want to Leave?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
    public void txt_privacyPolicy(View view) {
        Intent openURL = new Intent(android.content.Intent.ACTION_VIEW);
        openURL.setData(Uri.parse("https://sites.google.com/view/tv-specification/home"));
        startActivity(openURL);
    }
}