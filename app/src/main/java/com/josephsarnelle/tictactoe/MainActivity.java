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
    //BEGIN GLOBAL VARIABLES
    private int mCol = 0;
    private int mGameCount = 0;
    private int mGameStatus = 0;
    private int mRow = 0;
    private int mTurn = 0;

    private PlayArea mGame = null;

    private String mComputer = null;
    private String mHuman1 = null;
    private String mHuman2 = null;

    private TextView mTextComputerSpace;
    private TextView mTextEmptySpace;
    private TextView mTextHumanSpace;
    //END GLOBAL VARIABLES


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGame = new PlayArea();




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
