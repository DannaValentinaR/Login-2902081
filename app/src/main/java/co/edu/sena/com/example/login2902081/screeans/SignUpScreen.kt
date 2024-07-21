package co.edu.sena.com.example.login2902081.screeans

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.com.example.login2902081.R
import co.edu.sena.com.example.login2902081.components.HeadingTextComponent
import co.edu.sena.com.example.login2902081.components.MyTextFieldComponent
import co.edu.sena.com.example.login2902081.components.NormalTextComponent

@Composable
fun SignUpScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {

        }
        NormalTextComponent(value = stringResource(id = R.string.hello))
        HeadingTextComponent(value = stringResource(id = R.string.create_account))

        MyTextFieldComponent(labelValue = stringResource(id = R.string.first.name))
    }
}//SignUpScreen

@Preview
@Composable
fun SingUpScreenPreview() {
    SignUpScreen()
}