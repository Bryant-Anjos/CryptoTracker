package com.bryant.cryptotracker.crypto.data.networking

import com.bryant.cryptotracker.core.data.networking.constructUrl
import com.bryant.cryptotracker.core.data.networking.safeCall
import com.bryant.cryptotracker.core.domain.util.NetworkError
import com.bryant.cryptotracker.core.domain.util.Result
import com.bryant.cryptotracker.core.domain.util.map
import com.bryant.cryptotracker.crypto.data.networking.dto.CoinsResponseDto
import com.bryant.cryptotracker.crypto.data.toCoin
import com.bryant.cryptotracker.crypto.domain.Coin
import com.bryant.cryptotracker.crypto.domain.util.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(
    private val httpClient: HttpClient,
): CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
         return safeCall<CoinsResponseDto> {
             httpClient.get(
                 urlString = constructUrl("/assets")
             )
         }.map { response ->
             response.data.map { it.toCoin() }
         }
    }
}
