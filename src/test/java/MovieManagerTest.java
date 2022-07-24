import org.junit.jupiter.api.Test;
import ru.netology.MovieName;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {

    MovieName movieOne = new MovieName(1, "The Vampire Diaries");
    MovieName movieTwo = new MovieName(2, "House by the lake");
    MovieName movieThree = new MovieName(3, "Ancient");
    MovieName movieFour = new MovieName(4, "Devil");
    MovieName movieFive = new MovieName(5, "Heritage");
    MovieName movieSix = new MovieName(6, "Twilight");
    MovieName movieSeven = new MovieName(7, "Twin Peaks");
    MovieName movieEight = new MovieName(8, "Another world");
    MovieName movieNine = new MovieName(9, "Matrix");
    MovieName movieTen = new MovieName(10, "Constantine is the Lord of Darkness");
    MovieName movieEleven = new MovieName(11, "The main character");
    MovieName movieTwelve = new MovieName(12, "Source code");
    MovieName movieThirteen = new MovieName(13, "Divergent");
    MovieName movieFourteen = new MovieName(14, "I'm a robot");
    MovieName movieFifteen = new MovieName(15, "Adrenaline");
    MovieName movieSixteen = new MovieName(16, "Afterburner");

    MovieName[] moviesTestList0 = new MovieName[0];
    MovieName[] moviesTestList1 = {
            movieOne};
    MovieName[] moviesTestList5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive};
    MovieName[] moviesTestList15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen};

    MovieName[] moviesExpectedAdd0 = {
            movieOne};
    MovieName[] moviesExpectedAdd1 = {
            movieOne,
            movieTwo};
    MovieName[] moviesExpectedAdd5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix};
    MovieName[] moviesExpectedAdd15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen,
            movieSixteen};

    MovieName[] moviesExpectedFindAll0 = new MovieName[0];
    MovieName[] moviesExpectedFindAll1 = {
            movieOne};
    MovieName[] moviesExpectedFindAll5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive};
    MovieName[] moviesExpectedFindAll15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen};

    MovieName[] moviesExpectedFindLast0DefaultCount = new MovieName[0];
    MovieName[] moviesExpectedFindLast1DefaultCount = {
            movieOne};
    MovieName[] moviesExpectedFindLast5DefaultCount = {
            movieFive,
            movieFour,
            movieThree,
            movieTwo,
            movieOne};
    MovieName[] moviesExpectedFindLast15DefaultCount = {
            movieFifteen,
            movieFourteen,
            movieThirteen,
            movieTwelve,
            movieEleven,
            movieTen,
            movieNine,
            movieEight,
            movieSeven,
            movieSix};

    MovieName[] moviesExpectedFindLast15Count0 = new MovieName[0];
    MovieName[] moviesExpectedFindLast5Count7 = {
            movieFive,
            movieFour,
            movieThree,
            movieTwo,
            movieOne};
    MovieName[] moviesExpectedFindLast15Count7 = {
            movieFifteen,
            movieFourteen,
            movieThirteen,
            movieTwelve,
            movieEleven,
            movieTen,
            movieNine};

    MovieName.MovieManager manager = new MovieName.MovieManager();
    MovieName.MovieManager managerCountNull = new MovieName.MovieManager(0);
    MovieName.MovieManager managerCountSeven = new MovieName.MovieManager(7);

    @Test
    void shouldAddNullMovies() {
        MovieName[] expected = moviesExpectedAdd0;
        manager.setMovies(moviesTestList0);
        manager.add(movieOne);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddOneMovies() {
        MovieName[] expected = moviesExpectedAdd1;
        manager.setMovies(moviesTestList1);
        manager.add(movieTwo);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddFiveMovies() {
        MovieName[] expected = moviesExpectedAdd5;
        manager.setMovies(moviesTestList5);
        manager.add(movieSix);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddFifteenMovies() {
        MovieName[] expected = moviesExpectedAdd15;
        manager.setMovies(moviesTestList15);
        manager.add(movieSixteen);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllNullMovies() {
        MovieName[] expected = moviesExpectedFindAll0;
        manager.setMovies(moviesTestList0);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllOneMovies() {
        MovieName[] expected = moviesExpectedFindAll1;
        manager.setMovies(moviesTestList1);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllFiveMovies() {
        MovieName[] expected = moviesExpectedFindAll5;
        manager.setMovies(moviesTestList5);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllFifteenMovies() {
        MovieName[] expected = moviesExpectedFindAll15;
        manager.setMovies(moviesTestList15);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindLastNullMoviesDefaultCount() {
        MovieName[] expected = moviesExpectedFindLast0DefaultCount;
        manager.setMovies(moviesTestList0);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastOneMoviesDefaultCount() {
        MovieName[] expected = moviesExpectedFindLast1DefaultCount;
        manager.setMovies(moviesTestList1);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFiveMoviesDefaultCount() {
        MovieName[] expected = moviesExpectedFindLast5DefaultCount;
        manager.setMovies(moviesTestList5);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesDefaultCount() {
        MovieName[] expected = moviesExpectedFindLast15DefaultCount;
        manager.setMovies(moviesTestList15);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesCountNull() {
        MovieName[] expected = moviesExpectedFindLast15Count0;
        managerCountNull.setMovies(moviesTestList15);
        managerCountNull.findLast();
        assertArrayEquals(expected, managerCountNull.getMoviesReverse());
    }

    @Test
    void shouldFindLastFiveMoviesCountSeven() {
        MovieName[] expected = moviesExpectedFindLast5Count7;
        managerCountSeven.setMovies(moviesTestList5);
        managerCountSeven.findLast();
        assertArrayEquals(expected, managerCountSeven.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesCountSeven() {
        MovieName[] expected = moviesExpectedFindLast15Count7;
        managerCountSeven.setMovies(moviesTestList15);
        managerCountSeven.findLast();
        assertArrayEquals(expected, managerCountSeven.getMoviesReverse());
    }
}