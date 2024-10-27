package com.bryant.cryptotracker.di

import com.bryant.cryptotracker.core.data.networking.HttpClientFactory
import com.bryant.cryptotracker.crypto.data.networking.RemoteCoinDataSource
import com.bryant.cryptotracker.crypto.domain.util.CoinDataSource
import com.bryant.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}
