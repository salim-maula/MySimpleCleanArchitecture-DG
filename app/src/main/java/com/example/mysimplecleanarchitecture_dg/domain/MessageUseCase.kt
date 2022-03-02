package com.example.mysimplecleanarchitecture_dg.domain


/**
 * 1. Buatlah MessageUseCase, kelas ini digunakan sebagai kode induk dari interactor
 */
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}