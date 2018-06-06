package kclassic.slack.searchapi.dao

import java.time.LocalDateTime

data class SlackMessage(
        val message: String,
        val userName: String,
        val timestamp: LocalDateTime,
        val channel: String
)