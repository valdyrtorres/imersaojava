import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // Externalizado as URL's
        // Nasa api
        // API api = API.NASA;
        // TopMovies
        // API api = API.IMDB_TOP_MOVIES;
        // TopSeries
        API api = API.IMDB_TOP_SERIES;

        String url = api.getUrl();
        ExtratorDeConteudo extrator = api.getExtrator();

        // Most Popular Movies
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json";

        // endpoint que retorna as melhores séries
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopTVs.json";

        // as séries mais populares
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json";

        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        var diretorio = new File("figurinhas/");
        diretorio.mkdir();

        // exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new GeradoraDeFigurinhas();
        for (Conteudo conteudo : conteudos) {

            InputStream inputStream = new URL(conteudo.urlImagem()).openStream();
            String nomeArquivo = "figurinhas/" + conteudo.titulo() + ".png";

            System.out.println("Título: " + conteudo.titulo() );
            System.out.println("Poster: " + conteudo.urlImagem());
            // String nota = filme.get("imDbRating");
            // double classificacao = Double.parseDouble(nota);

            double classificacao = 8.9;

            String textoFigurinha;
            InputStream imagemValdyr;
            if (classificacao >= 8.0) {
                textoFigurinha = "TOPZERA";
                imagemValdyr = new FileInputStream(new File("sobreposicao/valdyr-empolgado-menor.jpg"));
            } else {
                textoFigurinha = "HMMMMMM...";
                imagemValdyr = new FileInputStream(new File("sobreposicao/valdyr-desconfiado-menor.jpg"));
            }

            geradora.criar(inputStream, nomeArquivo, textoFigurinha, imagemValdyr);

            // System.out.println("\u001b[37;1m\u001b[44;1mClassificação: " + nota + "\u001b[m");
            //System.out.println("\uD83D\uDC99 💙️");
            // int rating = 1;
            // double numberRating = Double.parseDouble(nota);
            // if (numberRating > 2d && numberRating <= 4d)
            //     rating = 2;
            // else if (numberRating > 4d && numberRating <= 6d)
            //     rating = 3;
            // else if (numberRating > 6d && numberRating <= 8d)
            //     rating = 4;      
            // else if (numberRating > 8d && numberRating <= 10d)
            //     rating = 5;                     
            // for(int i = 0; i < rating; i++)
            //     System.out.print("\u2B50");
            // System.out.println();
        }
    }
}
