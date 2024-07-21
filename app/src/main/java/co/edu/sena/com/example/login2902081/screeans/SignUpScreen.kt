package co.edu.sena.com.example.login2902081.screeans

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import co.edu.sena.com.example.login2902081.R
import co.edu.sena.com.example.login2902081.components.NormalTextComponent

@Composable
fun SignUpScreen() {

    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        NormalTextComponent(value = stringResource(id = R.string.hello))
    }
}//SignUpScreen

@Preview
@Composable
fun SingUpScreenPreview() {
    SignUpScreen()
}