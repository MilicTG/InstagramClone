package com.delminiusdevs.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.hilt.navigation.compose.hiltViewModel
import com.delminiusdevs.instagramclone.view_model.IgViewModel
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.delminiusdevs.instagramclone.ui.theme.InstagramCloneTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    InstagramApp()
                }
            }
        }
    }
}

@Composable
fun InstagramApp(){
    val vm = hiltViewModel<IgViewModel>()

}