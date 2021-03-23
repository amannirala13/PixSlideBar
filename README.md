# PixSlideBar  [![](ic_small.png)](https://github.com/amannirala13/PixSlideBar) 
This library provides a modern and smooth slider bar style button that you can use in your Android app. The user needs to slide the button to the end to perform a particular action in your Android app.

**Latest Release:**  [![](https://jitpack.io/v/amannirala13/PixSlideBar.svg)](https://jitpack.io/#amannirala13/PixSlideBar)

# How to use?

I tried to make this library very userfriendly and flixiable. To use this library you need to first include it in your project. You cant do it via *JitPack* or *Jcenter*

## JitPack

Add this lines in your gradle files

- **build.gradel (App level)**
  ```gradle
  allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    } ```
- **build.gradel (App level)**
```gradle
  dependencies {
	        implementation 'com.github.amannirala13:PixSlideBar:{Latest_version}'
	} 
```

## Jcenter

Add the dependency to **build.gradle (App Level)** of your project

```gradle
implementation 'com.amannirala13.pixslidebar:PixSlideBar:{Latest_version}' 
```

---
## Add to XML
Once imported, add the slidebar to your UI as follows:

```xml
<com.amannirala13.pixslidebar.PixSlideBar
        android:id="@+id/my_slide_bar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:message="@string/app_name"
        /> 
```
---
## Add Swipe complete callback
To perform an action on while complete use the following code in your kt class:
```kotlin
 slideBar.addOnSlideCompleteRunner(object:Runner{
            override fun execute() {
               Toast.makeText(this@MainActivity, "Slide Complete", Toast.LENGTH_SHORT).show()
            }
        })
```
---
## Example
To see implementation example and more features visit [**here**](https://github.com/amannirala13/PixSlideBar/tree/master/app/src/main).
