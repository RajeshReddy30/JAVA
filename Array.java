public class Array{
public static void main(String[] args){
	byte byte_Array[] = {1,2,3};
	int int_Arry[] = {1,2,3,4,5,6};
	short short_Array[] = {10,20,30,40,50};
	long long_Array[] = {100L,200L,300,400l};
	float float_Array[] = {1.1f,1.2f,1.3f,1.4f,1.5f,1.6f,1.7f,1.8f};
	double double_Array[] = {1.11,1.22,1.33,1.44,1.55,1.66};
	boolean boolean_Array[] = {true, false, true};
	char char_Array[] = {'A','B','C','D','E'};
	String string_Array[] = {"Array1","Array2","Array3","Array4"};
	
	System.out.println("The Byte Array are :"+byte_Array.length);
	System.out.println("The Int Array are :"+int_Arry.length);
	System.out.println("The Short Array are :"+short_Array.length);
	System.out.println("The Long Array are :"+long_Array.length);
	System.out.println("The Float Array are :"+float_Array.length);
	System.out.println("The Double Array are :"+double_Array.length);
	System.out.println("The Boolean Array are :"+boolean_Array.length);
	System.out.println("The Char Array are :"+char_Array.length);
	System.out.println("The String Array are :"+string_Array.length);
	
	for(int a=0 ; a<byte_Array.length ; a++)
		{
		System.out.println("The Byte Array are :"+byte_Array[a]);
		} 
		for(int b=0 ; b<int_Arry.length ; b++)
			{
			System.out.println("The Int Array are :"+int_Arry[b]);
			}
			for(int c=0 ; c<short_Array.length ; c++)
				{
			    System.out.println("The Short Array are :"+short_Array[c]);
				}
				for(int d=0 ; d<long_Array.length ; d++)
					{
					System.out.println("The Long Array are :"+long_Array[d]);
					}
					for(int e=0 ; e<float_Array.length ; e++)
						{
						System.out.println("The Float Array are :"+float_Array[e]);
						}
						for(int f=0 ; f<double_Array.length ; f++)
							{
							System.out.println("The Double Array are :"+double_Array[f]);
							}
							for(int g=0 ; g<boolean_Array.length ; g++)
								{
								System.out.println("The Boolean Array are :"+boolean_Array[g]);
								}
								for(int h=0 ; h<char_Array.length ; h++)
									{
									System.out.println("The Char Array are :"+char_Array[h]);
									}
									for(int i=0 ; i<string_Array.length ; i++)
										{
										System.out.println("The String Array are :"+string_Array[i]);
										}
	}
}