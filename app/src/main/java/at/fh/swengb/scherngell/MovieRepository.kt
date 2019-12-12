package at.fh.swengb.scherngell

object MovieRepository {
    private val movies: List<Movie>

    init {
        val personToddPhillips = Person("Todd Phillips", "")
        val personJoaquinPhoenix = Person("Joaquin Phoenix", "")
        val personRobertDeNiro = Person("Robert De Niro", "")
        val personChrisBuck = Person("Chris Buck", "")
        val personJenniferLee = Person("Jennifer Lee", "")
        val personIdinaMenzel = Person("Idina Menzel", "")
        val personKristenBell = Person("Kristen Bell", "")
        val personJamesCameron = Person("James Cameron", "")
        val personLeonardoDiCaprio = Person("Leonardo DiCaprio", "")
        val personKateWinslet = Person("Kate Winslet", "")
        val personAnthonyRusso = Person("Anthony Russo", "")
        val personJoeRusso = Person("Joe Russo", "")
        val personRobertDowneyJr = Person("Robert Downey Jr.", "")
        val personChrisEvans = Person("Chris Evans", "")
        val personDavidYates = Person("David Yates", "")
        val personDanielRadcliffe = Person("Daniel Radcliffe", "")
        val personEmmaWatson = Person("Emma Watson", "")
        val personGoreVerbinski = Person("Gore Verbinski", "")
        val personJohnnyDepp = Person("Johnny Depp", "")
        val personGeoffreyRush = Person("Geoffrey Rush", "")
        val personTimBurton = Person("Tim Burton", "")
        val personFreddieHighmore = Person("Freddie Highmore", "")
        val personTetsuyaNomura = Person("Tetsuya Nomura", "")
        val personSteveBurton = Person("Steve Burton", "")
        val personGeorgeNewbern = Person("George Newbern", "")
        val personJohnLasseter = Person("John Lasseter", "")
        val personTomHanks = Person("Tom Hanks", "")
        val personTimAllen = Person("Tim Allen", "")
        val personPeteDocter = Person("Pete Docter", "")
        val personJohnGoodman = Person("John Goodman", "")
        val personBillyCrystal = Person("Billy Crystal", "")
        val personGeorgeLucas = Person("George Lucas", "")
        val personMarkHamill = Person("Mark Hamill", "")
        val personHarrisonFord = Person("Harrison Ford", "")
        val personSamRaimi = Person("Sam Raimi", "")
        val personTobeyMaguire = Person("Tobey Maguire", "")
        val personKirstenDunst = Person("Kirsten Dunst", "")
        val personQuentinTarantino = Person("Quentin Tarantino", "")
        val personJohnTravolta = Person("John Travolta", "")
        val personSamuelLJackson = Person("Samuel L. Jackson", "")
        val personPeterJackson = Person("Peter Jackson", "")
        val personElijahWood = Person("Elijah Wood", "")
        val personViggoMortensen = Person("Viggo Mortensen", "")
        val personChristopherMcQuarrie = Person("Christopher McQuarrie", "")
        val personTomCruise = Person("Tom Cruise", "")
        val personHenryCavill = Person("Henry Cavill", "")
        val personRobertZemeckis = Person("Robert Zemeckis", "")
        val personRobinWright = Person("Robin Wright", "")
        val personChristopherNolan = Person("Christopher Nolan", "")
        val personEllenPage = Person("Ellen Page", "")
        val personLanaWachowski = Person("Lana Wachowski", "")
        val personLillyWachowski = Person("Lilly Wachowski", "")
        val personKeanuReeves = Person("Keanu Reeves", "")
        val personLaurenceFishburne = Person("Laurence Fishburne", "")
        val personJamieFoxx = Person("Jamie Foxx", "")
        val personChristophWaltz = Person("Christoph Waltz", "")

        movies = listOf(
            Movie("0",
                "Joker",
                "2019",
                "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.",
                MovieGenre.DRAMA,
                listOf(personToddPhillips),
                listOf(personJoaquinPhoenix, personRobertDeNiro),
                mutableListOf()
            ),
            Movie("1",
                "Frozen",
                "2013",
                "When the newly-crowned Queen Elsa accidentally uses her power to turn things into ice to curse her home in infinite winter, her sister Anna teams up with a mountain man, his playful reindeer, and a snowman to change the weather condition.",
                MovieGenre.DRAMA,
                listOf(personChrisBuck, personJenniferLee),
                listOf(personIdinaMenzel, personKristenBell),
                mutableListOf()
            ),
            Movie("2",
                "Titanic",
                "1997",
                "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
                MovieGenre.DRAMA,
                listOf(personJamesCameron),
                listOf(personLeonardoDiCaprio, personKateWinslet),
                mutableListOf()
            ),
            Movie("3",
                "Avengers: Endgame",
                "2019",
                "After the devastating events of Avengers 3: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
                MovieGenre.DRAMA,
                listOf(personAnthonyRusso, personJoeRusso),
                listOf(personRobertDowneyJr, personChrisEvans),
                mutableListOf()
            ),
            Movie("4",
                "Harry Potter and the Deathly Hallows: Part 2",
                "2011",
                "Harry (Daniel Radcliffe), Ron (Rupert Grint), and Hermione (Emma Watson) search for Voldemort's (Ralph Fiennes') remaining Horcruxes in their effort to destroy the Dark Lord as the final battle rages on at Hogwarts.",
                MovieGenre.DRAMA,
                listOf(personDavidYates),
                listOf(personDanielRadcliffe, personEmmaWatson),
                mutableListOf()
            ),
            Movie("5",
                "Pirates of the Caribbean: The Curse of the Black Pearl",
                "2003",
                "Blacksmith Will Turner teams up with eccentric pirate \"Captain\" Jack Sparrow to save his love, the governor's daughter, from Jack's former pirate allies, who are now undead.",
                MovieGenre.DRAMA,
                listOf(personGoreVerbinski),
                listOf(personJohnnyDepp, personGeoffreyRush),
                mutableListOf()
            ),
            Movie("6",
                "Charlie and the Chocolate Factory",
                "2005",
                "A young boy wins a tour through the most magnificent chocolate factory in the world, led by the world's most unusual candy maker.",
                MovieGenre.DRAMA,
                listOf(personTimBurton),
                listOf(personJohnnyDepp, personFreddieHighmore),
                mutableListOf()
            ),
            Movie("7",
                "Final Fantasy VII: Advent Children",
                "2006",
                "An ex-mercenary is forced out of isolation when three mysterious men kidnap and brainwash the city's children afflicted with the Geostigma disease.",
                MovieGenre.DRAMA,
                listOf(personTetsuyaNomura),
                listOf(personSteveBurton, personGeorgeNewbern),
                mutableListOf()
            ),
            Movie("8",
                "Toy Story",
                "1995",
                "A cowboy doll is profoundly threatened and jealous when a new spaceman figure supplants him as top toy in a boy's room.",
                MovieGenre.DRAMA,
                listOf(personJohnLasseter),
                listOf(personTomHanks, personTimAllen),
                mutableListOf()
            ),
            Movie("9",
                "Monsters, Inc.",
                "2001",
                "In order to power the city, monsters have to scare children so that they scream. However, the children are toxic to the monsters, and after a child gets through, 2 monsters realize things may not be what they think.",
                MovieGenre.DRAMA,
                listOf(personPeteDocter),
                listOf(personJohnGoodman, personBillyCrystal),
                mutableListOf()
            ),
            Movie("10",
                "Star Wars: Episode IV - A New Hope",
                "1977",
                "Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader.",
                MovieGenre.DRAMA,
                listOf(personGeorgeLucas),
                listOf(personMarkHamill, personHarrisonFord),
                mutableListOf()
            ),
            Movie("11",
                "Spider-Man",
                "2002",
                "When bitten by a genetically modified spider, a nerdy, shy, and awkward high school student gains spider-like abilities that he eventually must use to fight evil as a superhero after tragedy befalls his family.",
                MovieGenre.DRAMA,
                listOf(personSamRaimi),
                listOf(personTobeyMaguire, personKirstenDunst),
                mutableListOf()
            ),
            Movie("12",
                "Pulp Fiction",
                "1994",
                "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
                MovieGenre.DRAMA,
                listOf(personQuentinTarantino),
                listOf(personJohnTravolta, personSamuelLJackson),
                mutableListOf()
            ),
            Movie("13",
                "The Lord of the Rings: The Return of the King",
                "2003",
                "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
                MovieGenre.DRAMA,
                listOf(personPeterJackson),
                listOf(personElijahWood, personViggoMortensen),
                mutableListOf()
            ),
            Movie("14",
                "Mission: Impossible - Fallout",
                "2018",
                "Ethan Hunt and his IMF team, along with some familiar allies, race against time after a mission gone wrong.",
                MovieGenre.DRAMA,
                listOf(personChristopherMcQuarrie),
                listOf(personTomCruise, personHenryCavill),
                mutableListOf()
            ),
            Movie("15",
                "Forrest Gump",
                "1994",
                "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, and other history unfold through the perspective of an Alabama man with an IQ of 75.",
                MovieGenre.DRAMA,
                listOf(personRobertZemeckis),
                listOf(personTomHanks, personRobinWright),
                mutableListOf()
            ),
            Movie("16",
                "Inception",
                "2010",
                "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
                MovieGenre.DRAMA,
                listOf(personChristopherNolan),
                listOf(personLeonardoDiCaprio, personEllenPage),
                mutableListOf()
            ),
            Movie("17",
                "The Matrix",
                "1999",
                "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",
                MovieGenre.DRAMA,
                listOf(personLanaWachowski, personLillyWachowski),
                listOf(personKeanuReeves, personLaurenceFishburne),
                mutableListOf()
            ),
            Movie("18",
                "Django Unchained",
                "2012",
                "With the help of a German bounty hunter, a freed slave sets out to rescue his wife from a brutal Mississippi plantation owner.",
                MovieGenre.DRAMA,
                listOf(personQuentinTarantino),
                listOf(personJamieFoxx, personChristophWaltz),
                mutableListOf()
            )
        )
    }

    fun moviesList(): List<Movie> {
        return movies
    }

    fun movieById(id: String): Movie? {
        return movies.find {it.id == id}
    }

    fun reviewMovie(id: String, review: Review) {
        movieById(id)?.reviews?.add(review)
    }
}