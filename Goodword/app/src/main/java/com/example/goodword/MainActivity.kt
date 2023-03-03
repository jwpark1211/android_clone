package com.example.goodword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.goodword.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("누가 계속 농구하래!!!!")
        sentenceList.add("괜찮아 쟤 슛 없어")
        sentenceList.add("요~ 준수~")
        sentenceList.add("지상고 걔? 음...")
        sentenceList.add("준수야. 아까 그 3점 하나가 오늘 니 마지막 3점이다.")
        sentenceList.add("누가 그런 이상한 학교로 전학 가래?")
        sentenceList.add("에휴, 또 뚫리냐 재석아~!")
        sentenceList.add("아니. 한심한 건... 성준수 너잖아...!")

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener{
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
    }
}