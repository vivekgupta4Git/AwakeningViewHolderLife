package com.ruviapps.awakening_life_of_viewholder

import androidx.recyclerview.widget.RecyclerView

abstract class AdapterWithLCViewHolder : RecyclerView.Adapter<LifeAwareViewHolder>() {

    override fun onViewRecycled(holder: LifeAwareViewHolder) {
        super.onViewRecycled(holder)
        holder.onRecycled()
    }

    override fun onViewAttachedToWindow(holder: LifeAwareViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.onAttach()
    }

    override fun onViewDetachedFromWindow(holder: LifeAwareViewHolder) {
        super.onViewDetachedFromWindow(holder)
        holder.onDetach()
    }

}


