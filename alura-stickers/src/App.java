import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // fazer uma conexão http e buscar os top 250 filmes
        //String url = "https://imdb-api.com/en/API/Top250Movies/k_0ojt0yvm";

        // TopMovies
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        // Most Popular Movies
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json";

        // endpoint que retorna as melhores séries
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopTVs.json";

        // as séries mais populares
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json";

        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        //System.out.println(body);

        // extrair só os dados que interessam (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        //System.out.println(listaDeFilmes.size());
        //System.out.println(listaDeFilmes.get(0));

        // exibir e manipular os dados
        for (Map<String, String> filme : listaDeFilmes) {
            System.out.println("Título: " + filme.get("title"));
            System.out.println("Poster: " + filme.get("image"));
            String nota = filme.get("imDbRating");
            System.out.println("\u001b[37;1m\u001b[44;1mClassificação: " + nota + "\u001b[m");
            //System.out.println("\uD83D\uDC99 💙️");
            int rating = 1;
            double numberRating = Double.parseDouble(nota);
            if (numberRating > 2d && numberRating <= 4d)
                rating = 2;
            else if (numberRating > 4d && numberRating <= 6d)
                rating = 3;
            else if (numberRating > 6d && numberRating <= 8d)
                rating = 4;      
            else if (numberRating > 8d && numberRating <= 10d)
                rating = 5;                     
            for(int i = 0; i < rating; i++)
                System.out.print("\u2B50");
            System.out.println();
        }
    }
}
