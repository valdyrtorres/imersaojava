
Imersão Java

C:\Users\valdirtorres\dev\java\jdk-11.0.18.10-hotspot\bin\java.exe -cp C:\Users\valdirtorres\devcode\alura\imersaojava\alura-stickers\bin App

https://www.themoviedb.org/

Bom dia pessoal! Relembrando... Conforme informamos na descrição da aula,  caso a API do IMDb esteja instável ou fora do ar, vocês podem utilizar os seguintes endereços alternativos:

https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopTVs.json
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json
Para utilizar os endereços alternativos, troque a URL da aula, que é a que mostramos oficial com a chave, por uma das novas URLs acima.

Para quem está com problemas em exibir as estrelas ⭐⭐⭐  ou qualquer outro emoji no Windows, na resolução do desafio falamos um pouco sobre isso, mas aqui segue uma dica:

• Mude seu terminal no vscode para o “cmd”
• Digite o comando abaixo: 
chcp 65001

• No mesmo terminal, execute novamente seu código
=============================================================================
Site para testar expressão regular
regex101.com
=============================================================================

Para quem está com problemas em exibir os emojis no console mesmo usando o comando chcp 65001, segue outra alternativa:

• Aperte win + r e digite intl.cpl
• Selecione o campo "Administrativo" - > "Alterar localidade do sistema"
• Marque a opção "Usar Unicode UTF-8 para suporte de linguagem mundial"
• Aceite a reiniciação do computador
=============
Links:
https://www.alura.com.br/imersao-java/aula01-consumindo-api-com-java
https://grupoalura.notion.site/Imers-o-Java-2-Edi-o-Guia-do-Mergulho-69e40005601f4d089a9add98251197de
https://www.imdb.com/chart/top/
https://imdb-api.com/api
https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java
https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html
https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3
https://github.com/FasterXML/jackson
https://regex101.com/
https://www.alura.com.br/artigos/escrever-bom-readme
https://imdb-api.com/en/API/Top250Movies/
https://youtu.be/v4Dpul7b5bU
https://youtu.be/uc59B0J4z1c
https://www.alura.com.br/artigos/o-que-e-json
https://www.alura.com.br/artigos/decorando-terminal-cores-emojis
https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code
https://emojiterra.com/pt/estrela/

========
Desafios:
Externalizar a consfiguração, como chaves de api por exemplo
Pintar o terminal, como a palavra classificação
No rating mostrar estrelas em vez da nota

Nota: 
[0 < rating <= 2] => 1 estrela
[2 < rating <= 4] => 2 estrelas
[4 < rating <= 6] => 3 estrelas
[6 < rating <= 8] => 4 estrelas
[8 < rating <= 10] => 5 estrelas

Aula 3
https://api.nasa.gov/
You are receiving this email to confirm the creation of an API key. If you did not request this, please disregard this email. Your API key for valdyrtorres@yahoo.com.br is:

A3lnceIBNfWY5pTiNGDknbT0drCbVCYbI382XKRn

DEMO_KEY Rate Limits
In documentation examples, the special DEMO_KEY api key is used. This API key can be used for initially exploring APIs prior to signing up, but it has much lower rate limits, so you’re encouraged to signup for your own API key if you plan to use the API (signup is quick and easy). The rate limits for the DEMO_KEY are:

Hourly Limit: 30 requests per IP address per hour
Daily Limit: 50 requests per IP address per day
How Do I See My Current Usage?
Your can check your current rate limit and usage details by inspecting the X-RateLimit-Limit and X-RateLimit-Remaining HTTP headers that are returned on every API response. For example, if an API has the default hourly limit of 1,000 request, after making 2 requests, you will receive this HTTP header in the response of the second request:

X-RateLimit-Remaining: 998

The hourly counters for your API key reset on a rolling basis.

Example: If you made 500 requests at 10:15AM and 500 requests at 10:25AM, your API key would become temporarily blocked. This temporary block of your API key would cease at 11:15AM, at which point you could make 500 requests. At 11:25AM, you could then make another 500 requests.

Anyone can register for an api.nasa.gov key, which can be used to access data across federal agencies.

LINK: https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14

