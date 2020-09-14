package com.interview.moviesapp.repo

import com.interview.moviesapp.model.MovieItemModel

class MovieRepository {
    fun getHero(): List<MovieItemModel> = listOf(
        MovieItemModel(
            titleText = "Lord of the rings",
            backgroundImageUrl = "https://images-na.ssl-images-amazon.com/images/I/61ce-LYYjiL._AC_.jpg",
            type = "HERO"
        ),
        MovieItemModel(
            titleText = "The Dark Knight",
            backgroundImageUrl = "https://images-na.ssl-images-amazon.com/images/I/81dwqKFOfwL._SX522_.jpg",
            type = "HERO"
        ),
        MovieItemModel(
            titleText = "Breaking Bad",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABUr3Y1-NF-H2vxX46gBEwdYqSlvDsY126karuPPoXnHjijxuk1cXPIb8lrLk8TfN3YXWzniCLhrTOROMXuLaKcji8lI.jpg?r=01d",
            type = "HERO"
        ),
        MovieItemModel(
            titleText = "Jeffrey Epstein: Filthy Rich",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABRjoGM_vDXMmlN1lEGV_1KozvNzdAWeeOMkLsDe9-XK_PTzGX5mm1ZNtV6xIQ7w9u7BJpAF8LriMMopvYHtUnB6Qvjj3ezTRnw30qAyynr-ngjPjqePA0XTPtVNC8dgIOkGUQ-cj5M3MSdOfTLSnrXPj3RVQin66FtSFMSR9FItF_WTauOU0BPk.jpg?r=4c7",
            type = "HERO"
        ),
        MovieItemModel(
            titleText = "Intuition",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABQp6ZlfXx9cqhFOlI0J9BCnk6axSK_GdaV9rEANtv9AJ6cUswq0r51jCfIdx8vOURq77cUWp42BecjYhdF_snNuwT3BKq1J-M5sTD8YyEk3WNHNXbTUkcJHFRwRw.jpg?r=c3a",
            type = "HERO"
        ),
        MovieItemModel(
            titleText = "The 100",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABU5qZVwfD4NdANmRfG5KVOgju4u-8cvqr27WXdc0e2Q5xYnqjJoQz5QIiDiVVHBLkwuH7EXFMnjmI0NyRXpp6OZ8EsgLhV0LxZ7vAsS9TR0dmbUrPjCEkZaRyfNWdHD5mA.jpg?r=799",
            type = "HERO"
        ),
        MovieItemModel(
            titleText = "Dark",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABf_OF512cI0zvZ4VHFf0S6uXnUnbIyX-1n5StLXTV6p2KWBz6U7Py_GJeUJsnECakm1M3YwoRonqcIJ6WwL21m10iz0Ih5NDXBNfdCCQymlej9_1vERIGYl1GiMt.jpg?r=6b7",
            type = "HERO"
        )
    )

    fun getNew(): List<MovieItemModel> = listOf(
        MovieItemModel(
            titleText = "Queen of the South",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABRcRLN7tTq1yeuoROCEYlQSI8jJmHn8oy7aywwANEsWFHrbWG5n9fqXcTig7tYSCROl1XC20mCMuiopbzWBpv88aAuNIjGgNwDM-T5tSpgtBj9ChK6Y8wWmUDwIJKjmy9g.jpg?r=4d0",
            type = "NEW"
        ),
        MovieItemModel(
            titleText = "Breaking Bad",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABUr3Y1-NF-H2vxX46gBEwdYqSlvDsY126karuPPoXnHjijxuk1cXPIb8lrLk8TfN3YXWzniCLhrTOROMXuLaKcji8lI.jpg?r=01d",
            type = "NEW"
        ),
        MovieItemModel(
            titleText = "Jeffrey Epstein: Filthy Rich",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABRjoGM_vDXMmlN1lEGV_1KozvNzdAWeeOMkLsDe9-XK_PTzGX5mm1ZNtV6xIQ7w9u7BJpAF8LriMMopvYHtUnB6Qvjj3ezTRnw30qAyynr-ngjPjqePA0XTPtVNC8dgIOkGUQ-cj5M3MSdOfTLSnrXPj3RVQin66FtSFMSR9FItF_WTauOU0BPk.jpg?r=4c7",
            type = "NEW"
        ),
        MovieItemModel(
            titleText = "Intuition",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABQp6ZlfXx9cqhFOlI0J9BCnk6axSK_GdaV9rEANtv9AJ6cUswq0r51jCfIdx8vOURq77cUWp42BecjYhdF_snNuwT3BKq1J-M5sTD8YyEk3WNHNXbTUkcJHFRwRw.jpg?r=c3a",
            type = "NEW"
        ),
        MovieItemModel(
            titleText = "The 100",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABU5qZVwfD4NdANmRfG5KVOgju4u-8cvqr27WXdc0e2Q5xYnqjJoQz5QIiDiVVHBLkwuH7EXFMnjmI0NyRXpp6OZ8EsgLhV0LxZ7vAsS9TR0dmbUrPjCEkZaRyfNWdHD5mA.jpg?r=799",
            type = "NEW"
        ),
        MovieItemModel(
            titleText = "Dark",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABf_OF512cI0zvZ4VHFf0S6uXnUnbIyX-1n5StLXTV6p2KWBz6U7Py_GJeUJsnECakm1M3YwoRonqcIJ6WwL21m10iz0Ih5NDXBNfdCCQymlej9_1vERIGYl1GiMt.jpg?r=6b7",
            type = "NEW"
        )
    )

    fun getFeature(): List<MovieItemModel> = listOf(
        MovieItemModel(
            titleText = "Into the Night",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABQS2s6JLQqYCXgyVuoPK3nDHj50ZS5c6Iyg5LoCeek8C0wUqgqBBCjDrxydpQY2Qxw7hSO_dTDTcNEwQEoGchKoFe3CCDiv5Yfl67oJ6x5JOqUfxlIpEGhBavSgl.jpg?r=4c8",
            type = "FEATURE"
        ),
        MovieItemModel(
            titleText = "The 100",
            backgroundImageUrl = "https://occ-0-1433-1432.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABU5qZVwfD4NdANmRfG5KVOgju4u-8cvqr27WXdc0e2Q5xYnqjJoQz5QIiDiVVHBLkwuH7EXFMnjmI0NyRXpp6OZ8EsgLhV0LxZ7vAsS9TR0dmbUrPjCEkZaRyfNWdHD5mA.jpg?r=799",
            type = "FEATURE"
        ),
        MovieItemModel(
            titleText = "The Dark Knight",
            backgroundImageUrl = "https://images-na.ssl-images-amazon.com/images/I/81dwqKFOfwL._SX522_.jpg",
            type = "FEATURE"
        )
    )
}





