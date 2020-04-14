import java.util.Iterator;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Program {
public static void main (String args[]){
try{
main_program();} catch (Exception ex){ex.printStackTrace();}
}

private static MyString testSub(MyString b){
System.out.println(String.valueOf(b));
return b;
}
private static void main_program () {
System.out.println(String.valueOf(1));
Char ch=new Char('a');
System.out.println(String.valueOf(ch));
System.out.println(String.valueOf("Wow"));
MyString d=new MyString("hello world");
MyString str=testSub (d);
MyString s1=new MyString("test");
MyString s2=new MyString("example");
MyString s3=MyString.concat(s1,s2);
System.out.println(String.valueOf(s3));
MyString s4=MyString.join(s1,s2);
System.out.println(String.valueOf(s4));
MyString s5=MyString.replace(s1,s2);
System.out.println(String.valueOf(s5));
MyString s6=MyString.substring(s1,s2);
System.out.println(String.valueOf(s6));
StringArray a=new StringArray();
a.add(s1);
a.add(s2);
for (MyString s:a){
System.out.println(String.valueOf(s));
}
}

}
class Char {

    private final char data;

    public Char(char data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

}

class MyString {

    private String data ;

    public MyString(String data) {
        this.data = data;
    }

    public MyString() {
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MyString) {
            return ((MyString) obj).data.equals(data);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }



    public static MyString concat(MyString s1, MyString s2) {

        MyString out = new MyString();

        out.data = s1.data.concat(s2.data);


        return out;
    }

    public static MyString join(MyString s1, MyString s2) {

        MyString out = new MyString();

        out.data = String.join(" ",s1.data,s2.data);


        return out;
    }
 public static MyString replace(MyString s1, MyString s2) {

        MyString out = new MyString();

        out.data = s1.data.replace(s1.data.charAt(0),s2.data.charAt(0));


        return out;
    }
 public static MyString substring(MyString s1, MyString s2) {

       MyString out = new MyString();
 MyString s3 = new MyString();
        
        s3.data = s1.data.concat(s2.data);

        out.data = s3.data.substring(1,s3.data.length()-1);


        return out;
    }
}
class StringArray implements Iterable<MyString> {
    private final List<MyString> stringArray = new ArrayList<>();

    public StringArray() {
    }

    public boolean add(MyString myString) {
        return stringArray.add(myString);
    }

    public boolean remove(MyString myString) {
       return stringArray.remove(myString);
    }

    public int size() {
        return stringArray.size();
    }

    public void clear() {
        stringArray.clear();
    }

    @Override
    public Iterator<MyString> iterator() {
       return stringArray.iterator();
    }
}
