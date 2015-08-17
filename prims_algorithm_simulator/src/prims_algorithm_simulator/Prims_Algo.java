/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prims_algorithm_simulator;

import java.awt.HeadlessException;
import java.io.DataInputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aarifin
 */
public class Prims_Algo {
    public void input()
	{
	    	int cost[][]=new int[100][100];
	    	int t[][]=new int[100][10];
	    	int n=0,z=0;
	    	int i,j,k=0,l=0;
	    	int y=10000;
	   	DataInputStream xyz=new DataInputStream(System.in);

		try
		{

	   	 n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of vertices"));

	   	}
		catch(HeadlessException | NumberFormatException e){
                    System.err.println("_____");
                }

		try
		{

	    	for(i=1;i<=n;i++)
			for(j=i;j<=n;j++)
			{
				if(i==j)
				cost[i][j]=y;

				else
				{

				cost[i][j] =Integer.parseInt(JOptionPane.showInputDialog("Path length from node " + i + " to node " + j + " :"));
                                cost[j][i]=cost[i][j];
				}

				if(cost[i][j]==0)
				cost[i][j]=cost[j][i]=y;
			}
		}
		catch(HeadlessException | NumberFormatException e){}




	    	for(i=1;i<=n;i++)

	    	for(j=1;j<=n;j++)
		{
			if(y>=cost[i][j])
			{
				y=cost[i][j];
				k=i;l=j;
			}

                }

                z= prim(k,l,n,cost,t);
                System.out.println("The value of minimum cost spanning tree: "+z);

           SecondFrame f=new SecondFrame(n,cost);
           JFrame ff=new JFrame();
           ff.add(f);
           ff.setSize(500, 400);
           ff.setVisible(true);
        }

	int prim(int k,int l,int n,int cost[][],int t[][])
	{
	   	int i,mincost,j;
	   	int nearr[]=new int[100];

	   	mincost=cost[k][l];
	   	t[1][1]=k;t[1][2]=l;

	   	for(i=1;i<=n;i++)
			if(cost[i][l]<cost[i][k])
				nearr[i]=l;

			else
				nearr[i]=k;


	   	nearr[k]=nearr[l]=0;


	   	for(i=2;i<=n-1;i++)
	   	{
	       		j=findNear(nearr,n,cost);

	      		mincost=mincost+cost[j][nearr[j]];
	       		nearr[j]=0;

	       		for(k=1;k<=n;k++)
			{
				if(nearr[k]!=0&&cost[k][nearr[k]]>cost[k][j])
				nearr[k]=j;
			}


	  	}
	   return mincost;
	}



	int  findNear(int  nearr[],int n,int cost[][])
	{
		int min = 32000,j=0;
		for(int i=1;i<=n;i++)
		{
			if( nearr[i]!=0&& min > cost[i][nearr[i]])
			{
				j = i;
				min = cost[i][nearr[i]];
			}
		}
		return j;
	}
    
}
