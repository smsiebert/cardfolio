package com.cs407.cardfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import com.cs407.cardfolio.ui.theme.CardfolioTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardfolioTheme {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text (
                        text = stringResource(id = R.string.app_name),
                        style = MaterialTheme.typography.headlineLarge,
                        modifier = Modifier.padding(top = 16.dp, bottom = 24.dp)
                    )
                    Cardfolio()
                }
            }
        }
    }
}

@Composable
fun Cardfolio () {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CardfolioTheme {
        Cardfolio()
    }
}