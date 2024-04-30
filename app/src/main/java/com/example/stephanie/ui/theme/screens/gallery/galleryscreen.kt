package com.example.stephanie.ui.theme.screens.gallery

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stephanie.R


@Composable
fun galleryScreen() {
    Column (horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "please log in here")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Go to Home screen")

        }
        Box(modifier = Modifier.fillMaxWidth()){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "background image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
        }

    }
}
@Preview
@Composable
fun galleryScreenPreview(){
    galleryScreen()

}