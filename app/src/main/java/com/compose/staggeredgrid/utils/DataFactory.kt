package com.compose.staggeredgrid.utils

import androidx.compose.ui.unit.dp
import com.compose.staggeredgrid.GridItem
import kotlin.random.Random

fun getItems(): List<GridItem> {
  val list = listOf(
    "https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__480.jpg",
    "https://cdn.pixabay.com/photo/2015/10/30/20/13/sunrise-1014712__340.jpg",
    "https://i.pinimg.com/236x/fb/03/5a/fb035af587953129b09da33484088c79--red-tree-tree-leaves.jpg",
    "https://cdn.esawebb.org/archives/images/screen/weic2216b.jpg",
    "https://images.news18.com/ibnlive/uploads/2021/07/1627448017_world-nature-conservation-day.png",
    "https://i.pinimg.com/736x/2b/8e/7d/2b8e7d005c611ae7d0468bdc6e0b91bc.jpg",
    "https://images.unsplash.com/photo-1590854690659-5637ffc859e6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDJ8fHxlbnwwfHx8fA%3D%3D&w=1000&q=80",
  )
  val items = (1..50).map {
    GridItem(
      height = Random.nextInt(200, 400).dp, caption = "Caption $it", image = list[it % 7]
    )
  }
  return items
}