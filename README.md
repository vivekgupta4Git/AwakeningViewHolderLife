# AwakeningViewHolderLife [![](https://jitpack.io/v/vivekgupta4Git/AwakeningViewHolderLife.svg)](https://jitpack.io/#vivekgupta4Git/AwakeningViewHolderLife)

A Library to make viewholder aware of its lifecycle.

Getting Started

Step 1. Add the JitPack repository to your build file


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.vivekgupta4Git:AwakeningViewHolderLife:1.0.1'
	}
  
  Make your recyclerview's viewholder aware its lifecycle by extending it with LifeAwareViewHolder class 
  Also, extend your recyclerview's adapter to AdapterWithLCViewHolder
  What perks do you get ?
  1. Create Viewmodel for each ItemView of RecyclerView
  2. Observe any livedata inside this Viewholder 
  3. No need to call notifyAdapter about any change in the Itemview. 
  
