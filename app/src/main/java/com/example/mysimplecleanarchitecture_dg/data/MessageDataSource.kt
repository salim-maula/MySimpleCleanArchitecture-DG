package com.example.mysimplecleanarchitecture_dg.data

import com.example.mysimplecleanarchitecture_dg.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}