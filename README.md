# CommuniConnect

CommuniConnect is an Android app designed to foster community engagement and information sharing within specific geographical areas. Users within the same pincode can view and contribute to location-based markers, posts, and groups.

## Project Overview

The idea behind CommuniConnect has evolved through different stages:

- Initial Stage: The app aimed to connect users within the same geographical area to view posts, groups, and account information.

- Intermediate Stage: The concept of using pincode-based segregation was introduced to ensure relevant connections and information for users.

- Final Stage: The app includes a map section with "View Markers" and "Mark on Map" features, allowing users within the same pincode to share and access location-based markers. Additionally, there are sections for posts and groups, localized based on pincode.

## Technologies and Libraries Used

- Backend Database: Firebase
- Programming Language: Java
- User Interface: XML
- Maps Integration: Google Maps API
- Animation: Lottie Animation for Splash Screen
- Integrated Development Environment (IDE): Android Studio
## Dependencies

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.airbnb.android:lottie:3.7.0")
    implementation("com.google.firebase:firebase-auth:22.1.1")
    implementation("com.google.firebase:firebase-database:20.2.2")
    implementation("com.google.android.gms:play-services-maps:18.1.0")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

## Features

### Maps Section with "View Markers" and "Mark on Map"

The maps section allows users to interact with a shared map. The "View Markers" feature enables users to see location-based markers created by others within the same community. This feature is crucial as it visually represents incidents, lost items, or relevant information in the vicinity. The "Mark on Map" functionality empowers users to contribute to their community's safety and share important details about specific locations.

### Posts Section

Posts are localized based on pincode to ensure the relevance of information sharing. This design decision enhances the value of community interactions.

### Groups Section

The groups section displays information about other members belonging to the same community. This information exchange fosters connections and enables users to return lost items to fellow community members.

## Design Decisions

1. Geographical Rendering: User details during registration are used to determine content based on the user's pincode, providing localized interactions.

2. "View Markers" and "Mark on Map": These features enhance user engagement and location-awareness, aligning with the app's purpose.

3. Pincode Segregation: Posts and Groups are organized by pincode, ensuring that users interact with localized content.

4. Data Validity: Efforts to prevent fake information entry are in place.


## Installation and Running the App

1.Either download zipfile or clone the repo.
2.Open the folder in a supported IDE(android studio)
3.Project relies on external packages.Go through readme file in github repo to see the dependencies.
4.Open the project’s build files ,such as ‘build.gradle’ file.Ensure that you’ve configured the project’s dependencies according to the instructions provided in README
5.Once the project is successfully synced without any dependency errors.you are ready to start building.





