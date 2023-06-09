package com.mindorks.framework.lsgpractice.ui.framework.main.standingmodel

data class Matche(
    val date: String,
    val filename: String,
    val id: String,
    val number: String,
    val outcome: String,
    val result: String,
    val super_over_loser_id: String,
    val super_over_winner_id: String,
    val teama_id: String,
    val teama_overs_played: String,
    val teama_score: String,
    val teama_wickets: String,
    val teamb_id: String,
    val teamb_overs_played: String,
    val teamb_score: String,
    val teamb_wickets: String,
    val venue_fullname: String,
    val venue_id: String,
    val venue_shortname: String,
    val vs_fullname: String,
    val vs_id: String,
    val vs_shortname: String,
    val winner_id: String
)