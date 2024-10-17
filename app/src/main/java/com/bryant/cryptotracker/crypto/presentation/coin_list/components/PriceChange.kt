package com.bryant.cryptotracker.crypto.presentation.coin_list.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.bryant.cryptotracker.crypto.presentation.models.DisplayableNumber
import com.bryant.cryptotracker.ui.theme.CryptoTrackerTheme

@Composable
fun PriceChange(
    change: DisplayableNumber,
    modifier: Modifier = Modifier,
) {

}

@PreviewLightDark
@Composable
private fun PriceChangePreview(modifier: Modifier = Modifier) {
    CryptoTrackerTheme {

    }
}
