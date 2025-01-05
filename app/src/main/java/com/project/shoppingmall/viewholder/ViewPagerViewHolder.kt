package com.project.shoppingmall.viewholder

import com.project.shoppingmall.ListAdapter
import com.project.shoppingmall.databinding.ItemViewpagerBinding
import com.project.shoppingmall.model.ListItem
import com.project.shoppingmall.model.ViewPager

class ViewPagerViewHolder(
    binding: ItemViewpagerBinding
) : BindingViewHolder<ItemViewpagerBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.viewpager.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as ViewPager
        adapter.submitList(item.items)
    }
}