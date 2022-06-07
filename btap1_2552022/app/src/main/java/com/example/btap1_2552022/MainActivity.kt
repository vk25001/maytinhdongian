package com.example.btap1_2552022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.btap1_2552022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)
        var checkbang : Boolean = false
        var checkdot :Boolean = false
        var so1 : Int
        var so3 : Int
        var so4 : Int
        var so2 : Int
        var ketqua : Int
        var ketqua1 : String
        var pheptoan : String = ""
        var tinhtoan : String
        var bt0 : Button
        var bt1 : Button
        var bt2 : Button
        var bt3 : Button
        var bt4 : Button
        var bt5 : Button
        var bt6 : Button
        var bt7 : Button
        var bt8 : Button
        var bt9 : Button
        var btc : Button
        var btcong : Button
        var bttru : Button
        var btnhan : Button
        var btchia : Button
        var btbang : Button
        var btphantram : Button
        var btconghaytru : Button
        var btdel : Button
        var btdot : Button
        var manhinhtinh : TextView = findViewById(R.id.manhinhtinh)
        var manhinhketqua : TextView = findViewById(R.id.manhinhketqua)
        bt0 = viewbinding.bt0
        bt1 = viewbinding.bt1
        bt2 = viewbinding.bt2
        bt3 = viewbinding.bt3
        bt4 = viewbinding.bt4
        bt5 = viewbinding.bt5
        bt6 = viewbinding.bt6
        bt7 = viewbinding.bt7
        bt8= viewbinding.bt8
        bt9 = viewbinding.bt9
        btbang = viewbinding.btbang
        btcong = viewbinding.btcong
        bttru = viewbinding.bttru
        btnhan = viewbinding.btnhan
        btchia = viewbinding.btchia2
        btdel = viewbinding.btxoa
        btdot = viewbinding.btdot
        btconghaytru = viewbinding.btconghaytru
        btc = viewbinding.btc
        manhinhtinh=viewbinding.manhinhtinh
        manhinhketqua=viewbinding.manhinhketqua

        viewbinding.btc.setOnClickListener{
            manhinhtinh.setText("")
            manhinhketqua.setText("")
            tinhtoan=""
            pheptoan=""
            checkbang = false
            checkdot = false

        }
        viewbinding.bt0.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "0")
        }
        viewbinding.bt1.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "1")
        }
        viewbinding.bt2.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "2")
        }
        viewbinding.bt3.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "3")
        }
        viewbinding.bt4.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "4")
        }
        viewbinding.bt5.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "5")
        }
        viewbinding.bt6.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "6")
        }
        viewbinding.bt7.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "7")
        }
        viewbinding.bt8.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "8")
        }
        viewbinding.bt9.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "9")
        }
        viewbinding.btdot.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + ".")
        }
        viewbinding.btcong.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + " + ")
            tinhtoan = ""
            pheptoan = "+"
            checkbang = false
            checkdot = false
        }
        viewbinding.bttru.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + " - ")
            tinhtoan = ""
            pheptoan = "-"
            checkbang = false
            checkdot = false
        }
        viewbinding.btnhan.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + " x ")
            tinhtoan = ""
            pheptoan = "x"
            checkbang = false
            checkdot = false
        }
        viewbinding.btchia2.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + " / ")
            tinhtoan = ""
            pheptoan = "/"
            checkbang = false
            checkdot = false
        }
        viewbinding.btphancham.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()
            manhinhtinh.setText(tinhtoan + "%")
            tinhtoan = ""
            pheptoan = "+"
            checkbang = false
            checkdot = false
        }
        viewbinding.btbang.setOnClickListener {
            tinhtoan = manhinhtinh.text.toString()

            if(pheptoan == "+"){
                so1 = manhinhtinh.text.split(" + ")[0].toInt()
                so2 = manhinhtinh.text.split(" + ")[1].toInt()
                ketqua = so1 + so2
                ketqua1 = ketqua.toString()
                manhinhketqua.setText(ketqua1 + "")
            }
            if(pheptoan == "-"){
                so1 = manhinhtinh.text.split(" - ")[0].toInt()
                so2 = manhinhtinh.text.split(" - ")[1].toInt()
                if(so1>=so2){
                    ketqua = so1 - so2
                    ketqua1 = ketqua.toString()
                    manhinhketqua.setText(ketqua1 + "")
                }else{
                    ketqua = -(so2 - so1)
                    ketqua1 = ketqua.toString()
                    manhinhketqua.setText(ketqua1 + "")
                }
            }
            if(pheptoan == "x") {
                so1 = manhinhtinh.text.split(" x ")[0].toInt()
                so2 = manhinhtinh.text.split(" x ")[1].toInt()
                ketqua = so1 * so2
                ketqua1 = ketqua.toString()
                manhinhketqua.setText(ketqua1 + "")
            }
            if(pheptoan == "/"){
                so1 = manhinhtinh.text.split(" / ")[0].toInt()
                so2 = manhinhtinh.text.split(" / ")[1].toInt()
                if(so2 == 0){
                    manhinhketqua.setText("m co bi ngu khong ma di chia 0")
                }else{
                    ketqua = so1/so2
                    ketqua1 = ketqua.toString()
                    manhinhketqua.setText(ketqua1 + "")
                }
            }
        }

    }
}








