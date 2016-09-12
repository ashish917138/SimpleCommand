/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashish.fileio.command;

import java.io.File;

/**
 *
 * @author Aasick
 */
public class DirCommand extends DosCommand {

    @Override
    public void execute(String[] cmd) {
        String path=(cmd.length==1)?".":cmd[1];
        File d = new File(path);
        for (File f : d.listFiles()) {
            System.out.print(f);
            System.out.println("\t"+ f.getTotalSpace());
        }
    }

}
