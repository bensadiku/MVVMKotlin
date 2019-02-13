package com.bensadiku.mvvmkotlin.ui.quotes

import androidx.lifecycle.ViewModel
import com.bensadiku.mvvmkotlin.data.Quote
import com.bensadiku.mvvmkotlin.data.QuoteRepository

class QuotesViewModel (private  val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuotes(quote: Quote) =  quoteRepository.addQuote(quote)
}