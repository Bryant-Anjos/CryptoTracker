package com.bryant.cryptotracker.crypto.domain.util

import com.bryant.cryptotracker.core.domain.util.NetworkError
import com.bryant.cryptotracker.core.domain.util.Result
import com.bryant.cryptotracker.crypto.domain.Coin

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}
