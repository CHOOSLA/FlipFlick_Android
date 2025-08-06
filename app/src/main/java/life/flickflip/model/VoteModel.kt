package life.flickflip.model

data class Vote(
    val id: String,
    val title:String,
    val voteOptions: List<VoteOption>,
)

data class VoteOption(
    // tmdb 영화 id
    val id: String,
    val imagUrl : String,
    val movieTitle : String
)