package com.mindorks.framework.lsgpractice.ui.framework.main.standing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.framework.lsgpractice.R
import com.mindorks.framework.lsgpractice.databinding.StandingsItemsBinding
import com.mindorks.framework.lsgpractice.ui.framework.main.standingmodel.Team

class StandingAdapter(private var Team : List<Team>? = null) : RecyclerView.Adapter<StandingAdapter.ViewHolder>() {

        private lateinit var binding : StandingsItemsBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = StandingsItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return StandingAdapter.ViewHolder(binding)
    }

    class ViewHolder(private val binding: StandingsItemsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(team: Team){
            binding.team = team
        }

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val teams = Team?.get(position)
        if (teams != null) {
            holder.bind(teams)
        }

    }

    override fun getItemCount(): Int {
        return Team?.size?:0
//        return 4
    }



}