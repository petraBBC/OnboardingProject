package com.example.onboardingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onboardingproject.models.ItemProperties
import com.example.onboardingproject.models.SportResponse
import com.example.onboardingproject.network.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DisplayArticles : AppCompatActivity() {

//    private lateinit var recyclerView:RecyclerView
//    private lateinit var manager:RecyclerView.LayoutManager
//    private lateinit var myAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_articles)
        supportActionBar?.setTitle("")

        getAllData()
        }

        fun getAllData(){
            Api.retrofitService.getAllData().enqueue(object: Callback <SportResponse>{
                override fun onResponse(
                    call: Call<SportResponse>,
                    response: Response<SportResponse>
                ) {
                    if (response.isSuccessful) {
                        findViewById<RecyclerView?>(R.id.recycler_view).apply {
                            layoutManager = LinearLayoutManager(context)
                            adapter = MyAdapter(response.body()!!)
                        }
                    }
                }

                override fun onFailure(call: Call<SportResponse>, t: Throwable) {
                    t.printStackTrace()
                }
            })
        }
    }
