package com.speria.adalab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.speria.adalab.databinding.ActivityViewContact2Binding
import com.squareup.picasso.Picasso

class ViewContactActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityViewContact2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContact2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
//        getExtra()
    }
    fun getExtras(){

            val extras = intent.extras
            var name = extras?.getString("NAME", "")
            var phone = extras?.getString("PHONE_NUMBER", "")
            var email = extras?.getString("Email", "")
            var address = extras?.getString("LOCATION", "")
            var image = binding.imgDisplay

            Toast.makeText(this,name,Toast.LENGTH_LONG).show()
            Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
            binding.tvname1.text=name
            binding.tvPhonenum.text=phone
            binding.tvEmaill.text=email
            binding.tvLocation.text=address
            Picasso.get().load(intent.getStringExtra("IMAGE"))
                .resize(600,600)
                .centerCrop()
                .into(image)

    }

}