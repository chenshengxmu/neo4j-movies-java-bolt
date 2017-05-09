package example.movies;

import example.movies.backend.MovieService;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author mh
 * @since 14.04.16
 */
public class DocTest {

    @Test
    public void testMovieFind() throws Exception {
        MovieService service = new MovieService("bolt://10.232.22.46:7687");
        Map movie = service.findMovie("终结者");
        assertEquals("终结者", movie.get("title"));
//        assertNotNull(movie.get("cast"));
    }
}
