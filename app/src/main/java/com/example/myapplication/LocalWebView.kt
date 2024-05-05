package com.example.myapplication

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.Modifier

@Composable
fun LocalWebView(url: String) {
    AndroidView(factory = { context ->
        WebView(context).apply {
            webViewClient = WebViewClient()
            // 允许JavaScript
            settings.javaScriptEnabled = true
            loadUrl(url)
        }
    }, modifier = Modifier.fillMaxSize())
}

@Preview
@Composable
fun LocalWebViewPreview() {
    LocalWebView("https://www.baidu.com")
}