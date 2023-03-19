package com.compose.staggeredgrid

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun GridItem(photoItem: GridItem) {
  Card(
    modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(8.dp), elevation = 4.dp
  ) {
    /**
     *  Create box for display grid item
     */
    Box(
      modifier = Modifier
        .height(photoItem.height)
        .fillMaxWidth()
    ) {
      /**
       *  load image from server
       */
      AsyncImage(
        model = photoItem.image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
          .fillMaxWidth()
          .fillMaxHeight()
      )
      Box(
        modifier = Modifier
          .fillMaxSize()
          .background(
            Brush.verticalGradient(
              colors = listOf(Color.Transparent, Color.Black),
              startY = 300f,
            )
          )
      ) {
        /**
         *  Text over the image
         */
        Text(
          modifier = Modifier
            .align(alignment = Alignment.BottomStart)
            .padding(8.dp),
          text = photoItem.caption,
          color = Color.White,
          fontSize = 16.sp,
        )
      }
    }
  }
}