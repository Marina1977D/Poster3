package ru.netology;

public class MovieName {
    public MovieName(int i, String seven) {
    }

    public static class MovieManager {
        private MovieName[] movies = new MovieName[0];
        private MovieName[] moviesReverse = new MovieName[0];
        private int countMovies = 10;

        public MovieManager() {
        }

        public MovieManager(int countMovies) {
            this.countMovies = countMovies;
        }

        public MovieName[] getMovies() {
            return movies;
        }

        public void setMovies(MovieName[] movies) {
            this.movies = movies;
        }

        public MovieName[] getMoviesReverse() {
            return moviesReverse;
        }

        public void setMoviesReverse(MovieName[] moviesReverse) {
            this.moviesReverse = moviesReverse;
        }

        public int getCountMovies() {
            return countMovies;
        }

        public void setCountMovies(int countMovies) {
            this.countMovies = countMovies;
        }

        //добавление фильма в конец массива
        public void add(MovieName movie) {
            MovieName[] tmp = new MovieName[movies.length + 1];
            System.arraycopy(movies, 0, tmp, 0, movies.length);
            tmp[movies.length] = movie;
            movies = tmp;
        }

        //отображение фильмов в порядке добавления
        public void findAll() {
            getMovies();
        }

        //отображение  фильмов в обратном порядке
        public void findLast() {
            if (countMovies > movies.length) {
                countMovies = movies.length;
            }
            MovieName[] tmp = new MovieName[countMovies];
            for (int i = 0, j = movies.length - 1; i < countMovies; i++, j--) {
                tmp[i] = movies[j];
            }
            moviesReverse = tmp;
        }
    }
}
