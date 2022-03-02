package com.example.mysimplecleanarchitecture_dg.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}