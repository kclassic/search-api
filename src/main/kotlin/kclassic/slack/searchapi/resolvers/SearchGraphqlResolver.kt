package kclassic.slack.searchapi.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import kclassic.slack.searchapi.dao.SlackMessageDao
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class SearchGraphqlResolver(
        private val messageDao: SlackMessageDao
) : GraphQLQueryResolver {
    fun search(query: String, userName: String?) = messageDao.getMessageByMessageText(query, userName)
    fun searchClose(channel: String, timestamp: String) = messageDao.getCloseMessages(channel, LocalDateTime.parse(timestamp))
}