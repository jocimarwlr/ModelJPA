/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculopoupanca.controller;

import br.com.calculopoupanca.dao.CadastroDAO;
import br.com.calculopoupanca.entity.Cadastro;
import br.com.calculopoupanca.entity.Funcionario;
import br.com.calculopoupanca.model.DataEHora;
import com.google.gson.Gson;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author PC_LENOVO
 */
@Controller
@SessionAttributes("usuarioLogado")
public class CalculoNovoController {

    @RequestMapping("/olamundo")
    public String iniciando() {
    

        return "olamundo";
    }

    
    
     @RequestMapping("/testeControler")
    public  @ResponseBody    String retorno(){
        return  "klklkçklkçk";
        
    }
    
    
    
    
 
}
