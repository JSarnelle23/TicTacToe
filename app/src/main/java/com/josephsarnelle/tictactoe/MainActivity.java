package com.josephsarnelle.tictactoe;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity
{

    private Button mButtonSpace1;
    private Button mButtonSpace2;
    private Button mButtonSpace3;
    private Button mButtonSpace4;
    private Button mButtonSpace5;
    private Button mButtonSpace6;
    private Button mButtonSpace7;
    private Button mButtonSpace8;
    private Button mButtonSpace9;

    private int mTurn = 0;
    private int mGameStatus = 0;

    private String[] mBoardState = new String[9];

    private TextView mTextComputerSpace;
    private TextView mTextEmptySpace;
    private TextView mTextHumanSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonSpace1 = (Button) findViewById(R.id.buttonOne);
        mButtonSpace2 = (Button) findViewById(R.id.buttonTwo);
        mButtonSpace3 = (Button) findViewById(R.id.buttonThree);
        mButtonSpace4 = (Button) findViewById(R.id.buttonFour);
        mButtonSpace5 = (Button) findViewById(R.id.buttonFive);
        mButtonSpace6 = (Button) findViewById(R.id.buttonSix);
        mButtonSpace7 = (Button) findViewById(R.id.buttonSeven);
        mButtonSpace8 = (Button) findViewById(R.id.buttonEight);
        mButtonSpace9 = (Button) findViewById(R.id.buttonNine);

        mButtonSpace1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(mTurn == 0)
                {
                    mButtonSpace1.setText("X");
                    mButtonSpace1.setTextColor(Color.rgb(255, 0, 0));
                    mBoardState[0] = "HUMAN";
                    //mTurn = 1;
                }
            }
        });

        mButtonSpace2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(mTurn == 0)
                {
                    mButtonSpace2.setText("X");
                    mButtonSpace2.setTextColor(Color.rgb(255, 0, 0));
                    mTurn = 1;
                }
            }
        });

        mButtonSpace3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(mTurn == 0)
                {
                    mButtonSpace3.setText("X");
                    mButtonSpace3.setTextColor(Color.rgb(255, 0, 0));
                    mTurn = 1;
                }
            }
        });

        mButtonSpace4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(mTurn == 0)
                {
                    mButtonSpace4.setText("X");
                    mButtonSpace4.setTextColor(Color.rgb(255, 0, 0));
                    mBoardState[3] = "HUMAN";
                    //mTurn = 1;
                }
            }
        });

        mButtonSpace5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(mTurn == 0)
                {
                    mButtonSpace5.setText("X");
                    mButtonSpace5.setTextColor(Color.rgb(255, 0, 0));
                    mTurn = 1;
                }
            }
        });

        mButtonSpace6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(mTurn == 0)
                {
                    mButtonSpace6.setText("X");
                    mButtonSpace6.setTextColor(Color.rgb(255, 0, 0));
                    mTurn = 1;
                }
            }
        });

        mButtonSpace7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(mTurn == 0)
                {
                    mButtonSpace7.setText("X");
                    mButtonSpace7.setTextColor(Color.rgb(255, 0, 0));
                    mBoardState[6] ="HUMAN";
                    mTurn = 1;
                }
            }
        });

        mButtonSpace8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(mTurn == 0)
                {
                    mButtonSpace8.setText("X");
                    mButtonSpace8.setTextColor(Color.rgb(255, 0, 0));
                    //mTurn = 1;
                }
            }
        });

        mButtonSpace9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(mTurn == 0)
                {
                    mButtonSpace9.setText("X");
                    mButtonSpace9.setTextColor(Color.rgb(255, 0, 0));
                    mTurn = 1;
                }
            }
        });

        while(mTurn == 1)
        {
            checkForWinning();
        }

        if(mGameStatus == 1)
        {
            mButtonSpace4.setText("POOP");
            mButtonSpace4.setTextColor(Color.rgb(255,0,0));
        }

    }

    protected void checkForWinning()
    {
        for(int i=0;i<=2;i++) {
            if (mBoardState[i].equals("HUMAN") && mBoardState[i+3].equals("HUMAN") && mBoardState[i+6].equals("HUMAN"))
            {
                mButtonSpace4.setText("POOP");
                mButtonSpace4.setTextColor(Color.rgb(255,0,0));
                mGameStatus = 1;
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
