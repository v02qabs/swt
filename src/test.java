import java.io.*;

public class test
{
	static 
	{
		System.loadLibrary("print");
	}
	public native void Hello();

	public static void main(String[] args)
	{
		test t = new test();
		t.Hello();
	}
}

