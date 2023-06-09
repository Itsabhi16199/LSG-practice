package com.mindorks.business.model.standing

data class Standing(
//    val standings: Standings
    val position: String?,
    val title: String?,
    val teamLogoUrl: String? = null,
    val isCurrentTeam: Boolean = false,
    var scoreList: List<String> = emptyList(),
    val lastMatchesResult: List<String> = emptyList()
)