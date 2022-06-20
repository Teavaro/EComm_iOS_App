package com.teavaro.teavarodemoapp.ui.cart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.teavaro.teavarodemoapp.R
import kotlinx.android.synthetic.main.item_shop.view.*

class CartAdapter(context: Context,
                  private val listItems: List<String>) :
    ArrayAdapter<String>(context, 0, listItems) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(context).inflate(R.layout.item_shop,parent, false)

        val item = listItems[position]
        layout.txtTitle.text = item

        return layout
    }
}