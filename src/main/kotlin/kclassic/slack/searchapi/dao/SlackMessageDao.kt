package kclassic.slack.searchapi.dao

import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class SlackMessageDao {
        private val data: MutableList<SlackMessage> = mutableListOf(
                SlackMessage(message = "testing1", userName = "Pasha", timestamp = LocalDateTime.now()),
                SlackMessage(message = "testing2", userName = "Ville", timestamp = LocalDateTime.now()),
                SlackMessage(message = "testing2", userName = "Pasha", timestamp = LocalDateTime.now())
        )

        fun getMessageByMessageText(text: String, userName: String?) = data.filter { it.message == text && (userName == null || it.userName == userName) }

}