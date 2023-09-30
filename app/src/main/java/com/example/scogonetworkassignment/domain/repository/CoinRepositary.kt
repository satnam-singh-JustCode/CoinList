package com.example.scogonetworkassignment.domain.repository

import com.example.scogonetworkassignment.data.remote.dto.CoinDetailDto
import com.example.scogonetworkassignment.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}