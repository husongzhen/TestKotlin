package com.allen.code.testkolin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * 作者：husongzhen on 17/8/31 16:49
 * 邮箱：husongzhen@musikid.com
 */
class UserAdapter: RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    var list: List<User> = ArrayList();

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        (holder?.v as TextView).text = list.get(position).name
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent!!.context))
    }

    class ViewHolder(val v: View) : RecyclerView.ViewHolder(v) {

    }

}