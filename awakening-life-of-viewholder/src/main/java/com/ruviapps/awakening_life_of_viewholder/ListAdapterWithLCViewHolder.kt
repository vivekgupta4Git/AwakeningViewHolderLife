package com.ruviapps.awakening_life_of_viewholder

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter


abstract class ListAdapterWithLCViewHolder<T, VH : LifeAwareViewHolder>(mDiffUtil: DiffUtil.ItemCallback<T>)
    : ListAdapter<T, VH>(mDiffUtil)
{
    override fun onViewAttachedToWindow(holder: VH) {
        super.onViewAttachedToWindow(holder)
        holder.onAttach()
    }

    override fun onViewDetachedFromWindow(holder: VH) {
        super.onViewDetachedFromWindow(holder)
        holder.onDetach()
    }

    override fun onViewRecycled(holder: VH) {
        super.onViewRecycled(holder)
        holder.onRecycled()
    }
}

