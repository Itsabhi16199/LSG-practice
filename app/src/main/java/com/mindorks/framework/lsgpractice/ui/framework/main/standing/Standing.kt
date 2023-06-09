package com.mindorks.framework.lsgpractice.ui.framework.main.standing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.framework.lsgpractice.R
import com.mindorks.framework.lsgpractice.StandingViewModel
import com.mindorks.framework.lsgpractice.databinding.StandingsItemsBinding
import com.mindorks.framework.lsgpractice.ui.framework.main.standingmodel.Team
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Standing : Fragment() {


    val standingViewModel:StandingViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_standing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.standing_rv_list)
        val textView = view.findViewById<TextView>(R.id.pos)


//        if(c == true.toString()){
//            return textView.text
//        }


        recyclerView.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(context)
            //adapter = adapters
            // set the custom adapter to the RecyclerView

            standingViewModel._standingLiveData.observe(viewLifecycleOwner) {
                this.adapter = adapter
                adapter = StandingAdapter(it)


            }


        }

//        val adapter = StandingAdapter()
//        recyclerView.adapter = adapter

        standingViewModel.loadstanding()


    }





}