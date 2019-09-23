package curso.controler;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/* @RestController indica que essa a classe é um controlador WEB (expõe os métodos da classe como recursos web)  
 * Em outras palavras: faz com que esse classe fique escutando as requisições web que chegam a neste endereço localhost:8080
 * 
 * A diferença do @Controller e que:  
 * o @RestController faz com que o valor STRING retornado no método (return), seja enviado diretamente ao browser 
 * no Corpo do Response HTTP, sem passar por qualquer pré-processamento do Spring MVC
 */


@RestController                     
@RequestMapping("/basico") // Indica o mapeamento inicial para todos os recursos disponiveis neste Controler 
public class Controler {

	/*  Alternativamente poderiamos anotar a classe com @Controller ao invés de @RestController,
	 	 mas nesse caso teríamos que anotar cada método com a anotação @ResponseBody.	   
	     OBS: @RestController = @Controller + @ResponseBody
	*/
 				   
    @RequestMapping("helloworld") // Indica o nome do recurso que será parte final do mapeamento, ex: localhost:8080/basico/helloworld  
    public String helloworld() {
        return "<h1>Hello World WEB</h1>";
    }
    

    @RequestMapping("start")
    public String start() {

    	StringBuilder resposta = new StringBuilder();    	

    	resposta.append("<hr><strong>Exemplo: Response direto dentro do Controler</strong><hr>");
    	resposta.append("<h1>Hello World WEB</h1>");    	    	    	
    	resposta.append("<h2>Os Skills abordados no projeto Start 2019 são:</h2>");
    	resposta.append("<hr>");
    	resposta.append("<ul>");
    	resposta.append("<li>Abap</li><li>Cobol</li><li><strong>Java (back-end)</strong></li><li>Java Script (front-end)</li>");
    	resposta.append("</ul>");  
    	resposta.append("<hr>");
    	    	
        return resposta.toString();
    }
    

    @RequestMapping("startlogin")
    public String startlogin(@RequestParam( value="aluno", required=false) String nome) {
    	
    	/* caso desejasemos que o parametro 'aluno' fosse obrigatório, poderiamos declarar apenas assim:
    	   public String basico3(@RequestParam("aluno") String nome) 
    	*/

    	StringBuilder resposta = new StringBuilder();    	
    	
    	resposta.append("<hr><strong>Exemplo: Response direto dentro do Controler</strong><hr>");

    	resposta.append("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"../css/styles.css\"></head>");

    	resposta.append("<img src=\"../img/logoAccenture.PNG\" width=\"150\" >");    	    	
    	
    	resposta.append("<h2>Formação Profissional</h2>");
    	    	
    	resposta.append("Aluno: <b>" + nome + "</b>");
    	resposta.append("<hr>");
    	
    	if (nome != null && !nome.equals("")) {
    		resposta.append("<div class=\"destaque normal\">");
    		resposta.append("Caro participante <i>" + nome + "</i>, seja Bem Vindo !");
    		resposta.append("</div>");
    	}
    	else  {
    		resposta.append("<div class=\"destaque alerta\">");
    		resposta.append("Caro participante, por favor inclua seu nome na url no formato: ?aluno=...");
    		resposta.append("</div>");
    	}
    	resposta.append("<hr>");
    	    	
    	resposta.append("<h3>Os Skills abordados no projeto Start 2019 são:</h3>");
    	resposta.append("<hr>");
    	resposta.append("<ul>");
    	resposta.append("<li>Abap</li><li>Cobol</li><li><strong>Java (back-end)</strong></li><li>Java Script (front-end)</li>");
    	resposta.append("</ul>");
    	resposta.append("<hr>");
    	    	
    	resposta.append("Saiba mais: ");
    	resposta.append("<a href=\"https://www.accenture.com/br-pt/company-cidadania-corporativa\">Cidadania Coorporativa</a>");
    	    	
        return resposta.toString();
    }
    
    
}
