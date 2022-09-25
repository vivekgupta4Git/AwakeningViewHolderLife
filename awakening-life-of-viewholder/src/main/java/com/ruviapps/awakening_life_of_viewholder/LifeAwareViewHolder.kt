package com.ruviapps.awakening_life_of_viewholder

import android.util.Log
import android.view.View
import androidx.lifecycle.*
import androidx.recyclerview.widget.RecyclerView

abstract class LifeAwareViewHolder(v : View): RecyclerView.ViewHolder(v), LifecycleOwner, ViewModelStoreOwner {
   private lateinit var lifecycleRegistry : LifecycleRegistry
   private lateinit var viewModelStore: ViewModelStore
    private var isRecycled = false

   init {
       makeLifeCycle()
       createViewModelStore()
   }

    /**
     * Register a lifecycle entry
     */
    private fun makeLifeCycle(){
            lifecycleRegistry = LifecycleRegistry(this)
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE)
          }

    /**
     * Register a ViewModelStore of its own
     */
  private fun createViewModelStore(){
       viewModelStore = ViewModelStore()
   }

    override fun getLifecycle(): Lifecycle {
        return lifecycleRegistry
    }

    override fun getViewModelStore(): ViewModelStore {
        return viewModelStore
    }

    /**
     * Change the lifecycle event to ON_START
     */
    fun onAttach(){
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START)
    }

    /**
     *Change the lifecycle event to ON_PAUSE
     */
    fun onDetach(){
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    }

    /**
     * Change the lifecycle event to ON_DESTROY
     * Also, prepare viewHolder for next use
     */
    fun onRecycled(){
        //destroy previous lifecycle
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        viewModelStore.clear()

        makeLifeCycle()
        createViewModelStore()

    }

    /**
     * Retrieve viewModelStoreOwner i.e ViewHolder
     */
    fun getViewModelStoreOwner(): ViewModelStoreOwner{
        return this
    }
}