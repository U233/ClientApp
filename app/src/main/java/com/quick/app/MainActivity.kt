package com.quick.app

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.quick.app.ui.theme.MyAppTheme
import com.quick.app.ui.theme.md_theme_light_primary

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppTheme {
//                Column {
//                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                        Greeting(
//                            name = "Android",
//                            modifier = Modifier.padding(innerPadding)
//                        )
//
//                    }
//
//                }
                MyButton("点击我")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun MyButton(title: String, modifier: Modifier = Modifier) {
    Button(
        onClick = { Log.d("MyButton", "点击了") },
        colors = ButtonDefaults.buttonColors(containerColor = md_theme_light_primary),
        modifier = modifier.fillMaxWidth()
    ) {
        Text(text = title)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAppTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun MyButtonPreview() {
    MyAppTheme {
        MyButton("点击我")
    }
}

