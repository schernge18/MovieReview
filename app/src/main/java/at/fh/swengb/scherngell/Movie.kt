package at.fh.swengb.scherngell

import android.icu.text.CaseMap

class Movie(val id: String,
            val title: String,
            val release: String,
            val plot: String,
            val genre: MovieGenre,
            val directors: List<Person>,
            val actors: List<Person>,
            val reviews: MutableList<Review>) {

    fun ratingAverage(): Double {
        var average = String.format("%.2f", reviews.map {it.reviewValue}.average()).toDouble()

        if (average.isNaN()) {
            average = 0.0
        }

        return average
    }
}
