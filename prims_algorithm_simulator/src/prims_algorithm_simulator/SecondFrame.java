/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prims_algorithm_simulator;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author aarifin
 */
public class SecondFrame extends JPanel {
    int node;
    int X[]={0,20,100,10,50,120,10,30,100,150};
    int Y[]={0,10,20,100,100,100,1150,150,150,150};
    int cst[][];
    Graphics gg;
    public SecondFrame(int x,int ct[][])
    {
        node=x;
        cst=ct;
    }

   
    public void getValue(int nd)
    {
      node=nd;
    }
    @Override
   public void paint(Graphics g)
    {
    	System.out.println(""+node);

       for(int i=1;i<=node;i++)
       {
       	 for(int j=i;j<=node;j++)
       	 {
       	 	if(i!=j)
       	 	{
	       	  g.setColor(Color.cyan);
	       	  g.drawLine(X[i],Y[i],X[j],Y[j]);
	       	  g.setColor(Color.BLACK);
	       	  g.drawString(""+cst[i][j],(X[i]+X[j])/2,(Y[i]+Y[j])/2);
	       	}
       	   g.setColor(Color.red);
	       g.fillOval(X[i],Y[i],10,10);
       	 }
       }
	}
    
}
