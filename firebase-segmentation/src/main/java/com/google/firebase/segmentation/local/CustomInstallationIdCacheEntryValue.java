// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.firebase.segmentation.local;

import com.google.auto.value.AutoValue;
import com.google.firebase.segmentation.local.CustomInstallationIdCache.CacheStatus;

/**
 * This class represents a cache entry value in {@link CustomInstallationIdCache}, which contains a
 * Firebase instance id, a custom installation id and the cache status of this entry.
 */
@AutoValue
public abstract class CustomInstallationIdCacheEntryValue {
  public abstract String getCustomInstallationId();

  public abstract String getFirebaseInstanceId();

  public abstract CacheStatus getCacheStatus();

  public static CustomInstallationIdCacheEntryValue create(
      String customInstallationId, String firebaseInstanceId, CacheStatus cacheStatus) {
    return new AutoValue_CustomInstallationIdCacheEntryValue(
        customInstallationId, firebaseInstanceId, cacheStatus);
  }
}
