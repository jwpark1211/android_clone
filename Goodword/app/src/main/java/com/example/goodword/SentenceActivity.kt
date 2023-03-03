package com.example.goodword

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("누가 계속 농구하래!!!!")
        sentenceList.add("괜찮아 쟤 슛 없어")
        sentenceList.add("요~ 준수~")
        sentenceList.add("지상고 걔? 음...")
        sentenceList.add("준수야. 아까 그 3점 하나가 오늘 니 마지막 3점이다.")
        sentenceList.add("누가 그런 이상한 학교로 전학 가래?")
        sentenceList.add("에휴, 또 뚫리냐 재석아~!")
        sentenceList.add("아니. 한심한 건... 성준수 너잖아...!")

        val adpater = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = adpater
    }
}