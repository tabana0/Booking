package com.example.booking.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import com.example.booking.DataModel
import com.example.booking.PhotoAdapter
import com.example.booking.R
import com.example.booking.ThirdActivty
import com.example.booking.model.Clinc
import com.example.booking.ui.adpter.ClincRecyclerView

class SecondActivty : AppCompatActivity() {
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()
    lateinit var rv_showData: RecyclerView
    lateinit var rv_title: Button
    lateinit var rv_img: ImageView
    var clincList: ArrayList<Clinc> = ArrayList()
    var username: String? = null
    val clincRecyclerView:ClincRecyclerView by lazy {  ClincRecyclerView() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_second)

        if (intent != null) {
            username = intent.extras!!.get("Username").toString()
            Toast.makeText(this,"username is:$username",Toast.LENGTH_LONG).show()
        }


        rv_showData = findViewById(R.id.recyclerView)
        rv_title = findViewById(R.id.btn_gird)
        rv_img = findViewById(R.id.img_grid)
        //initiate the grid  view
        //in this case I make row grid in a row
        //if you want to change that change the number
        rv_showData.adapter =clincRecyclerView

        rv_title.setOnClickListener {
            clincList.add(Clinc(username.toString(),R.drawable.doctor))

                var intent: Intent = Intent(this, ThirdActivty::class.java)

            clincRecyclerView.setList(clincList)
        }

//        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
//        photoAdapter = PhotoAdapter(applicationContext)
//        recyclerView.adapter = photoAdapter

        //add data
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//        dataList.add(DataModel("Title", R.drawable.doctor))
//
//        photoAdapter.setDataList(dataList)

    }
}

