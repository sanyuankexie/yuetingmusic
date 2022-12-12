package com.wilinz.yuetingmusic.util

import android.content.Context
import androidx.annotation.StringRes
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import java.lang.ref.WeakReference

private var toast: WeakReference<Toast>? = null

@JvmOverloads
fun toast(context: Context, @StringRes resId: Int, duration: Int = LENGTH_SHORT) {
    toast(context, context.getString(resId), duration)
}

@JvmOverloads
fun toast(context: Context, text: String, duration: Int = LENGTH_SHORT) {
    toast?.get()?.cancel()//取消之前的toast
    toast = WeakReference(Toast.makeText(context.applicationContext, text, duration))//创建新toast
    toast?.get()?.show()
}