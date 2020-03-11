package com.example.td4;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InformationMeteoActivity extends AppCompatActivity {

    private TextView date, temp, weather, windSpeed, temp2;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meteo_information);

        initializeUI();

        Prevision p1 = (Prevision) getIntent().getSerializableExtra("meteo");

        date.setText(Html.fromHtml("Date: " + p1.formatDate()));

        temp.setTypeface(null, Typeface.BOLD);
        temp.setText(Integer.toString(Math.round(p1.getMain().getTemp()))+"°");
        temp.setTextSize(35);

        weather.setText(p1.getWeather().get(0).getMain());
        weather.setTextSize(25);
        weather.setTypeface(null,Typeface.BOLD);

        windSpeed.setTypeface(null, Typeface.BOLD);
        windSpeed.setText(Double.toString(Math.round(p1.getWind().getSpeed()*3.6)) + " KM/H");
        windSpeed.setTextSize(20);

        temp2.setText(Integer.toString(Math.round(p1.getMain().getTemp()))+"°");
        temp2.setTypeface(null, Typeface.BOLD);
        temp2.setTextSize(20);


        switch (p1.getWeather().get(0).getMain()) {
            case "Rain":
                img.setImageResource(R.drawable.ic_rain);
                break;

            case "Clouds":
                img.setImageResource(R.drawable.ic_clouds);
                break;

            case "Thunderstorm":
                img.setImageResource(R.drawable.ic_storm);
                break;

            case "Drizzle":
                img.setImageResource(R.drawable.ic_rain);
                break;

            case "Snow":
                img.setImageResource(R.drawable.ic_snowing);
                break;

            default:
                img.setImageResource(R.drawable.ic_sunny);
        }

    }

    private void initializeUI(){
        date = findViewById(R.id.idDate);
        temp = findViewById(R.id.idTemp);
        weather = findViewById(R.id.idWeather);
        img = findViewById(R.id.img);
        windSpeed = findViewById(R.id.idWindSpeed);
        temp2 = findViewById(R.id.idTemp2);
    }
}
