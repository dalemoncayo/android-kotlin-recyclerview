package com.dalemncy.demo.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.dalemncy.demo.recyclerview.adapters.PersonAdapter
import com.dalemncy.demo.recyclerview.databinding.ActivityMainBinding
import com.dalemncy.demo.recyclerview.models.Person

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val persons: MutableList<Person> = ArrayList()

        for (i in 1..10) { // Loop 10 times to make the list longer.
            persons.add(Person("John Doe", "john.doe@gmail.com"))
            persons.add(Person("Saturo Gojo", "saturo.gojo@gmail.om"))
            persons.add(Person("Monkey D. Luffy", "monkey.luffy@gmail.com"))
            persons.add(Person("Naruto Uzumaki", "naruto.uzumaki@gmail.com"))
        }

        binding.personList.layoutManager = LinearLayoutManager(this)
        binding.personList.adapter = PersonAdapter(persons)
    }
}