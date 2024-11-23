package com.aqeel.simplemorty

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.squareup.picasso.Picasso




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val nameTextView=findViewById<TextView>(R.id.nameTextView)
        val headerImageView=findViewById<AppCompatImageView>(R.id.headerImageView)
        val genderImageView=findViewById<AppCompatImageView>(R.id.genderImageView)
        val aliveTextView=findViewById<TextView>(R.id.aliveTextView)
        val originTextView=findViewById<TextView>(R.id.originTextView)
        val speciesTextView=findViewById<TextView>(R.id.speciesTextView)


        rickA

//
//        rickAndMortyService.getCharacterbyId(72).enqueue(object :Callback<GetCharacterByIdResponse>{
//            override fun onResponse(call: Call<GetCharacterByIdResponse>, response: Response<GetCharacterByIdResponse>) {
//                Log.i("print", response.toString())
//
//                if (!response.isSuccessful){
//                    Toast.makeText(this@MainActivity,"Unsuccessful network Call!!",Toast.LENGTH_SHORT).show()
//                    return
//                }
//
//                val body=response.body()!!
//
//                nameTextView.text = body.name
//                aliveTextView.text = body.status
//                originTextView.text = body.origin.name
//                speciesTextView.text = body.species
//
//
//                if (body.gender.equals("male",true)){
//                    genderImageView.setImageResource(R.drawable.ic_male_24)
//                }else{
//                    genderImageView.setImageResource(R.drawable.ic_female_24)
//                }
//
//                Picasso.get().load(body.image).into(headerImageView)
//
//            }
//
//            override fun onFailure(call: Call<GetCharacterByIdResponse>, t: Throwable) {
//                Log.i("print", t.toString())
//            }
//        })

    }
}