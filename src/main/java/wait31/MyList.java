package wait31;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: dyh
 * Date:   2019/6/19
 * Description:
 */
public class MyList
{
    private static List list=new ArrayList();

    public static void add(){
        list.add("aa");
    }
    public static int size(){
        return list.size();
    }
}
