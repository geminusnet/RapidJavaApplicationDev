package corbademo;

/**
* corbademo/StudentHolder.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from C:/radft/corbademo/Student.idl
* Saturday, September 15, 2001 9:34:22 PM EDT
*/


// Student.idl
public final class StudentHolder implements org.omg.CORBA.portable.Streamable
{
  public corbademo.Student value = null;

  public StudentHolder ()
  {
  }

  public StudentHolder (corbademo.Student initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corbademo.StudentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corbademo.StudentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corbademo.StudentHelper.type ();
  }

}
