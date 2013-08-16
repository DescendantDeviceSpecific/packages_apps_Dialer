/*
 * Copyright (C) 2013 The Android Open Source Project
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
 * limitations under the License
 */

package com.android.incallui.service;

/**
 *
 */
public interface PhoneNumberService {
    public void getPhoneNumberInfo(String phoneNumber, PhoneNumberServiceListener listener);

    public interface PhoneNumberServiceListener {

        /**
         * Callback when a phone number has been looked up.
         *
         * @param info The looked up information.  Or (@literal null} if there are no results.
         */
        public void onPhoneNumberInfoComplete(PhoneNumberInfo info);
    }

    public interface PhoneNumberInfo {
        public String getName();
        public String getPhoneNumber();
        public String getImageUrl();
    }
}
