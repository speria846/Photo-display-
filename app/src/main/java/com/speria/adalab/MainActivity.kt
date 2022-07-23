package com.speria.adalab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.speria.adalab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displatContacts()
    }
    fun displatContacts(){
        var contact1=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/family-portrait-picture-id1344622271?b=1&k=20&m=1344622271&s=170667a&w=0&h=vekjYrJtwqKvyFA7VLWqm5BYillhNJiwwUfr6adHVfg=")
        var contact2=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/african-student-sitting-in-classroom-picture-id1351445530?b=1&k=20&m=1351445530&s=170667a&w=0&h=9Lmy0oy3tqoFgvuIPhEKPhbNQrLR12Ym518Zjs-KpF4=")
        var contact3=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/smiling-friends-at-the-picnic-picture-id1335419818?b=1&k=20&m=1335419818&s=170667a&w=0&h=iRy_HY4rVb2kuzveNe4p8PB0L5Csr8_Og9cdgyZm2CI=")
        var contact4=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/shot-of-a-nurse-speaking-to-her-male-patient-picture-id1380983332?b=1&k=20&m=1380983332&s=170667a&w=0&h=KX_xtdb1aRIT-OySYACtxr3BsWmsjTFubNdiq0RTK84=")
        var contact5=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/patient-and-doctor-discussing-test-results-picture-id1343539369?b=1&k=20&m=1343539369&s=170667a&w=0&h=I9Plc28k4-6_92Bq7Gz1tDrz_4S_6WVaikMtZCN8S2g=")
        var contact6=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/portrait-of-natural-beauty-woman-at-beach-picture-id1369509530?b=1&k=20&m=1369509530&s=170667a&w=0&h=__T2AIm-FTBNp8ayP2-0ip7vsLd-gbMkgXla8DRkCXs=")
        var contact7=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/shot-of-a-nurse-speaking-to-her-male-patient-picture-id1380983332?b=1&k=20&m=1380983332&s=170667a&w=0&h=KX_xtdb1aRIT-OySYACtxr3BsWmsjTFubNdiq0RTK84=")
        var contact8=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/patient-and-doctor-discussing-test-results-picture-id1343539369?b=1&k=20&m=1343539369&s=170667a&w=0&h=I9Plc28k4-6_92Bq7Gz1tDrz_4S_6WVaikMtZCN8S2g=")
        var contact9=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/shot-of-a-nurse-speaking-to-her-male-patient-picture-id1380983332?b=1&k=20&m=1380983332&s=170667a&w=0&h=KX_xtdb1aRIT-OySYACtxr3BsWmsjTFubNdiq0RTK84=")
        var contact10=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/shot-of-a-nurse-speaking-to-her-male-patient-picture-id1380983332?b=1&k=20&m=1380983332&s=170667a&w=0&h=KX_xtdb1aRIT-OySYACtxr3BsWmsjTFubNdiq0RTK84=")
        var contact11=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/shot-of-a-nurse-speaking-to-her-male-patient-picture-id1380983332?b=1&k=20&m=1380983332&s=170667a&w=0&h=KX_xtdb1aRIT-OySYACtxr3BsWmsjTFubNdiq0RTK84=")
        var contact12=Contact("speria","speriarq@gmai.com","05326532432","uganda","https://media.istockphoto.com/photos/shot-of-a-nurse-speaking-to-her-male-patient-picture-id1380983332?b=1&k=20&m=1380983332&s=170667a&w=0&h=KX_xtdb1aRIT-OySYACtxr3BsWmsjTFubNdiq0RTK84=")

        var Contact5 = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12)


        var contactsAdapter=ContactRvAdapter(Contact5)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter

    }
}