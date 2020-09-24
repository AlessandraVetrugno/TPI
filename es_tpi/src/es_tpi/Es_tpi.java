/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_tpi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alessandravetrugno
 */
public class Es_tpi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File rubrica = new File ("Rubrica.xml");
        try(BufferedWriter out = new BufferedWriter(new FileWriter(rubrica))){
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        out.write("<Rubrica> \n<persona>\n<nome>Paolo</nome>\n<cognome>Camagni</cognome>\n<telefono_casa>030288888</telefono_casa>\n"
                + "<indirizzo_email>paolo@camagni.it</indirizzo_email>\n</persona>\n" );
        out.write(" \n<persona>\n<nome>Federico</nome>\n<cognome>Rossi</cognome>\n<telefono_casa>329002754</telefono_casa>\n"
                + "<indirizzo_email>federoss@libero.it</indirizzo_email>\n</persona>\n" );
        out.write(" \n<persona>\n<nome>Simona</nome>\n<cognome>Vet</cognome>\n<telefono_casa>33322456</telefono_casa>\n"
                + "<indirizzo_email>simovet@gmail.com</indirizzo_email>\n</persona>\n" );
         out.write(" \n<persona>\n<nome>Riccardo</nome>\n<cognome>Nikolassy</cognome>\n<telefono_casa>02777777</telefono_casa>\n"
                + "<indirizzo_email>riccardoi@nikolassy.it</indirizzo_email>\n</persona>\n</Rubrica>" );
        
    }
    }
}
