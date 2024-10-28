package com.bryant.cryptotracker.crypto.presentation.coin_list

import com.bryant.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}
