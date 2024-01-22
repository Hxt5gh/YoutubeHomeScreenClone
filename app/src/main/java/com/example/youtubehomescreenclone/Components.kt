package com.example.youtubehomescreenclone

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopApp(scrollState: TopAppBarScrollBehavior) {


    Column(modifier = Modifier.nestedScroll(scrollState.nestedScrollConnection)) {
        TopAppBar(
            title = {
                Image(
                    modifier = Modifier
                        .fillMaxWidth(.4f),
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo"
                )
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Color.Black
            ),
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.screen_cast),
                        contentDescription = "screenCast" ,
                        tint = Color.White
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.outline_notifications_none_24),
                        contentDescription = "screenCast" ,
                        tint = Color.White
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.outline_search_24),
                        contentDescription = "screenCast" ,
                        tint = Color.White
                    )
                }
            },
            scrollBehavior = scrollState
        )

        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(5.dp)
        ){
                item {
                    ElevatedFilterChip(
                        selected = false,
                        onClick = { /*TODO*/ },
                        label = { Text(text = "") },
                        leadingIcon = {
                            Icon(painter = painterResource(id = R.drawable.baseline_explore_24),
                                contentDescription = "Explore",
                                tint = Color.White
                            )
                        },
                        colors = FilterChipDefaults.elevatedFilterChipColors(
                            containerColor = Color.DarkGray ,
                            labelColor = Color.White
                        )
                    )
                }

            item {
                ElevatedFilterChip(
                    modifier = Modifier.padding(start = 5.dp),
                    selected = true,
                    onClick = { /*TODO*/ },
                    label = { Text(text = "All") },
                    colors = FilterChipDefaults.elevatedFilterChipColors(
                        containerColor = Color.DarkGray ,
                        labelColor = Color.White,
                        selectedLabelColor = Color.Black,
                        selectedContainerColor = Color.White
                    )
                )
            }

            item {
                ElevatedFilterChip(
                    modifier = Modifier.padding(start = 5.dp),
                    selected = false,
                    onClick = { /*TODO*/ },
                    label = { Text(text = "Gaming") },
                    colors = FilterChipDefaults.elevatedFilterChipColors(
                        containerColor = Color.DarkGray ,
                        labelColor = Color.White
                    )
                )
            }

            item {
                ElevatedFilterChip(
                    modifier = Modifier.padding(start = 5.dp),
                    selected = false,
                    onClick = { /*TODO*/ },
                    label = { Text(text = "Live") },
                    colors = FilterChipDefaults.elevatedFilterChipColors(
                        containerColor = Color.DarkGray ,
                        labelColor = Color.White
                    )
                )
            }
            item {
                ElevatedFilterChip(
                    modifier = Modifier.padding(start = 5.dp),
                    selected = false,
                    onClick = { /*TODO*/ },
                    label = { Text(text = "Programming") },
                    colors = FilterChipDefaults.elevatedFilterChipColors(
                        containerColor = Color.DarkGray ,
                        labelColor = Color.White
                    )
                )
            }

            item {
                ElevatedFilterChip(
                    modifier = Modifier.padding(start = 5.dp),
                    selected = false,
                    onClick = { /*TODO*/ },
                    label = { Text(text = "Games") },
                    colors = FilterChipDefaults.elevatedFilterChipColors(
                        containerColor = Color.DarkGray ,
                        labelColor = Color.White
                    )
                )
            }

            item {
                ElevatedFilterChip(
                    modifier = Modifier.padding(start = 5.dp),
                    selected = false,
                    onClick = { /*TODO*/ },
                    label = { Text(text = "Stocks") },
                    colors = FilterChipDefaults.elevatedFilterChipColors(
                        containerColor = Color.DarkGray ,
                        labelColor = Color.White
                    )
                )
            }



        }
    }

}



@Preview(showBackground = true)
@Composable
fun TopAppPrev() {
   // TopApp(scrollState = rememberScrollState())
}


@Composable
fun Post(
    @DrawableRes thumb : Int ,
    @DrawableRes channelIcon : Int,
    title : String ,
    channelName :String ,
    views : String ,
    uploadDate : String
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Image(modifier  = Modifier
            .fillMaxWidth()
            .height(215.dp),
            painter = painterResource(id = thumb),
            contentDescription ="thumbname",
            contentScale = ContentScale.Crop
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(start = 8.dp, top = 20.dp, end = 5.dp, bottom = 20.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape),
                painter = painterResource(id = channelIcon) ,
                contentDescription = "channelicon",
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "${title}" ,
                    fontSize = 16.sp ,
                    fontWeight = FontWeight.Bold ,
                    color = Color.White ,
                    maxLines = 2)
                Text(text = "${channelName} · ${views} · ${uploadDate}" ,
                    fontWeight = FontWeight.Light ,
                    fontSize = 14.sp ,
                    color = Color.White)
            }

            Icon(
                painter = painterResource(id = R.drawable.baseline_more_vert_24) ,
                contentDescription ="more" ,
                tint = Color.White
            )
        }
    }
}


//@Preview(showBackground = true)
@Composable
fun PostPrev() {
        Post(
            thumb = R.drawable.aaa,
            channelIcon = R.drawable.aaaa,
            title = "Brainf**k in 100 Seconds",
            channelName = "Fireship",
            views = "7.1M",
            uploadDate = "2 year ago" )
}


@Composable
fun BottomApp() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(Color.Black),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Column {
                Icon(modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.baseline_home_24),
                    contentDescription = "home",
                    tint = Color.White
                    )
                Text(
                    text = "Home",
                    fontSize = 12.sp ,
                    color = Color.White
                )
            }
        }

        IconButton(onClick = { /*TODO*/ }) {
            Column {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.shots),
                    contentDescription = "Shots",
                    tint = Color.White
                )
                Text(
                    text = "Home",
                    fontSize = 12.sp ,
                    color = Color.White
                )
            }
        }

        IconButton(onClick = { /*TODO*/ }) {
            Column {
                Icon(
                    modifier = Modifier.size(84.dp),
                    painter = painterResource(id = R.drawable.outline_add_circle_outline_24),
                    contentDescription = "",
                    tint = Color.White
                )
                Text(
                    text = "Home",
                    fontSize = 12.sp ,
                    color = Color.White
                )
            }
        }

        IconButton(onClick = { /*TODO*/ }) {
            Column {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.outline_subscriptions_24),
                    contentDescription = "Subscriptions",
                    tint = Color.White
                )
                Text(
                    text = "Home",
                    fontSize = 12.sp ,
                    color = Color.White
                )
            }
        }

        IconButton(onClick = { /*TODO*/ }) {
            Column {
               Image(
                   modifier = Modifier
                       .size(24.dp)
                       .clip(CircleShape),
                   painter = painterResource(id = R.drawable.cap) ,
                   contentDescription = "",
                   contentScale = ContentScale.Crop
                   )
                Text(
                    text = "You",
                    fontSize = 12.sp ,
                    color = Color.White
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun BottomAppPrev() {
        BottomApp()
}