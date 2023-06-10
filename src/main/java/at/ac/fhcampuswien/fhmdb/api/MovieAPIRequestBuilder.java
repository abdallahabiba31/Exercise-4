package at.ac.fhcampuswien.fhmdb.api;

public class MovieAPIRequestBuilder {
    private String baseUrl;
    private String query;
    private String genre;
    private String releaseYear;
    private String ratingFrom;
    private String id;

    public MovieAPIRequestBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public MovieAPIRequestBuilder query(String query) {
        this.query = query;
        return this;
    }

    public MovieAPIRequestBuilder genre(String genre) {
        this.genre = genre;
        return this;
    }

    public MovieAPIRequestBuilder releaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    public MovieAPIRequestBuilder ratingFrom(String ratingFrom) {
        this.ratingFrom = ratingFrom;
        return this;
    }

    public MovieAPIRequestBuilder id(String id) {
        this.id = id;
        return this;
    }

    public String build() {
        StringBuilder urlBuilder = new StringBuilder(baseUrl);

        if (id != null) {
            urlBuilder.append("/").append(id);
        } else {
            if (query != null) {
                urlBuilder.append("?query=").append(query);
            }

            if (genre != null) {
                urlBuilder.append("&genre=").append(genre);
            }

            if (releaseYear != null) {
                urlBuilder.append("&releaseYear=").append(releaseYear);
            }

            if (ratingFrom != null) {
                urlBuilder.append("&ratingFrom=").append(ratingFrom);
            }
        }

        return urlBuilder.toString();
    }
}
