package kclassic.slack.searchapi.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component


@Component
class HelloGraphqlResolver : GraphQLQueryResolver {
    fun hello() = "Hello k'classic from GraphQL!"
}