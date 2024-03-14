package com.example.tam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tam.ui.theme.TamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TamTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Dekstop(
                        message = "Home"
                    )
                }
            }
        }
    }
}

@Composable
fun Dekstop(message: String) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.a),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = "11.01",
                    fontSize = 58.sp,
                    lineHeight = 116.sp,
                    fontWeight = FontWeight(300),
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
                Text(
                    text = "Kam, 7 Mar\n Mendung 19°C ",
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(80.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF36494D).copy(alpha = 0.9f), shape = CircleShape)
                        .padding(7.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.google),
                            contentDescription = "google",
                            modifier = Modifier.size(35.dp),
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Image(
                            painter = painterResource(id = R.drawable.microfon),
                            contentDescription = "microfon",
                            modifier = Modifier.size(35.dp),
                        )
                        Image(
                            painter = painterResource(id = R.drawable.lens),
                            contentDescription = "lens",
                            modifier = Modifier.size(35.dp),
                        )
                    }
                }
                Spacer(modifier = Modifier.height(40.dp))
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(Color(0xFF373B3E))
                    ) {
                        Image(
                            modifier = Modifier
                                .size(55.dp)
                                .padding(10.dp),
                            painter = painterResource(id = R.drawable.wa),
                            contentDescription = "waecek",
                        )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.dana1),
                                contentDescription = "dana",
                                modifier = Modifier
                                    .size(48.dp)
                                    .background(
                                        Color(0xFF108ee9),
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .padding(5.dp, 2.dp)
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            Text(
                                "DANA",
                                style = TextStyle(fontSize = 10.sp),
                                color = Color.White
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.jam1),
                                contentDescription = "jam",
                                modifier = Modifier
                                    .size(48.dp)
                                    .background(
                                        Color(0xFF131639),
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .padding(5.dp, 2.dp)
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            Text("Jam", style = TextStyle(fontSize = 10.sp), color = Color.White)
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.appmarket),
                                contentDescription = "appmarket",
                                modifier = Modifier
                                    .size(48.dp)
                                    .background(
                                        Color(0xFF97c024),
                                        shape = RoundedCornerShape(10.dp)
                                    )
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            Text(
                                "App Market",
                                style = TextStyle(fontSize = 10.sp),
                                color = Color.White
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.telkomsel),
                                contentDescription = "mytelkomsel",
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(RoundedCornerShape(10.dp))
//                                    .background(
//                                        Color(0xFFFFFFFF),
//                                        shape = RoundedCornerShape(10.dp)
//                                    )
//                                    .padding(5.dp, 2.dp)
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            Text(
                                "MyTelko...",
                                style = TextStyle(fontSize = 10.sp),
                                color = Color.White
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.camscanner),
                                contentDescription = "camscanner",
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(RoundedCornerShape(10.dp))
//                                    .background(
//                                        Color(0xFFFFFFFF),
//                                        shape = RoundedCornerShape(10.dp)
//                                    )
//                                    .padding(5.dp, 2.dp)
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            Text(
                                "CamScan...",
                                style = TextStyle(fontSize = 10.sp),
                                color = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(23.dp))
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.brimo),
                                contentDescription = "brimo",
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(RoundedCornerShape(10.dp))
//                                    .background(
//                                        Color(0xFFFFFFFF),
//                                        shape = RoundedCornerShape(10.dp)
//                                    )
//                                    .padding(5.dp, 2.dp)
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            Text(
                                "BRImo",
                                style = TextStyle(fontSize = 10.sp),
                                color = Color.White
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.playstore),
                                contentDescription = "playstore",
                                modifier = Modifier
                                    .size(48.dp)
                                    .background(
                                        Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .padding(7.dp, 2.dp)
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            Text("Play Store", style = TextStyle(fontSize = 10.sp), color = Color.White)
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.gmail),
                                contentDescription = "gmail",
                                modifier = Modifier
                                    .size(48.dp)
                                    .background(
                                        Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .padding(5.dp, 2.dp)
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            Text(
                                "Gmail",
                                style = TextStyle(fontSize = 10.sp),
                                color = Color.White
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.spotify),
                                contentDescription = "spotify",
                                modifier = Modifier
                                    .size(48.dp)
                                    .background(
                                        Color(0xFF000000),
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .padding(5.dp, 2.dp)
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            Text(
                                "Spotify",
                                style = TextStyle(fontSize = 10.sp),
                                color = Color.White
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.flashscore),
                                contentDescription = "flashscore",
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(RoundedCornerShape(10.dp))
//                                    .background(
//                                        Color(0xFFFFFFFF),
//                                        shape = RoundedCornerShape(10.dp)
//                                    )
//                                    .padding(5.dp, 2.dp)
                            )
                            Spacer(modifier = Modifier.height(7.dp))
                            Text(
                                "Flashscore",
                                style = TextStyle(fontSize = 10.sp),
                                color = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(28.dp))
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier.size(30.dp)
                    ) {
                        Image(
                            modifier = Modifier.size(20.dp),
                            painter = painterResource(id = R.drawable.atas),
                            contentDescription = "atas",
                        )
                    }
                }
                Spacer(modifier = Modifier.height(17.dp))
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.wa1),
                            contentDescription = "wa1",
                            modifier = Modifier.size(48.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )

                        Image(
                            painter = painterResource(id = R.drawable.pesan),
                            contentDescription = "pesan",
                            modifier = Modifier.size(48.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                        Image(
                            painter = painterResource(id = R.drawable.phone),
                            contentDescription = "phone",
                            modifier = Modifier.size(48.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Image(
                            painter = painterResource(id = R.drawable.galeri),
                            contentDescription = "galeri",
                            modifier = Modifier
                                .size(48.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Image(
                            painter = painterResource(id = R.drawable.camera1),
                            contentDescription = "camera",
                            modifier = Modifier
                                .size(48.dp)
                                .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(10.dp))
                                .padding(8.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    TamTheme {
        Dekstop(message = "Home")
    }
}