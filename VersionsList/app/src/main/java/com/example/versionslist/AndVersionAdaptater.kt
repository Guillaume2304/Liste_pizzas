package com.example.versionslist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_and_version.*
import kotlinx.android.synthetic.main.item_and_version.view.*

class AndVersionAdapter(val items: MutableList<AndVersion>) :
    RecyclerView.Adapter<AndVersionAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view), LayoutContainer {
        fun bindAndVersion(andVersion: AndVersion) {
            with(andVersion) {
                itemView.andVersionTxt.text = "$name"
                itemView.andVersionImg.setImageResource(img)
            }
        }

        override val containerView: View?
            get() = itemView
    }

    override fun getItemCount(): Int = items.size

//    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
//        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val lineView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_and_version, parent, false)
        return ViewHolder(lineView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAndVersion(items[position])
    }
}