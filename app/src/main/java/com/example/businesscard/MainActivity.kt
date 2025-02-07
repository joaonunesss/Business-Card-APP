package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Nome
        Text(
            text = "João Nunes",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        // Cargo
        Text(
            text = "Software Developer",
            fontSize = 20.sp,
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        // Logotipo ou imagem de perfil
        Image(
            painter = painterResource(id = R.drawable.front),
            contentDescription = "João Nunes",
            modifier = Modifier
                .size(100.dp)
                .padding(8.dp)
                .clip(CircleShape)
        )

        // Separador
        Spacer(modifier = Modifier.height(16.dp))

        // Informações de contato
        ContactInfoRow(icon = Icons.Filled.Email, text = "jpmn.mail@gmail.com")
        ContactInfoRow(icon = Icons.Filled.Phone, text = "(+351) 918469571")
        ContactInfoRow(icon = Icons.Filled.LocationOn, text = "Nine, V.N. Famalicão")
        ContactInfoRow(icon = Icons.Filled.AccountBox , text = "linkedin.com/in/jpmnunes")
        ContactInfoRow(icon = Icons.Filled.AccountCircle , text = "github.com/joaonunesss")
        ContactInfoRow(icon = Icons.Filled.Face , text = "http://machineparts.pt/")

        // Idioma
        Text(
            text = "Portuguese",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Composable
fun ContactInfoRow(icon: ImageVector, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = Color.Black
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    MaterialTheme {
        BusinessCard()
    }
}
