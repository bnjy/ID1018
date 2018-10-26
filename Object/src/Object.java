
import java.util.*;
import java.lang.*;

public class Object {
    public static void main(String[] args) {

    StringBuilder[]     sb = new StringBuilder[4];

    sb[0] = new StringBuilder("aaaa");
    sb[1] = new StringBuilder("bbbb");
    sb[2] = new StringBuilder("cccc");
    sb[3] = new StringBuilder("dddd");

        System.out.println(Arrays.toString(sb));

    for (int i = 0; i < sb.length; i++){

        sb[i].append("123");
    }

        System.out.println(Arrays.toString(sb));

    }
}