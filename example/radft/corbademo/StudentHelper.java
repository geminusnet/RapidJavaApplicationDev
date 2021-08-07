package corbademo;


/**
* corbademo/StudentHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from C:/radft/corbademo/Student.idl
* Saturday, September 15, 2001 9:34:22 PM EDT
*/


// Student.idl
abstract public class StudentHelper
{
  private static String  _id = "IDL:Student:1.0";

  public static void insert (org.omg.CORBA.Any a, corbademo.Student that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static corbademo.Student extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (corbademo.StudentHelper.id (), "Student");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static corbademo.Student read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_StudentStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, corbademo.Student value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static corbademo.Student narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corbademo.Student)
      return (corbademo.Student)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      return new corbademo._StudentStub (delegate);
    }
  }

}