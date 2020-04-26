package com.example.firstgame;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class QuestionFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String Q1="8";
    private String Q2="8";
    private String Q3="8";
    private String Q4="8";
    private String Q5="8";
    private String Q6="8";
    private String Q7="8";
    private String Q8="8";
    private String Q9="8";
    private String Q10="8";
    TextView result, questionText;
    public QuestionFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        result = view.findViewById(R.id.result);
        result.setText("0");
        questionText = view.findViewById(R.id.question);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        result.setText(String.valueOf(seekBar.getProgress()));
    }

   public void question() {
        ArrayList<String> list=new ArrayList();
        for (int i = 1; i <=10 ; i++) {
            list.add(1,"1");
            list.add(2,"2");
            list.add(3,"3");
            list.add(4,"4");
            list.add(5,"5");
            list.add(6,"6");
            list.add(7,"7");
            list.add(8,"8");
            list.add(9,"9");
            list.add(10,"10");
            questionText.setText(list.get(1));
        }

    }}
