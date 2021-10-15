package org.techtown.test

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "a76b3d1716bf18b3693f62c7ff0ee877")
    }
}