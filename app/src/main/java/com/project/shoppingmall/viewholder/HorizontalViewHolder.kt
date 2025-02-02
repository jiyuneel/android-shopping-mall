package com.project.shoppingmall.viewholder

import com.project.shoppingmall.ListAdapter
import com.project.shoppingmall.databinding.ItemHorizontalBinding
import com.project.shoppingmall.model.Horizontal
import com.project.shoppingmall.model.ListItem

class HorizontalViewHolder(
    private val binding: ItemHorizontalBinding
) : BindingViewHolder<ItemHorizontalBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.listView.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as Horizontal
        binding.titleTextView.text = item.title
        adapter.submitList(item.items)
    }
}