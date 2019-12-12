package at.fh.swengb.scherngell

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    companion object {
        val REVIEW_ID = "REVIEW_EXTRA"
        val ADD_REVIEW_REQUEST = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        val movieId = intent.getStringExtra(MovieListActivity.EXTRA_MOVIE_ID)

        updateDetail()

        open_rating.setOnClickListener {
            val intent = Intent(this, MovieReviewActivity::class.java)
            intent.putExtra(REVIEW_ID, movieId)
            startActivityForResult(intent, ADD_REVIEW_REQUEST)

            updateDetail()
        }
    }

    override fun onActivityResult(requestCode:Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ADD_REVIEW_REQUEST && resultCode == Activity.RESULT_OK) {
            setResult(Activity.RESULT_OK)
            updateDetail()
            finish()
        }
    }

    fun updateDetail() {
        val movieId = intent.getStringExtra(MovieListActivity.EXTRA_MOVIE_ID)

        if (movieId == null) {
            finish()
        } else {
            movie_detail_title.text = MovieRepository.movieById(movieId)?.title
            movie_detail_directors.text = MovieRepository.movieById(movieId)?.directors?.joinToString {it.name}
            movie_detail_actors.text = MovieRepository.movieById(movieId)?.actors?.joinToString {it.name}
            movie_detail_genre.text = MovieRepository.movieById(movieId)?.genre?.description
            movie_detail_avg_rating_bar.rating = MovieRepository.movieById(movieId)?.ratingAverage()!!.toFloat()
            movie_detail_avg_rating_value.text = MovieRepository.movieById(movieId)?.ratingAverage().toString()
            movie_detail_avg_rating_count.text = MovieRepository.movieById(movieId)?.reviews?.count().toString()
            movie_detail_release.text = MovieRepository.movieById(movieId)?.release
            movie_detail_plot.text = MovieRepository.movieById(movieId)?.plot
        }
    }
}
