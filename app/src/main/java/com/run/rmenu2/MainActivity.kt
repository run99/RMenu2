package com.run.rmenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count : Int = 0

    var i : Int = 0
    var j : Int = 0
    var k : Int = 0



    val mainDish = arrayOf("肉","魚","どっちでも")
    val meat = arrayOf("牛","豚", "鳥")
    val fish = arrayOf("焼魚","生魚","どっちでも")
    val stapleFood = arrayOf("ご飯","麺","どっちでも")

    val vege1 = arrayOf("キャベツ","大根","skip")
    val vege2 = arrayOf("白菜","レタス","skip")
    val vege3 = arrayOf("じゃがいも","にんじん","skip")
    val vege4 = arrayOf("ねぎ","もやし","skip")

    val questions = arrayOf("Q1","Q2","Q3 冷蔵庫に余っている野菜を選んでね","","","","")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainDishMethod()

        //ボタン１を押して、ボタン２を押すとmeatMethodが呼ばれてしまう

        button.setOnClickListener {
            onButtonClicked()
            i++
            if (i == 1 || j == 0){
                Log.d("料理", i.toString()+ j.toString())
                meatMethod()

            }else if(i == 2 || i == 1 && j == 1){
                stapleFoodMethod()

            }else if(i == 3 || i == 2 && j == 1 || i == 1 && j == 2){
                vege1Method()

            }else{
                val intent : Intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }

        }

        button2.setOnClickListener {
            onButtonClicked()
            j++
            if (j == 1 || i == 0){
                fishMethod()

            }else if (j==2  || i == 1 && j == 1){
                stapleFoodMethod()

            }else if(j ==3 || i == 2 && j == 1 || i == 1 && j == 2){
                vege1Method()

            }else{
                val intent : Intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }

        }

        button3.setOnClickListener {
            onButtonClicked()
            k++
            if (k==1){
                stapleFoodMethod()

            }else if(k==2){
                vege1Method()

            }else if(k==3){
                vege2Method()

            }else if(k==4){
                vege3Method()

            }else if(k==5){
                vege4Method()

            }else{
                val intent : Intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }

        }
    }

    fun mainDishMethod(){
        button.text = mainDish[0]
        button2.text = mainDish[1]
        button3.text = mainDish[2]
        textView.text = questions[0]
    }

    fun meatMethod(){
        button.text = meat[0]
        button2.text = meat[1]
        button3.text = meat[2]
    }

    fun fishMethod(){
        button.text = fish[0]
        button2.text = fish[1]
        button3.text = fish[2]
    }

    fun stapleFoodMethod(){
        button.text = stapleFood[0]
        button2.text = stapleFood[1]
        button3.text = stapleFood[2]
    }

    fun vege1Method(){
        button.text = vege1[0]
        button2.text = vege1[1]
        button3.text = vege1[2]

    }

    fun vege2Method(){
        button.text = vege2[0]
        button2.text = vege2[1]
        button3.text = vege2[2]
    }

    fun vege3Method(){
        button.text = vege3[0]
        button2.text = vege3[1]
        button3.text = vege3[2]
    }

    fun vege4Method(){
        button.text = vege4[0]
        button2.text = vege4[1]
        button3.text = vege4[2]
    }

    fun onButtonClicked(){
        count++
        textView.text = questions[count]
    }
}
