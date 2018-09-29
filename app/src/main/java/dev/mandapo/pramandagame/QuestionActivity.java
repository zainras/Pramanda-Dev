package dev.mandapo.pramandagame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    public static String EXTRA_TASK_KEY = "extra_task_key";

    String[] questionList;
    String[][] choiceList;
    int[] answerKeyList;
    int currentAnswer;
    int currentQuiz;
    int scoreQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        final TextView question = (TextView) findViewById(R.id.tvQuestion);
        final Button btnA1 = (Button) findViewById(R.id.btnAnswer1);
        final Button btnA2 = (Button) findViewById(R.id.btnAnswer2);
        final Button btnA3 = (Button) findViewById(R.id.btnAnswer3);
        final Button btnA4 = (Button) findViewById(R.id.btnAnswer4);

        questionList = new String[]{
                "Hewan Reptil Asli Indonesia ?",
                "Tari tradisional yang berasal dari Aceh ?",
                "Gunung tertinggi di pulau jawa?",
                "Sungai terpenjang di Indonesia ?",
                "Tari tradisional yang berasala dari Ponorogo ?",
                "Candi budha terbesar di dunia ?",
                "Nama Suku di papua  ?",
                "Senjata tradisional dari kalimantan ?",
                "Perahu tradional pelaut indonesia ?",
                "Nama pulau yang memiliki terumbu karang terbaik ?",
        };

        choiceList = new String[][]{
                {"A. Kadal","B. Komodo","C. Iguana", "D. test"},
                {"A. Tari remo","B. Tari piring","C. Tari saman", "D. test"},
                {"A. Gunung semeru","B. Gunung bromo","C. Gunung agung", "D. test"},
                {"A. Kapuas","B. Bengawan solo","C. Mahakam", "D. test"},
                {"A. Tari kuda lumping","B. Tari zip zip","C. Tari Reog", "D. test"},
                {"A. Candi mendut","B. Candi Prambanan","C. Candi Borobudur", "D. test"},
                {"A. Suku asmat","B. Suku badui","C. Suku bugis", "D. test"},
                {"A. Keris","B. Mandau","C. Parang", "D. test"},
                {"A. Kapal Pinisi","B. Kapal layar","C. Kapal Apung", "D. test"},
                {"A. Ujung Kolon","B. Way Kambas","C. Raja ampat", "D. test"},
        };

        answerKeyList = new int[]{1,2,0,0,2,2,0,1,0,2};
        
        currentQuiz = 0;

        Integer tKey = Integer.valueOf(getIntent().getStringExtra(EXTRA_TASK_KEY));

        question.setText(questionList[tKey]);
        btnA1.setText(choiceList[tKey][0]);
        btnA2.setText(choiceList[tKey][1]);
        btnA3.setText(choiceList[tKey][2]);
        btnA4.setText(choiceList[tKey][3]);
        
    }
}
