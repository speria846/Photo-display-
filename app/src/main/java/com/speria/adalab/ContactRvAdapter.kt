package com.speria.adalab

import android.content.Intent
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.speria.adalab.databinding.ContactsListItemBinding
import com.squareup.picasso.Picasso


class ContactRvAdapter(var contactList:List<Contact>):
    RecyclerView.Adapter<ContactRvAdapter.ContactViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {

        var binding=ContactsListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var context=holder.itemView.context
        var currentContact = contactList.get(position)
        with(holder.binding){
        tvName.text = currentContact.name
        tvPhone.text = currentContact.phoneNumber
        tvEmail.text = currentContact.email
       tvLocation.text = currentContact.address
        Picasso.get()
            .load(currentContact.image)
            .resize(300, 300)
            .centerCrop()
//            .placeholder(R.drawable.ic_baseline_co_present_24)
            .into(holder.binding.imageView2)


        cvContact.setOnClickListener {
            val context= holder.itemView.context
            val intent=Intent(context,ViewContactActivity2::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("PHONE_NUMBER",currentContact.phoneNumber)
            intent.putExtra("LOCATION",currentContact.address)
            intent.putExtra("Email",currentContact.email)
            intent.putExtra("IMAGE",currentContact.image)
            context.startActivity(intent)
        }

        holder.binding.imageView2.setOnClickListener {
            Toast.makeText(context, "This is an image", Toast.LENGTH_SHORT)
                .show()
        }
      }
    }

    override fun getItemCount(): Int {
        return contactList.size

  }
class ContactViewHolder(var binding: ContactsListItemBinding):
    RecyclerView.ViewHolder(binding.root)
}