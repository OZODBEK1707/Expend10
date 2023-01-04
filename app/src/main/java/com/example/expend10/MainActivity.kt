package com.example.expend10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expend10.adapters.MyExpendAdapter
import com.example.expend10.databinding.ActivityMainBinding
import com.example.expend10.models.MyDataBase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myExpendAdapter: MyExpendAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MyDataBase.addMap()
        myExpendAdapter = MyExpendAdapter(MyDataBase.titleList, MyDataBase.map)
        binding.myExpendView.setAdapter(myExpendAdapter)

        binding.myExpendView.setOnChildClickListener { _, _, groupPosition, childPosition, _ ->
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("lop",MyDataBase.map[MyDataBase.titleList[groupPosition]]?.get(childPosition))
            startActivity(intent)
            true
        }


    }
}