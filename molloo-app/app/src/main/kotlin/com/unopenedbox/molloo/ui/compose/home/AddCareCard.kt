@file:OptIn(ExperimentalMaterial3Api::class)
package com.unopenedbox.molloo.ui.compose.home

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.unopenedbox.molloo.R



@Composable
fun AddCareCard(modifier: Modifier = Modifier, isOutline:Boolean = true, onClick:() -> Unit = {}) {
  val drawColumn:@Composable ColumnScope.() -> Unit = {
    Row(
      verticalAlignment = Alignment.CenterVertically,
      modifier = modifier
        .fillMaxWidth()
        .padding(all = 20.dp),
    ) {
      Icon(
        painter = painterResource(id = R.drawable.ic_dental),
        contentDescription = "Dental Icon",
        tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.87f),
        modifier = Modifier.size(80.dp),
      )
      Column(
        modifier = Modifier.padding(start = 20.dp),
      ) {
        Text(
          text = stringResource(id = R.string.card_care_title),
          style = MaterialTheme.typography.titleLarge,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
          text = stringResource(id = R.string.card_care_description),
          style = MaterialTheme.typography.bodyMedium,
        )
      }
    }
  }
  if (isOutline) {
    OutlinedCard(
      modifier = modifier,
      onClick = {
        onClick()
      },
    ) {
      drawColumn()
    }
  } else {
    ElevatedCard(
      modifier = modifier,
      onClick = {
        onClick()
      },
    ) {
      drawColumn()
    }
  }
}

@Preview(showBackground = true)
@Composable
fun AddCareCardPreview() {
  AddCareCard()
}