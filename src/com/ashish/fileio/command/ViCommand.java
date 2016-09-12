/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashish.fileio.command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aasick
 */
public class ViCommand extends DosCommand {

    @Override
    public void execute(String[] cmd) {
        
        try {
                BufferedReader editor = new BufferedReader(new InputStreamReader(System.in));
                String nLine = "";
                StringBuilder content = new StringBuilder();
                while (!(nLine = editor.readLine()).equalsIgnoreCase("quit")) {
                    content.append(nLine).append("\r\n");
                }
                //editor.close();

                FileWriter writer = new FileWriter(cmd[1]);
                
                writer.write(content.toString());
                writer.close();

            } catch (IOException ioe) {

            }
    }

}
         