package studio.dastory.trafik;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView mBtn1;
    TextView mBtn2;
    TextView mBtn3;
    TextView mBtn4;
    TextView mBtn5;
    TextView mBtn6;
    TextView mBtn7;
    TextView mBtn8;
    TextView mBtn9;
    TextView mBtn10;
    TextView mBtn11;
    TextView mBtn12;
    TextView mBtn13;


    private final int IDD_THREE_BUTTONS1 = 0;
    private final int IDD_THREE_BUTTONS2 = 0;
    private final int IDD_THREE_BUTTONS3 = 0;
    private final int IDD_THREE_BUTTONS4 = 0;
    private final int IDD_THREE_BUTTONS5 = 0;
    private final int IDD_THREE_BUTTONS6 = 0;
    private final int IDD_THREE_BUTTONS7 = 0;
    private final int IDD_THREE_BUTTONS8 = 0;
    private final int IDD_THREE_BUTTONS9 = 0;
    private final int IDD_THREE_BUTTONS10 = 0;
    private final int IDD_THREE_BUTTONS11 = 0;
    private final int IDD_THREE_BUTTONS12 = 0;
    private final int IDD_THREE_BUTTONS13 = 0;

    final Context context2 = this;
    SharedPreferences sPref2;

    TextView button1;
    TextView button2;
    TextView button3;
    TextView button4;
    TextView button5;
    TextView button6;
    TextView button7;
    TextView button8;
    TextView button9;
    TextView button10;
    TextView button11;
    TextView button12;
    TextView button13;



    TextView final_text1;
    TextView final_text2;
    TextView final_text3;
    TextView final_text4;
    TextView final_text5;
    TextView final_text6;
    TextView final_text7;
    TextView final_text8;
    TextView final_text9;
    TextView final_text10;
    TextView final_text11;
    TextView final_text12;
    TextView final_text13;



    final String SAVED_TEXT1 = "saved_text1";
    final String SAVED_TEXT2 = "saved_text2";
    final String SAVED_TEXT3 = "saved_text3";
    final String SAVED_TEXT4 = "saved_text4";
    final String SAVED_TEXT5 = "saved_text5";
    final String SAVED_TEXT6 = "saved_text6";
    final String SAVED_TEXT7 = "saved_text7";
    final String SAVED_TEXT8 = "saved_text8";
    final String SAVED_TEXT9 = "saved_text9";
    final String SAVED_TEXT10 = "saved_text10";
    final String SAVED_TEXT11 = "saved_text11";
    final String SAVED_TEXT12 = "saved_text12";
    final String SAVED_TEXT13 = "saved_text13";



    TextView etText1;
    TextView etText2;
    TextView etText3;
    TextView etText4;
    TextView etText5;
    TextView etText6;
    TextView etText7;
    TextView etText8;
    TextView etText9;
    TextView etText10;
    TextView etText11;
    TextView etText12;
    TextView etText13;



    final String MY_SETTINGS = "s1";

    private Switch myswitch;
    private Switch myswitch2;
    private Switch myswitch3;
    private Switch myswitch4;
    private Switch myswitch5;
    private Switch myswitch6;
    private Switch myswitch7;
    private Switch myswitch8;
    private Switch myswitch9;
    private Switch myswitch10;
    private Switch myswitch11;
    private Switch myswitch12;
    private Switch myswitch13;

    SharedPref sharedpref;
    SharedPref2 sharedpref2;
    SharedPref3 sharedpref3;
    SharedPref4 sharedpref4;
    SharedPref5 sharedpref5;
    SharedPref6 sharedpref6;
    SharedPref7 sharedpref7;
    SharedPref8 sharedpref8;
    SharedPref9 sharedpref9;
    SharedPref10 sharedpref10;
    SharedPref11 sharedpref11;
    SharedPref12 sharedpref12;
    SharedPref13 sharedpref13;





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        sharedpref = new SharedPref(this);
        sharedpref2 = new SharedPref2(this);
        sharedpref3 = new SharedPref3(this);
        sharedpref4 = new SharedPref4(this);
        sharedpref5 = new SharedPref5(this);
        sharedpref6 = new SharedPref6(this);
        sharedpref7 = new SharedPref7(this);
        sharedpref8 = new SharedPref8(this);
        sharedpref9 = new SharedPref9(this);
        sharedpref10 = new SharedPref10(this);
        sharedpref11 = new SharedPref11(this);
        sharedpref12 = new SharedPref12(this);
        sharedpref13 = new SharedPref13(this);


        if(sharedpref.loadColor()==true) {
            setTheme(R.style.dostavleno1);
        }
        else
            setTheme(R.style.ne_dostavleno1);

        if(sharedpref2.loadColor2()==true) {
            setTheme(R.style.dostavleno2);
        }
        else
            setTheme(R.style.ne_dostavleno2);

        if(sharedpref3.loadColor3()==true) {
            setTheme(R.style.dostavleno3);
        }
        else
            setTheme(R.style.ne_dostavleno3);

        if(sharedpref4.loadColor4()==true) {
            setTheme(R.style.dostavleno4);
        }
        else
            setTheme(R.style.ne_dostavleno4);

        if(sharedpref5.loadColor5()==true) {
            setTheme(R.style.dostavleno5);
        }
        else
            setTheme(R.style.ne_dostavleno5);

        if(sharedpref6.loadColor6()==true) {
            setTheme(R.style.dostavleno6);
        }
        else
            setTheme(R.style.ne_dostavleno6);

        if(sharedpref7.loadColor7()==true) {
            setTheme(R.style.dostavleno7);
        }
        else
            setTheme(R.style.ne_dostavleno7);


        if(sharedpref8.loadColor8()==true) {
            setTheme(R.style.dostavleno8);
        }
        else
            setTheme(R.style.ne_dostavleno8);


        if(sharedpref9.loadColor9()==true) {
            setTheme(R.style.dostavleno9);
        }
        else
            setTheme(R.style.ne_dostavleno9);

        if(sharedpref10.loadColor10()==true) {
            setTheme(R.style.dostavleno10);
        }
        else
            setTheme(R.style.ne_dostavleno10);

        if(sharedpref11.loadColor11()==true) {
            setTheme(R.style.dostavleno11);
        }
        else
            setTheme(R.style.ne_dostavleno11);


        if(sharedpref12.loadColor12()==true) {
            setTheme(R.style.dostavleno12);
        }
        else
            setTheme(R.style.ne_dostavleno12);


        if(sharedpref13.loadColor13()==true) {
            setTheme(R.style.dostavleno13);
        }
        else
            setTheme(R.style.ne_dostavleno13);




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myswitch=(Switch)findViewById(R.id.switch1);
        if (sharedpref.loadColor()==true) {
            myswitch.setChecked(true);
        }
        myswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref.setNightModeState(true);
                    setTheme(R.style.dostavleno2);
                    restartApp();
                }
                else {
                    sharedpref.setNightModeState(false);
                    setTheme(R.style.ne_dostavleno2);
                    restartApp();
                }
            }
        });

        myswitch2=(Switch)findViewById(R.id.switch2);
        if (sharedpref2.loadColor2()==true) {
            myswitch2.setChecked(true);
        }
        myswitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref2.setNightModeState2(true);
                    setTheme(R.style.dostavleno2);
                    restartApp();
                }
                else {
                    sharedpref2.setNightModeState2(false);
                    setTheme(R.style.ne_dostavleno2);
                    restartApp();
                }
            }
        });

        myswitch3=(Switch)findViewById(R.id.switch3);
        if (sharedpref3.loadColor3()==true) {
            myswitch3.setChecked(true);
        }
        myswitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref3.setNightModeState3(true);
                    setTheme(R.style.dostavleno3);
                    restartApp();
                }
                else {
                    sharedpref3.setNightModeState3(false);
                    setTheme(R.style.ne_dostavleno3);
                    restartApp();
                }
            }
        });

        myswitch4=(Switch)findViewById(R.id.switch4);
        if (sharedpref4.loadColor4()==true) {
            myswitch4.setChecked(true);
        }
        myswitch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref4.setNightModeState4(true);
                    setTheme(R.style.dostavleno4);
                    restartApp();
                }
                else {
                    sharedpref4.setNightModeState4(false);
                    setTheme(R.style.ne_dostavleno4);
                    restartApp();
                }
            }
        });

        myswitch5=(Switch)findViewById(R.id.switch5);
        if (sharedpref5.loadColor5()==true) {
            myswitch5.setChecked(true);
        }

        myswitch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref5.setNightModeState5(true);
                    setTheme(R.style.dostavleno5);
                    restartApp();
                }
                else {
                    sharedpref5.setNightModeState5(false);
                    setTheme(R.style.ne_dostavleno5);
                    restartApp();
                }
            }
        });

        myswitch6=(Switch)findViewById(R.id.switch6);
        if (sharedpref6.loadColor6()==true) {
            myswitch6.setChecked(true);
        }

        myswitch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref6.setNightModeState6(true);
                    setTheme(R.style.dostavleno6);
                    restartApp();
                }
                else {
                    sharedpref6.setNightModeState6(false);
                    setTheme(R.style.ne_dostavleno6);
                    restartApp();
                }
            }
        });

        myswitch7=(Switch)findViewById(R.id.switch7);
        if (sharedpref7.loadColor7()==true) {
            myswitch7.setChecked(true);
        }

        myswitch7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref7.setNightModeState7(true);
                    setTheme(R.style.dostavleno7);
                    restartApp();
                }
                else {
                    sharedpref7.setNightModeState7(false);
                    setTheme(R.style.ne_dostavleno7);
                    restartApp();
                }
            }
        });

        myswitch8=(Switch)findViewById(R.id.switch8);
        if (sharedpref8.loadColor8()==true) {
            myswitch8.setChecked(true);
        }

        myswitch8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref8.setNightModeState8(true);
                    setTheme(R.style.dostavleno8);
                    restartApp();
                }
                else {
                    sharedpref8.setNightModeState8(false);
                    setTheme(R.style.ne_dostavleno8);
                    restartApp();
                }
            }
        });
        myswitch9=(Switch)findViewById(R.id.switch9);
        if (sharedpref9.loadColor9()==true) {
            myswitch9.setChecked(true);
        }

        myswitch9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref9.setNightModeState9(true);
                    setTheme(R.style.dostavleno9);
                    restartApp();
                }
                else {
                    sharedpref9.setNightModeState9(false);
                    setTheme(R.style.ne_dostavleno9);
                    restartApp();
                }
            }
        });

        myswitch10=(Switch)findViewById(R.id.switch10);
        if (sharedpref10.loadColor10()==true) {
            myswitch10.setChecked(true);
        }


        myswitch10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref10.setNightModeState10(true);
                    setTheme(R.style.dostavleno10);
                    restartApp();
                }
                else {
                    sharedpref10.setNightModeState10(false);
                    setTheme(R.style.ne_dostavleno10);
                    restartApp();
                }
            }
        });

        myswitch11=(Switch)findViewById(R.id.switch11);
        if (sharedpref11.loadColor11()==true) {
            myswitch11.setChecked(true);
        }


        myswitch11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref11.setNightModeState11(true);
                    setTheme(R.style.dostavleno11);
                    restartApp();
                }
                else {
                    sharedpref11.setNightModeState11(false);
                    setTheme(R.style.ne_dostavleno11);
                    restartApp();
                }
            }
        });

        myswitch12=(Switch)findViewById(R.id.switch12);
        if (sharedpref12.loadColor12()==true) {
            myswitch12.setChecked(true);
        }


        myswitch12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref12.setNightModeState12(true);
                    setTheme(R.style.dostavleno12);
                    restartApp();
                }
                else {
                    sharedpref12.setNightModeState12(false);
                    setTheme(R.style.ne_dostavleno12);
                    restartApp();
                }
            }
        });

        myswitch13=(Switch)findViewById(R.id.switch13);
        if (sharedpref13.loadColor13()==true) {
            myswitch13.setChecked(true);
        }

        myswitch13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedpref13.setNightModeState13(true);
                    setTheme(R.style.dostavleno13);
                    restartApp();
                }
                else {
                    sharedpref13.setNightModeState13(false);
                    setTheme(R.style.ne_dostavleno13);
                    restartApp();
                }
            }
        });


        TextView Date;
        Date = (TextView) findViewById(R.id.textView100);
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy/HH:mm" + "/Дубок");
        String date = df.format(c.getTime());
        Date.setText(date);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        button1 = findViewById(R.id.textView2);
        button2 = findViewById(R.id.textView6);
        button3 = findViewById(R.id.textView10);
        button4 = findViewById(R.id.textView14);
        button5 = findViewById(R.id.textView18);
        button6 = findViewById(R.id.textView22);
        button7 = findViewById(R.id.textView26);
        button8 = findViewById(R.id.textView30);
        button9 = findViewById(R.id.textView34);
        button10 = findViewById(R.id.textView38);
        button11 = findViewById(R.id.textView42);
        button12 = findViewById(R.id.textView46);
        button13 = findViewById(R.id.textView50);



        final_text1 = findViewById(R.id.textView2);
        final_text2 = findViewById(R.id.textView6);
        final_text3 = findViewById(R.id.textView10);
        final_text4 = findViewById(R.id.textView14);
        final_text5 = findViewById(R.id.textView18);
        final_text6 = findViewById(R.id.textView22);
        final_text7 = findViewById(R.id.textView26);
        final_text8 = findViewById(R.id.textView30);
        final_text9 = findViewById(R.id.textView34);
        final_text10 = findViewById(R.id.textView38);
        final_text11 = findViewById(R.id.textView42);
        final_text12 = findViewById(R.id.textView46);
        final_text13 = findViewById(R.id.textView50);


        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа
        boolean hasVisited = sp.getBoolean("s1", false);

        if (!hasVisited) {

            LayoutInflater li = LayoutInflater.from(context2);
            View promptsView = li.inflate(R.layout.prompt_start, null);
            AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
            mDialogBuilder.setView(promptsView);






            final TextView bill23 = (TextView) findViewById(R.id.textView2);
            final TextView bill24 = (TextView) findViewById(R.id.textView6);
            final TextView bill25 = (TextView) findViewById(R.id.textView10);
            final TextView bill26 = (TextView) findViewById(R.id.textView14);
            final TextView bill27 = (TextView) findViewById(R.id.textView18);
            final TextView bill28 = (TextView) findViewById(R.id.textView22);
            final TextView bill29 = (TextView) findViewById(R.id.textView26);
            final TextView bill30 = (TextView) findViewById(R.id.textView30);
            final TextView bill31 = (TextView) findViewById(R.id.textView34);
            final TextView bill32 = (TextView) findViewById(R.id.textView38);
            final TextView bill33 = (TextView) findViewById(R.id.textView42);
            final TextView bill79 = (TextView) findViewById(R.id.textView46);
            final TextView bill80 = (TextView) findViewById(R.id.textView50);









            mDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {



                                    bill23.setText(000000 + "");
                                    bill24.setText(000000 + "");
                                    bill25.setText(000000 + "");
                                    bill26.setText(000000 + "");
                                    bill27.setText(000000 + "");
                                    bill28.setText(000000 + "");
                                    bill29.setText(000000 + "");
                                    bill30.setText(000000 + "");
                                    bill31.setText(000000 + "");
                                    bill32.setText(000000 + "");
                                    bill33.setText(000000 + "");
                                    bill79.setText(000000 + "");
                                    bill80.setText(000000 + "");











                                }
                            });
            AlertDialog alertDialog = mDialogBuilder.create();
            alertDialog.show();




            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("s1", true);
            e.commit(); // не забудьте подтвердить изменения
        }


        etText1 = (TextView) findViewById(R.id.textView2);
        etText2 = (TextView) findViewById(R.id.textView6);
        etText3 = (TextView) findViewById(R.id.textView10);
        etText4 = (TextView) findViewById(R.id.textView14);
        etText5 = (TextView) findViewById(R.id.textView18);
        etText6 = (TextView) findViewById(R.id.textView22);
        etText7 = (TextView) findViewById(R.id.textView26);
        etText8 = (TextView) findViewById(R.id.textView30);
        etText9 = (TextView) findViewById(R.id.textView34);
        etText10 = (TextView) findViewById(R.id.textView38);
        etText11 = (TextView) findViewById(R.id.textView42);
        etText12 = (TextView) findViewById(R.id.textView46);
        etText13 = (TextView) findViewById(R.id.textView50);



        loadText1();
        loadText2();
        loadText3();
        loadText4();
        loadText5();
        loadText6();
        loadText7();
        loadText8();
        loadText9();
        loadText10();
        loadText11();
        loadText12();
        loadText13();


        button1.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text1.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();
                                           }
                                       }
        );

        button2.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt2, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text2.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );

        button3.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt3, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text3.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );

        button4.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt4, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text4.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );

        button5.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt5, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text5.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );

        button6.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt6, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text6.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );
        button7.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt7, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text7.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );
        button8.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt8, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text8.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );
        button9.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt9, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text9.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );
        button10.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt10, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text10.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );
        button11.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt11, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text11.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );
        button12.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt12, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else
                                                                           {final_text12.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );
        button13.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View arg0) {
                                               LayoutInflater li = LayoutInflater.from(context2);
                                               final View promptsView = li.inflate(R.layout.prompt13, null);
                                               AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                               mDialogBuilder.setView(promptsView);
                                               mDialogBuilder
                                                       .setCancelable(false)
                                                       .setPositiveButton("OK",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       final EditText userInput = promptsView.findViewById(R.id.editText2);
                                                                       if (userInput.getText().length() == 0||(userInput.getText().length()<6))
                                                                       {dialog.cancel();}else {final_text13.setText(userInput.getText());}}})
                                                       .setNegativeButton("Отмена",
                                                               new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {
                                                                       dialog.cancel();}});
                                               AlertDialog alertDialog = mDialogBuilder.create();
                                               alertDialog.show();

                                           }
                                       }
        );

        /// пачкі:


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                final TextView bill23 = (TextView) findViewById(R.id.textView2);
                final TextView bill24 = (TextView) findViewById(R.id.textView6);
                final TextView bill25 = (TextView) findViewById(R.id.textView10);
                final TextView bill26 = (TextView) findViewById(R.id.textView14);
                final TextView bill27 = (TextView) findViewById(R.id.textView18);
                final TextView bill28 = (TextView) findViewById(R.id.textView22);
                final TextView bill29 = (TextView) findViewById(R.id.textView26);
                final TextView bill30 = (TextView) findViewById(R.id.textView30);
                final TextView bill31 = (TextView) findViewById(R.id.textView34);
                final TextView bill32 = (TextView) findViewById(R.id.textView38);
                final TextView bill33 = (TextView) findViewById(R.id.textView42);
                final TextView bill79 = (TextView) findViewById(R.id.textView46);
                final TextView bill80 = (TextView) findViewById(R.id.textView50);




                bill23.setText(000000 + "");
                bill24.setText(000000 + "");
                bill25.setText(000000 + "");
                bill26.setText(000000 + "");
                bill27.setText(000000 + "");
                bill28.setText(000000 + "");
                bill29.setText(000000 + "");
                bill30.setText(000000 + "");
                bill31.setText(000000 + "");
                bill32.setText(000000 + "");
                bill33.setText(000000 + "");
                bill79.setText(000000 + "");
                bill80.setText(000000 + "");



                Toast toast = Toast.makeText(getApplicationContext(),
                        "Сброс", Toast.LENGTH_SHORT);

                toast.show();

                return true;
            }


            //Snackbar.make(view, "Подсчитано", Snackbar.LENGTH_SHORT)
            //Snackbar.make(view, "Подсчитано", Snackbar.LENGTH_SHORT)
            // .setAction("Action", null).show();

        });

        FloatingActionButton fab2 = findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //restartApp();
                finishAffinity();

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Збережено", Toast.LENGTH_SHORT);

                toast.show();
            }
        });













    }

    void saveText1() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT1, etText1.getText().toString());
        ed.commit();
    }
    void loadText1() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT1, "");
        etText1.setText(savedText);
    }
    void saveText2() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT2, etText2.getText().toString());
        ed.commit();
    }
    void loadText2() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT2, "");
        etText2.setText(savedText);
    }
    void saveText3() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT3, etText3.getText().toString());
        ed.commit();
    }
    void loadText3() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT3, "");
        etText3.setText(savedText);
    }
    void saveText4() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT4, etText4.getText().toString());
        ed.commit();
    }
    void loadText4() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT4, "");
        etText4.setText(savedText);
    }
    void saveText5() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT5, etText5.getText().toString());
        ed.commit();
    }
    void loadText5() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT5, "");
        etText5.setText(savedText);
    }
    void saveText6() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT6, etText6.getText().toString());
        ed.commit();
    }
    void loadText6() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT6, "");
        etText6.setText(savedText);
    }
    void saveText7() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT7, etText7.getText().toString());
        ed.commit();
    }
    void loadText7() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT7, "");
        etText7.setText(savedText);
    }
    void saveText8() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT8, etText8.getText().toString());
        ed.commit();
    }
    void loadText8() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT8, "");
        etText8.setText(savedText);
    }
    void saveText9() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT9, etText9.getText().toString());
        ed.commit();
    }
    void loadText9() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT9, "");
        etText9.setText(savedText);
    }
    void saveText10() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT10, etText10.getText().toString());
        ed.commit();
    }
    void loadText10() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT10, "");
        etText10.setText(savedText);
    }
    void saveText11() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT11, etText11.getText().toString());
        ed.commit();
    }
    void loadText11() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT11, "");
        etText11.setText(savedText);
    }
    void saveText12() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT12, etText12.getText().toString());
        ed.commit();
    }
    void loadText12() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT12, "");
        etText12.setText(savedText);
    }
    void saveText13() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT13, etText13.getText().toString());
        ed.commit();
    }
    void loadText13() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT13, "");
        etText13.setText(savedText);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        saveText1();
        saveText2();
        saveText3();
        saveText4();
        saveText5();
        saveText6();
        saveText7();
        saveText8();
        saveText9();
        saveText10();
        saveText11();
        saveText12();
        saveText13();

    }
    public void restartApp () {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
}
