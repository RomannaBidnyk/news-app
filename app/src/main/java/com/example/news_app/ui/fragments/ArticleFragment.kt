package com.example.news_app.ui.fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.news_app.R
import com.example.news_app.ui.NewsActivity
import com.example.news_app.ui.NewsViewModel


class ArticleFragment : Fragment(R.layout.fragment_article) {

    private lateinit var viewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

        val article = args.article
        view.findViewById<WebView>(R.id.webView).apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
        }
    }
}