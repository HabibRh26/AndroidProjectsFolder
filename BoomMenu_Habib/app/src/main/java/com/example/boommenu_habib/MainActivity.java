package com.example.boommenu_habib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;

public class MainActivity extends AppCompatActivity {
    BoomMenuButton bmb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmb = findViewById(R.id.BoomMenuVw);
        bmb.setButtonEnum(ButtonEnum.Ham);

        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            HamButton.Builder builder = new HamButton.Builder()
                    .normalImageRes(R.drawable.ic_date_available_black_24dp)
                    .normalText("Butter Doesn't fly!")
                    .subNormalText("this is title")
                    .listener(new OnBMClickListener() {
                        @Override
                        public void onBoomButtonClick(int index) {
                            if(index== 0){
                                Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
                                startActivity(intent1);
                            }


                        }
                    });

            bmb.addBuilder(builder);
        }
    }
}
