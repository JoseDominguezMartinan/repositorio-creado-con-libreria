/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clasemaven;
import java.io.IOException;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GitHub;

/**
 *
 * @author jdominguezmartinan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         GitHub github = GitHub.connect();
         GHCreateRepositoryBuilder builder;
         builder=github.createRepository("repositorio creado con libreria");
        builder.create();
    }

    
    
    
    
}
