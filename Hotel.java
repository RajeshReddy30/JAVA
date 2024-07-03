class Hotel{
public static void rooms(){
int rate=500;
if(rate<600)
System.out.println("cost of room is cheap:"+rate);
else if(rate>600)
System.out.println("cost is expensive:"+rate);
else 
System.out.println("cost is normal");

}
public static void food(){
int quality=8;
if(quality>=7)
System.out.println("food quality is good");
else if(quality<7&&quality>5)
System.out.println("food quality is average");
else 
System.out.println("food quality is bad");
}
public static void rating(){
int rating=4;
if(rating>=4)
System.out.println("hotel rating is good");
else if(rating<4 && rating>2)
System.out.println("hotel rating is average");
else
System.out.println("hotel rating is are bad");
}

}