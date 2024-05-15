package com.testnewturbomodule

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = TestNewTurboModuleModule.NAME)
class TestNewTurboModuleModule(reactContext: ReactApplicationContext) :
  NativeTestNewTurboModuleSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }


  override fun check(): Boolean {
    return true
  }

  companion object {
    const val NAME = "TestNewTurboModule"
  }
}
