package com.example.expend10.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.example.expend10.databinding.ItemChildBinding
import com.example.expend10.databinding.ItemParentBinding

class MyExpendAdapter(val tList: ArrayList<String>,val  map: HashMap<String, ArrayList<String>>)
    : BaseExpandableListAdapter() {
    override fun getGroupCount(): Int = tList.size

    override fun getChildrenCount(groupPosition: Int): Int {
        val groupName = tList[groupPosition]
       return map[groupName]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return tList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        val parentName = tList[groupPosition]
        val listChild = map[parentName]!!
        return listChild[childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        val itemParentBinding = ItemParentBinding.inflate(LayoutInflater.from(parent?.context), parent, false)
        itemParentBinding.tvParent.text= tList[groupPosition]
        return itemParentBinding.root
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        val itemChildBinding = ItemChildBinding.inflate(LayoutInflater.from(parent?.context), parent, false)
        itemChildBinding.tvChildName.text = map[tList[groupPosition]]?.get(childPosition)
        return itemChildBinding.root
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}