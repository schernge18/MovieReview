package at.fh.swengb.scherngell

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_review.*

class MovieReviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_review)

        val movieId = intent.getStringExtra(MovieDetailActivity.REVIEW_ID)

        if (movieId == null) {
            finish()
        } else {
            movie_review_header.text = MovieRepository.movieById(movieId)?.title

            rate_movie.setOnClickListener {
                val myRating = movie_review_rating_bar.rating.toDouble()
                val myFeedback = movie_review_feedback.text.toString()

                val movieRating = Review(myRating, myFeedback)

                MovieRepository.reviewMovie(movieId, movieRating)

                setResult(Activity.RESULT_OK)
                finish()
            }
        }
    }
}
