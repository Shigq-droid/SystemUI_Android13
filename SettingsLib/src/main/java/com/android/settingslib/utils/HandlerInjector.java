/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settingslib.utils;

import android.os.Handler;

/**
 * Wrapper the {@link Handler} for testing compatibility.
 */
public class HandlerInjector {

    protected final Handler mHandler;

    public HandlerInjector(Handler handler) {
        mHandler = handler;
    }

    /**  Wrapper the {@link Handler#postDelayed} for testing compatibility. */
    public void postDelayed(Runnable runnable, long delayMillis) {
        mHandler.postDelayed(runnable, delayMillis);
    }

    /**  Wrapper the {@link Handler#removeCallbacks} for testing compatibility. */
    public void removeCallbacks(Runnable runnable) {
        mHandler.removeCallbacks(runnable);
    }
}
