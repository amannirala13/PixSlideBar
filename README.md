# PixSlideBar  [![](ic_small.png)](https://github.com/amannirala13/PixSlideBar) 
This library provides a modern and smooth slider bar style button which you can use in your Android app. The user needs to slide the button to the end to perform a particular action in your your Android app.

**Latest Release:**  [![](https://jitpack.io/v/amannirala13/PixSlideBar.svg)](https://jitpack.io/#amannirala13/PixSlideBar)

# How to use?

I tried to make this library very userfriendly and flixiable. To use this library you need to first include it in your project. You cant do it via *JitPack* or *Jcenter*

## JitPack

Add this lines in your gradle files

- **build.gradle (Project level)**

  ` allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    } `
- **build.gradel (App level)**

  `dependencies {
	        implementation 'com.github.amannirala13:PixSlideBar:{Latest_version}'
	}`
  
## Jcenter

Add the dependency to **build.gradle (App Level)** of your project

`implementation 'com.amannirala13.pixslidebar:PixSlideBar:{Latest_version}'`

---
## Add to XML
Once imported, add the slidebar to your UI as follows:

` <com.amannirala13.pixslidebar.PixSlideBar
        android:id="@+id/my_slide_bar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:message="@string/app_name"
        />`
