package ar.unju.edu.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ar.unju.edu.edm.Model.*;

@Controller
public class CalculadoraController {
	@GetMapping("/menu")
	
	public String mostrarMenu() {
		return "menu";
	}
	 @GetMapping("/calcularSuma")
	    public String getSumar(@RequestParam(name="n1")double n1,@RequestParam(name="n2")double n2,Model model) {
	    	double resultadoSuma;
	    	Calculadora menuCalculadora = new Calculadora();
	    	menuCalculadora.setNum1(n1);
	    	menuCalculadora.setNum2(n2);
	    	resultadoSuma=menuCalculadora.suma();
	    	model.addAttribute("resultadoSuma", resultadoSuma);
	    	
	    	return "resultadoS";
	    }      
	    
	 @GetMapping("/calcularResta")
	    public String getResta(@RequestParam(name="n1")double n1,@RequestParam(name="n2")double n2,Model model) {
	    	double resultadoResta;
	    	Calculadora menuCalculadora = new Calculadora();
	    	menuCalculadora.setNum1(n1);
	    	menuCalculadora.setNum2(n2);
	    	resultadoResta=menuCalculadora.resta();
	    	model.addAttribute("resultadoResta", resultadoResta);
	    	
	    	return "resultadoR";
	    }   
	 @GetMapping("/calcularMultiplicacion")
	    public String getMultiplicacion(@RequestParam(name="n1")double n1,@RequestParam(name="n2")double n2,Model model) {
	    	double resultadoMulti;
	    	Calculadora menuCalculadora = new Calculadora();
	    	menuCalculadora.setNum1(n1);
	    	menuCalculadora.setNum2(n2);
	    	resultadoMulti=menuCalculadora.multiplicacion();
	    	model.addAttribute("resultadoMulti", resultadoMulti);
	    	
	    	
	    	return "resultadoM";
	    }   
	 @GetMapping("/calcularDivision")
	    public String getDivision(@RequestParam(name="n1")double n1,@RequestParam(name="n2")double n2,Model model) {
	    	double resultadoDiv;
	    	Calculadora menuCalculadora = new Calculadora();
	    	menuCalculadora.setNum1(n1);
	    	menuCalculadora.setNum2(n2);
	    	resultadoDiv=menuCalculadora.division();
	    	model.addAttribute("resultadoDiv", resultadoDiv);
	    	
	    	
	    	
	    	return "resultadoD";
	    }      
	 @GetMapping("/calcularPotencia")
	    public String getPotencia(@RequestParam(name="n1")double n1,@RequestParam(name="n2")double n2,Model model) {
	    	double resultadoPot;
	    	Calculadora menuCalculadora = new Calculadora();
	    	menuCalculadora.setNum1(n1);
	    	menuCalculadora.setNum2(n2);
	    	resultadoPot=menuCalculadora.potencia();
	    	model.addAttribute("resultadoPot", resultadoPot);
	    	
	    	
	    	
	    	return "resultadoP";
	    }      
	 @GetMapping("/calcularRaiz")
	    public String getSuma(@RequestParam(name="n1")double n1,@RequestParam(name="n2")double n2,Model model) {
	    	double resultadoRaiz;
	    	Calculadora menuCalculadora = new Calculadora();
	    	menuCalculadora.setNum1(n1);
	    	menuCalculadora.setNum2(n2);
	    	resultadoRaiz=menuCalculadora.raiz();
	    	model.addAttribute("resultadoRaiz", resultadoRaiz);
	    	
	    	
	    	
	    	return "resultadoRa";
	    }      
}
