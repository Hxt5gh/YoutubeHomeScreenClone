 package com.example.youtubehomescreenclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import com.example.youtubehomescreenclone.ui.theme.YoutubeHomeScreenCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YoutubeHomeScreenCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    home()
                }
            }
        }
    }
}

 @OptIn(ExperimentalMaterial3Api::class)
 @Composable
 fun home() {
     val scrollState = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
     Scaffold(
         modifier = Modifier.nestedScroll(scrollState.nestedScrollConnection),
         topBar = {
              TopApp(scrollState)
         }
     ) {padding->
         Surface(modifier = Modifier.padding(padding)) {

             Box {
                 LazyColumn(
                     modifier = Modifier.align(Alignment.TopCenter)
                 ){
                     item{
                         Post(
                             thumb = R.drawable.aaa,
                             channelIcon = R.drawable.aaaa ,
                             title = "Brainf**k in 100 Seconds",
                             channelName = "Fireship",
                             views = "7.1M",
                             uploadDate = "2 years ago"
                         )
                     }

                     item{
                         Post(
                             thumb = R.drawable.bbb,
                             channelIcon = R.drawable.bbbb ,
                             title = "Architecture: The UI layer - MAD Skills",
                             channelName = "Android Devlopers",
                             views = "62k",
                             uploadDate = "1 years ago"
                         )
                     }

                     item {
                         Post(
                             thumb = R.drawable.ccc,
                             channelIcon = R.drawable.cccc ,
                             title = "Defeating the Undefeated Gladiator | Gladiator | All Action",
                             channelName = "NIGHT WATCH",
                             views = "45M",
                             uploadDate = "1 year ago"
                         )
                     }

                     item {
                         Post(
                             thumb = R.drawable.ddd,
                             channelIcon = R.drawable.dddd,
                             title =  "Arya Stark Fights Brienne of Tarth | Game of Thrones | Max",
                             channelName =  "Max",
                             views =  "700k",
                             uploadDate = "2 months ago"
                         )
                     }
                 }

                 //bottom
                 Box(
                     modifier = Modifier
                         .fillMaxWidth()
                         .align(Alignment.BottomCenter)
                 ){
                     BottomApp()
                 }
             }
         }
     }
 }

 @Preview(showBackground = true)
 @Composable
 fun homePrev() {
    home()
 }

