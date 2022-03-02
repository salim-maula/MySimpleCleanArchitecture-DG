package com.example.mysimplecleanarchitecture_dg.data

import com.example.mysimplecleanarchitecture_dg.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}