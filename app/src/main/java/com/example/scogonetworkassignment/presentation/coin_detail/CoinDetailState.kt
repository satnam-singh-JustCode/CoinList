package com.example.scogonetworkassignment.presentation.coin_detail

import com.example.scogonetworkassignment.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
