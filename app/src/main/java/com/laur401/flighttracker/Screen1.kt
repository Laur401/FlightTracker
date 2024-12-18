package com.laur401.flighttracker

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun Screen1(navController: NavHostController){
    Column(modifier = Modifier.padding(16.dp), verticalArrangement= Arrangement.spacedBy(16.dp)){
        DestinationsProgressCard(Modifier.fillMaxWidth())
        DepartureArrivalRow(Modifier.fillMaxWidth())
        TimeStatusCard(modifier=Modifier.fillMaxWidth())
        MiscInformationCard(modifier=Modifier.fillMaxWidth())
        Button(onClick = { navController.navigate("screen2") },modifier=Modifier.fillMaxWidth()) { Text("Ticket") }
    }
}

@Preview(showBackground=true, showSystemUi = true, device="spec:width=1280dp,height=800dp,dpi=240")
@Composable
fun PreviewScreen1(){
    val navController = rememberNavController()
    Screen1(navController)
}

@Preview(showBackground = true)
@Composable
fun DestinationsProgressCard(modifier: Modifier = Modifier){
    Card(modifier=modifier.width(IntrinsicSize.Min)){
        Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)){
            Row(horizontalArrangement=Arrangement.spacedBy(16.dp)){
                Column(modifier=Modifier.weight(1f)){
                    Text("FRA", style = MaterialTheme.typography.displayMedium)
                    Text("Frankfurt", style = MaterialTheme.typography.titleLarge)
                }
                Column(modifier=Modifier.weight(1f), horizontalAlignment = Alignment.End){
                    Text("VNO",style = MaterialTheme.typography.displayMedium)
                    Text("Vilnius",style = MaterialTheme.typography.titleLarge)
                }
            }
            LinearProgressIndicator(progress={0.5f},modifier=Modifier.fillMaxWidth())
        }
    }

}

@Preview(showBackground=true)
@Composable
fun DepartureCard(modifier: Modifier = Modifier){
    Card(modifier=modifier.width(IntrinsicSize.Min)){
        Column(modifier=Modifier.padding(16.dp).fillMaxWidth()){
            Text("12:34",style = MaterialTheme.typography.displaySmall,modifier=Modifier.width(IntrinsicSize.Max))
            Text("Departure",style=MaterialTheme.typography.titleMedium)
        }
    }
}

@Preview(showBackground=true)
@Composable
fun ArrivalCard(modifier: Modifier = Modifier){
    Card(modifier=modifier.width(IntrinsicSize.Min)){
        Column(modifier=Modifier.padding(16.dp).fillMaxWidth(), horizontalAlignment = Alignment.End){
            Text("14:56", style = MaterialTheme.typography.displaySmall,modifier=Modifier.width(IntrinsicSize.Max))
            Text("Arrival", style = MaterialTheme.typography.titleMedium)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DepartureArrivalRow(modifier: Modifier = Modifier){
    Row(modifier=modifier.width(IntrinsicSize.Min),horizontalArrangement = Arrangement.spacedBy(16.dp)){
        DepartureCard(Modifier.weight(1f))
        ArrivalCard(Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun TimeStatusCard(modifier: Modifier = Modifier){
    Card(modifier=modifier){
        Box(modifier=Modifier.padding(16.dp).fillMaxWidth(),contentAlignment=Alignment.Center){
            Text("On Time", style=MaterialTheme.typography.titleLarge)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MiscInformationCard(modifier: Modifier = Modifier){
    Card(modifier=modifier.width(IntrinsicSize.Min)){
        Column(modifier=Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)){
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
                Column(modifier=Modifier.weight(1f)){
                    Text("Gate",style=MaterialTheme.typography.titleMedium)
                    Text("4",style=MaterialTheme.typography.titleLarge)
                }
                Column(modifier=Modifier.weight(1f)){
                    Text("Board at",style=MaterialTheme.typography.titleMedium,modifier=Modifier.width(IntrinsicSize.Max))
                    Text("Front",style=MaterialTheme.typography.titleLarge)
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
                Column(modifier=Modifier.weight(1f)){
                    Text("Seat",style=MaterialTheme.typography.titleMedium)
                    Text("A13",style=MaterialTheme.typography.titleLarge)
                }
                Column(modifier=Modifier.weight(1f)){
                    Text("Flight code",style=MaterialTheme.typography.titleMedium,modifier=Modifier.width(IntrinsicSize.Max))
                    Text("FR9356",style=MaterialTheme.typography.titleLarge)
                }
            }
        }
    }
}