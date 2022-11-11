package com.rsk.trekable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(val images: List<Int>): RecyclerView.Adapter<PagerAdapter.ViewPagerAdapter>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)

        return ViewPagerAdapter(view)
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter, position: Int) {
        val currImage = images[position]
        holder.itemView.findViewById<ImageView>(R.id.item_view_pager_imageView).setImageResource(currImage)
    }

    override fun getItemCount(): Int {
        return images.size
    }


    inner class ViewPagerAdapter(itemView: View): RecyclerView.ViewHolder(itemView)
}