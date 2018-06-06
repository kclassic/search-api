package kclassic.slack.searchapi.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import kclassic.slack.searchapi.dao.SlackMessageDao
import org.springframework.stereotype.Component

@Component
class SearchGraphqlResolver(
        private val messageDao: SlackMessageDao
) : GraphQLQueryResolver {
    fun search(query: String) = messageDao.getMessageByMessageText(query)
}