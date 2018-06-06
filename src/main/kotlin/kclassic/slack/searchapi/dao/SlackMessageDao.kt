package kclassic.slack.searchapi.dao

import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

@Component
class SlackMessageDao {
    private val data: MutableList<SlackMessage> = mutableListOf(
            SlackMessage(message = "testing1", userName = "Pasha", timestamp = LocalDateTime.now(), channel = "general"),
            SlackMessage(message = "testing2", userName = "Ville", timestamp = LocalDateTime.now(), channel = "cs"),
            SlackMessage(message = "testing2", userName = "Pasha", timestamp = LocalDateTime.now(), channel = "koodimaa")
    )

    fun getMessageByMessageText(text: String, userName: String?) = data.filter { it.message == text && (userName == null || it.userName == userName) }
    fun getCloseMessages(channel: String, timestamp: LocalDateTime) = data.filter { it.channel == channel && ChronoUnit.MINUTES.between(timestamp, it.timestamp) < 15 }
}