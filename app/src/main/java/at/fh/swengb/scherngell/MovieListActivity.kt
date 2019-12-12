package at.fh.swengb.scherngell

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_movie_list.*


class MovieListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        movieAdapter.updateList(MovieRepository.moviesList())
        movie_recycler_view.layoutManager = LinearLayoutManager(this)
        movie_recycler_view.adapter = movieAdapter
    }

    val movieAdapter = MovieAdapter(){
        val intent = Intent(this, MovieDetailActivity::class.java)
        intent.putExtra(EXTRA_MOVIE_ID, it.id)
        startActivityForResult(intent, ADD_DETAIL_REQUEST)
    }

    companion object {
        val EXTRA_MOVIE_ID = "MOVIE_ID_EXTRA"
        val ADD_DETAIL_REQUEST = 1
    }

    override fun onActivityResult(requestCode:Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ADD_DETAIL_REQUEST && resultCode == Activity.RESULT_OK) {
            movieAdapter.updateList(MovieRepository.moviesList())
        }
    }
}
