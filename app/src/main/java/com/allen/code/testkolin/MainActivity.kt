package com.allen.code.testkolin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.async
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonPanel.text = "haha"
        buttonPanel.setOnClickListener { toast("click") }

        var adapter: UserAdapter = UserAdapter();
        var recycler = findViewById(R.id.recycler) as RecyclerView
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter;
        var users: MutableList<User> = ArrayList();

        for (i in 0..10) {
            var user: User = User("$i" + "name", i)
            users.add(user)
        }
        adapter.list = users
        adapter.notifyDataSetChanged()
    }





    fun toast(text: String, during: Int = Toast.LENGTH_LONG) {
        async() {
            Request("https://www.baidu.com/").run()
            uiThread { longToast("Request performed") }
        }
    }


}

