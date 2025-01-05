package com.project.shoppingmall

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import coil3.load
import coil3.request.crossfade
import java.text.NumberFormat
import java.util.Locale

@BindingAdapter("visible")
fun View.setVisible(isShow: Boolean) {
    isVisible = isShow
}

@BindingAdapter("imageUrl")
fun ImageView.setImage(imageUrl: String?) {
    load(imageUrl) {
        crossfade(300)
    }
}

@BindingAdapter("moneyText")
fun TextView.setMoneyText(money: Long?) {
    text = NumberFormat.getInstance(Locale.KOREA).format(money ?: 0) + "원"
}