package com.mindorks.framework.lsgpractice.ui.framework.main.standingmodel

data class Team(
    val id: String,
    val is_qualified: String,
    val l: String,
    val matches: List<Matche>,
    val name: String,
    val nr: String,
    val nrr: String,
    val p: String,
    val pos: String,
    val pts: String,
    val short_name: String,
    val t: String,
    val w: String
)