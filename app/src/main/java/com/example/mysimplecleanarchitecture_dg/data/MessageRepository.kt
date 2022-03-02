package com.example.mysimplecleanarchitecture_dg.data

import com.example.mysimplecleanarchitecture_dg.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}