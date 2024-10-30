package com.example.userinput

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Preview(showBackground = true)
@Composable
fun LatihanInput(modifier: Modifier = Modifier) {
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var noHp by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    var textNama by remember { mutableStateOf("") }
    var textEmail by remember { mutableStateOf("") }
    var textNoHp by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }

    var jenisK by remember { mutableStateOf("") }
    var textJenisK by remember { mutableStateOf("") }

    val textJK = listOf("Laki - Laki", "Perempuan")

    Column (modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Biodata",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp)
        Spacer(modifier = Modifier.padding(20.dp))

        TextField(
            value = nama,
            onValueChange = {nama = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("Nama")
            },
            placeholder = {
                Text("Masukkan nama anda")
            }
        )
        Spacer(modifier = Modifier.padding(5.dp))

        Row (){
            textJK.forEach{selectedJK ->
            Row {
                RadioButton(
                selected = jenisK == selectedJK,
                    onClick = {
                        jenisK = selectedJK
                    })
            }
            Text(selectedJK)
                }
            }
        }

        TextField(
            value = email,
            onValueChange = {email = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("Nama")
            },
            placeholder = {
                Text("Masukkan nama anda")
            }
        )
        Spacer(modifier = Modifier.padding(5.dp))

        TextField(
            value = nama,
            onValueChange = {nama = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("Nama")
            },
            placeholder = {
                Text("Masukkan nama anda")
            }
        )
        Spacer(modifier = Modifier.padding(5.dp))

        TextField(
            value = nama,
            onValueChange = {nama = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("Nama")
            },
            placeholder = {
                Text("Masukkan nama anda")
            }
        )
        Spacer(modifier = Modifier.padding(5.dp))

        Button(onClick = {
            textNama = nama
            textJenisK = jenisK
            textEmail = email
            textNoHp = noHp
            textAlamat = alamat
                         },modifier = Modifier.padding(vertical = 10.dp)) {
            Text(text = "Submit")
        }
        Card (modifier = Modifier.fillMaxWidth().padding(16.dp)){
            Column (){
                TampilData(
                    Judul = "Nama",
                    Isinya = textNama
                )
                TampilData(
                    Judul = "Email",
                    Isinya = textEmail
                )
                TampilData(
                    Judul = "No hp",
                    Isinya = textNoHp
                )
                TampilData(
                    Judul = "Alamat",
                    Isinya = textAlamat
                )
            }

        }
    }


@Composable
fun TampilData(
    Judul:String,
    Isinya:String
){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween){
        Text(text = Judul, modifier = Modifier.weight(0.8f))
        Text(text = ":", modifier = Modifier.weight(0.2f))
        Text(text = Isinya, modifier = Modifier.weight(2f))

     }
}