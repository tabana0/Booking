package com.example.booking.ui.adpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.booking.R
import com.example.booking.model.Clinc

class ClincRecyclerView : RecyclerView.Adapter<ClincRecyclerView.clincViewholder>() {
    var clincList: ArrayList<Clinc> = ArrayList()
    fun setList(clincList: ArrayList<Clinc>) {
        this.clincList= clincList
        notifyDataSetChanged()
    }


    class clincViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img_grid: ImageView = itemView.findViewById(R.id.img_grid)
        var btn_grid: Button = itemView.findViewById(R.id.btn_gird)
        fun bind(clinc: Clinc) {
            img_grid.setImageResource(clinc.imgID)
            btn_grid.text=clinc.clinc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): clincViewholder {
        var view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.rv_items, parent, false)
        return clincViewholder(view)
    }

    override fun onBindViewHolder(holder: clincViewholder, position: Int) {
        var clinc: Clinc = clincList.get(position)
        holder.bind(clinc)
        holder.btn_grid
    }

    override fun getItemCount(): Int {
        return clincList.size
    }


}