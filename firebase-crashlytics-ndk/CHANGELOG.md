# 17.0.0-beta01

This release includes the initial beta release of the Firebase Crashlytics
SDK for NDK crash reporting.

The Firebase Crashlytics SDK for NDK is a new version of the Crashlytics
SDK for NDK crash reporting built _without_ Fabric and instead built entirely on
Firebase. This new SDK has new and improved APIs as well as an artifact name
change. The following release notes describe changes in the new SDK.

 - If you're using Crashlytics for NDK crash reporting in your app for the
 first time, follow the [getting started instructions](/docs/crashlytics/get-started-new-sdk?platform=android).
 - If you're upgrading from the legacy Fabric SDK to the
 Firebase Crashlytics SDK for NDK crash reporting, follow the
 [upgrade instructions](/docs/crashlytics/upgrade-sdk?platform=android)
 to update your app with the following SDK changes.

Note: The following changes are only relevant to Crashlytics NDK users who
are upgrading from the legacy Fabric SDK.

 - [changed] Crashlytics NDK crash reporting will now start automatically
 when the Crashlytics NDK dependency is included in your app.
 - [changed] The Crashlytics Gradle plugin has new tasks to support
 uploading symbol files to Crashlytics servers. See the
 [Crashlytics Gradle plugin documentation](/docs/crashlytics/ndk-reports-new-sdk)
 for more information.