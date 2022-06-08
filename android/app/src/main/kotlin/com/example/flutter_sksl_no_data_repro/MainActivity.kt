package com.example.flutter_sksl_no_data_repro

import android.content.Context
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache

class MainActivity: FlutterActivity() {
  // Siplified provideFlutterEngine implementation of `audio_service` plugin's AudioServiceActivity
  // See https://github.com/ryanheise/audio_service/blob/c7b94fdb156c605fdccc479f8bc9351bacfd876b/audio_service/android/src/main/java/com/ryanheise/audioservice/AudioServiceActivity.java#L12
  override fun provideFlutterEngine(context: Context): FlutterEngine {
    var flutterEngine = FlutterEngineCache.getInstance().get("test");
    if (flutterEngine == null) {
      flutterEngine = FlutterEngine(context.getApplicationContext());
      FlutterEngineCache.getInstance().put("test", flutterEngine);
    }
    return flutterEngine;
  }
}
