package com.compose.staggeredgrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.compose.staggeredgrid.ui.theme.StaggeredGridJetpackComposeTheme
import com.compose.staggeredgrid.utils.getItems

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      StaggeredGridJetpackComposeTheme {
        // A surface container using the 'background' color from the theme
        /**
         * Prepare grid items list
         */
        val items = getItems()
        /**
         *  Call Staggered GridView Composable Items
         */
        StaggeredGridView(items)
      }
    }
  }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun StaggeredGridView(items: List<GridItem>) {
  LazyVerticalStaggeredGrid(
    columns = StaggeredGridCells.Adaptive(150.dp),
    modifier = Modifier.fillMaxSize(),
    contentPadding = PaddingValues(4.dp),
    verticalItemSpacing = 4.dp,
    horizontalArrangement = Arrangement.spacedBy(4.dp),
  ) {
    items(items) { item ->
      GridItem(photoItem = item)
    }
  }
}
