package com.dalemncy.demo.recyclerview.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dalemncy.demo.recyclerview.databinding.ItemPersonBinding
import com.dalemncy.demo.recyclerview.models.Person

class PersonAdapter(
    private val persons: MutableList<Person>,
): RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(
        private val binding: ItemPersonBinding,
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(person: Person) {
            binding.name.text = person.name
            binding.email.text = person.email
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): PersonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPersonBinding.inflate(
            inflater,
            parent,
            false,
        )
        return PersonViewHolder(binding)
    }

    override fun getItemCount() = persons.size

    override fun onBindViewHolder(
        holder: PersonViewHolder,
        position: Int,
    ) {
        holder.bind(persons[position])
    }
}