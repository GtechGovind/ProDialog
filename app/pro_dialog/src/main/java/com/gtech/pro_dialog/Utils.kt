package com.gtech.pro_dialog

import android.view.View
import androidx.core.view.isVisible

fun View.show() {
    this.isVisible = true
}

fun View.hide() {
    this.isVisible = false
}