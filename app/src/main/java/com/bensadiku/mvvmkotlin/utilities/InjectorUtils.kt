package com.bensadiku.mvvmkotlin.utilities

import com.bensadiku.mvvmkotlin.data.FakeDatabase
import com.bensadiku.mvvmkotlin.data.QuoteRepository
import com.bensadiku.mvvmkotlin.ui.quotes.QuotesViewModel
import com.bensadiku.mvvmkotlin.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory():QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}