class Electronics
{
void on()
{
System.out.println("Device is on");
}
void off()
{
System.out.println("Device is off");
}
}

class Tv extends Electronics
{
void on()
{
System.out.println("Tv is on");
}
void off()
{
System.out.println("Tv is off");
}
void display()
{
System.out.println("Displaying on Tv");
}
}

class Radio extends Electronics
{
void on()
{
System.out.println("Radio is on");
}
void off()
{
System.out.println("Radio if off");
}
void fm()
{
System.out.println("FM is on");
}
}

class Test1234
{
public static void main(String args[])
{
Electronics e=new Tv();
e.on();
e.off();
System.out.println(e);
e=new Radio();
System.out.println(e);
e.on();
e.off();
Tv t=(Tv) e;
Radio r=(Radio) e;
t.display();
r.fm();
}
}
