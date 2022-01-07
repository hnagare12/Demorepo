package repository.copy;

import org.springframework.data.repository.PagingAndSortingRepository;

import entity.Movie;

public interface IMovieRepo extends PagingAndSortingRepository<Movie,Integer> {

}