package br.com.ifba;

import br.com.ifba.cursos.swing.CursoTela;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
             ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(DemoApplication.class)
                .headless(false).run(args);
        
            CursoTela telalistar = context.getBean(CursoTela.class);
            telalistar.setVisible(true);
}
             
             
    

    

}
