package life.flickflip.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import life.flickflip.R

@Composable
fun MovieCard() {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        modifier = Modifier.wrapContentWidth(),
    ) {
        Column() {
            Image(
                painter = painterResource(R.drawable.poster1),
                contentDescription = "선택1",
                contentScale = ContentScale.FillHeight,
                alignment = Alignment.TopStart,
                modifier = Modifier
                    .height(200.dp)
                    .clip(shape = RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
            )
            Text(text = "웬즈데이", modifier = Modifier.padding(16.dp))
        }

    }
}