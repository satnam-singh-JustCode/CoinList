package com.example.scogonetworkassignment.data.repository

import com.example.scogonetworkassignment.data.remote.CoinPaprikaApi
import com.example.scogonetworkassignment.data.remote.dto.CoinDetailDto
import com.example.scogonetworkassignment.data.remote.dto.CoinDto
import com.example.scogonetworkassignment.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}