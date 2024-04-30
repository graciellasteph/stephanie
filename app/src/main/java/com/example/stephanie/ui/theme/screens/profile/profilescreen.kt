package com.example.stephanie.ui.theme.screens.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    Column (horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "please log in here")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Go to Login screen")

        }

    }
}
@Preview
@Composable
fun ProfileScreenPreview(){
    ProfileScreen()

}