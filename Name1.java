class Name1{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)   
		{  
			for (int j=1; j<=70; j++ )   
			{   
				if(((i==1||i==2) && (j==4)||(i==3) && (j==4||j==1)||(i==4) && (j==2||j==3))){
					System.out.print("J");
				}else if(((i==1) && (j==9||j==26)||(i==2) && (j==8||j==10||j==25||j==27)||((i==3)&&((j>6&&j<12)||(j>23&&j<29)))||(i==4) && (j==6||j==12||j==23||j==29))){
					System.out.print("a");
				}else if(((i==1) && (j==14||j==20))||((i==2) && (j==15||j==19))||((i==3)&&(j==16||j==18))||((i==4) && (j==17))){
					System.out.print("V");
				}else{                                                               
					System.out.print(" ");
				}
			}   

	System.out.println();   
	}   
	}

}


                                                                 