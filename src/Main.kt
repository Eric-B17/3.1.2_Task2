enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: String,
)

fun main() {
    Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", "Evening", "15")
}