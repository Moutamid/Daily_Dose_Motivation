package com.moutamid.daily_dose_motivation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    ImageView editName , doneName ;
    TextView date;
    TextView date_proper;
    TextView txt_motivation;

    TextView privacy_text;
    Button thumbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.edit1);
        editName = findViewById(R.id.btn_editName);
        doneName = findViewById(R.id.btn_doneName);
        date = findViewById(R.id.date);
        date_proper = findViewById(R.id.date_proper);
        txt_motivation = findViewById(R.id.txt_motivation);

        thumbs = findViewById(R.id.btn_thumbs);
        privacy_text = findViewById(R.id.privacy_policy);

        editName.setVisibility(View.VISIBLE);
        editName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setEnabled(true);
                editName.setVisibility(View.GONE);
                doneName.setVisibility(View.VISIBLE);
            }
        });
        doneName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setEnabled(false);
                editName.setVisibility(View.VISIBLE);
                doneName.setVisibility(View.GONE);
            }
        });

        privacy_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/e/2PACX-1vTranMDFX4P5vprEhmG8NewJ1E8kHA4qQndzbMtMf6tENW9_2poCkOBWCSuRhJV8e0MW51dwCPGMoxx/pub"));
                startActivity(browserIntent);
            }
        });

        thumbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , DonateActivity.class);
                startActivity(intent);
            }
        });

        String myCurrent_dateTime = SimpleDateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
        date_proper.setText(myCurrent_dateTime);

        SimpleDateFormat df = new SimpleDateFormat("dd", Locale.US);
        String set_date = df.format(new Date());
        date.setText(set_date);

        final int motivation = Integer.parseInt(date.getText().toString());
        if(motivation == 1){
            txt_motivation.setText("“We cannot solve problems with the kind of thinking we employed when we came up with them.” — Albert Einstein");
        }
        else if (motivation == 2){
            txt_motivation.setText("“Learn as if you will live forever, live like you will die tomorrow.” — Mahatma Gandhi");
        }
        else if (motivation == 3){
            txt_motivation.setText("“Stay away from those people who try to disparage your ambitions. Small minds will always do that, but great minds will give you a feeling that you can become great too.” — Mark Twain");
        }
        else if(motivation == 4){
            txt_motivation.setText("“When you give joy to other people, you get more joy in return. You should give a good thought to happiness that you can give out.”— Eleanor Roosevelt");
        }
        else if (motivation == 5){
            txt_motivation.setText("“When you change your thoughts, remember to also change your world.”—Norman Vincent Peale");
        }
        else if (motivation == 6){
            txt_motivation.setText("“It is only when we take chances, when our lives improve. The initial and the most difficult risk that we need to take is to become honest. —Walter Anderson");
        }
        else if(motivation == 7){
            txt_motivation.setText("“Nature has given us all the pieces required to achieve exceptional wellness and health, but has left it to us to put these pieces together.”—Diane McLaren");
        }
        else if (motivation == 8){
            txt_motivation.setText("“Success usually comes to those who are too busy looking for it.” — Henry David Thoreau");
        }
        else if (motivation == 9){
            txt_motivation.setText("“Develop success from failures. Discouragement and failure are two of the surest stepping stones to success.” —Dale Carnegie");
        }
        else if(motivation == 10){
            txt_motivation.setText("“Nothing in the world can take the place of Persistence. Talent will not; nothing is more common than unsuccessful men with talent. Genius will not; unrewarded genius is almost a proverb. Education will not; the world is full of educated derelicts. The slogan 'Press On' has solved and always will solve the problems of the human race.“ —Calvin Coolidge");
        }
        else if (motivation == 11){
            txt_motivation.setText("“There are three ways to ultimate success: The first way is to be kind. The second way is to be kind. The third way is to be kind.” —Mister Rogers");
        }
        else if (motivation == 12){
            txt_motivation.setText("“Success is peace of mind, which is a direct result of self-satisfaction in knowing you made the effort to become the best of which you are capable.” —John Wooden");
        }
        else if(motivation == 13){
            txt_motivation.setText("“The pessimist sees difficulty in every opportunity. The optimist sees opportunity in every difficulty.“ — Winston Churchill");
        }
        else if (motivation == 14){
            txt_motivation.setText("“If you are working on something that you really care about, you don’t have to be pushed. The vision pulls you.” — Steve Jobs");
        }
        else if (motivation == 15){
            txt_motivation.setText("“Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle. As with all matters of the heart, you'll know when you find it.” — Steve Jobs");
        }
        else if(motivation == 16){
            txt_motivation.setText("“Think like a queen. A queen is not afraid to fail. Failure is another stepping stone to greatness.” — Oprah Winfrey");
        }
        else if (motivation == 17){
            txt_motivation.setText("“Some women choose to follow men, and some choose to follow their dreams. If you’re wondering which way to go, remember that your career will never wake up and tell you that it doesn’t love you anymore.” — Lady Gaga");
        }
        else if (motivation == 18){
            txt_motivation.setText("“I swear, by my life and my love of it, that I will never live for the sake of another man, nor ask another man to live for mine.” — Ayn Rand");
        }
        else if(motivation == 19){
            txt_motivation.setText("“A successful man is one who can lay a firm foundation with the bricks others have thrown at him.” – David Brinkley");
        }
        else if (motivation == 20){
            txt_motivation.setText("“You’ll find that education is just about the only thing lying around loose in this world, and it’s about the only thing a fellow can have as much of as he’s willing to haul away.” —John Graham");
        }
        else if (motivation == 21){
            txt_motivation.setText("“People often say that motivation doesn’t last. Well, neither does bathing – that’s why we recommend it daily.” — Zig Ziglar");
        }
        else if (motivation == 22){
            txt_motivation.setText("“I am so clever that sometimes I don’t understand a single word of what I am saying.” — Oscar Wilde");
        }
        else if (motivation == 23){
            txt_motivation.setText("“Teamwork is the ability to work together toward a common vision. The ability to direct individual accomplishments toward organizational objectives. It is the fuel that allows common people to attain uncommon results.” — Andrew Carnegie");
        }
        else if (motivation == 24){
            txt_motivation.setText("“Coming together is a beginning. Keeping together is progress. Working together is success.” — Henry Ford");
        }
        else if (motivation == 25){
            txt_motivation.setText("”You cannot plow a field by turning it over in your mind. To begin, begin.” ―Gordon B. Hinckley");
        }
        else if (motivation == 26){
            txt_motivation.setText("“Every Friday, I like to high five myself for getting through another week on little more than caffeine, willpower, and inappropriate humor.” —Nanea Hoffman");
        }
        else if (motivation == 27){
            txt_motivation.setText("“When you leave work on Friday, leave work. Don’t let technology follow you throughout your weekend (answering text messages and emails) take a break you will be more refreshed to begin the workweek if you have had a break.” —Catherine Pulsifer");
        }
        else if (motivation == 28){
            txt_motivation.setText("“Don't settle for average. Bring your best to the moment. Then, whether it fails or succeeds, at least you know you gave all you had.” —Angela Bassett");
        }
        else if (motivation == 29){
            txt_motivation.setText("“There is a vitality, a life force, an energy, a quickening that is translated through you into action, and because there is only one of you in all time, this expression is unique. And if you block it, it will never exist through any other medium and will be lost.” ―Martha Graham");
        }
        else if (motivation == 30){
            txt_motivation.setText("“Set your goals high, and don’t stop till you get there.” —Bo Jackson");
        }
        else if (motivation == 31){
            txt_motivation.setText("“Life can be much broader once you discover one simple fact: Everything around you that you call life was made up by people that were no smarter than you. And you can change it, you can influence it… Once you learn that, you'll never be the same again.” —Steve Jobs");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String s1 = sh.getString("name", "");
        name.setText(s1);
        name.setEnabled(false);
    }
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("name", name.getText().toString());
        myEdit.apply();
    }
}