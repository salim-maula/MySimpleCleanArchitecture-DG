package com.example.mysimplecleanarchitecture_dg.di

import com.example.mysimplecleanarchitecture_dg.data.IMessageDataSource
import com.example.mysimplecleanarchitecture_dg.data.MessageDataSource
import com.example.mysimplecleanarchitecture_dg.data.MessageRepository
import com.example.mysimplecleanarchitecture_dg.domain.IMessageRepository
import com.example.mysimplecleanarchitecture_dg.domain.MessageInteractor
import com.example.mysimplecleanarchitecture_dg.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}