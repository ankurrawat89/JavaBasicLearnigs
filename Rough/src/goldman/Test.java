package goldman;

import java.util.HashMap;
import java.util.HashSet;

public class Test {
public static void main(String args[]){
InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<String>();
threadLocal.set("I am local to a thread.");
MyRunnable runnable = new MyRunnable(threadLocal);
Thread t = new Thread(runnable);
t.start();
HashMap<String,HashSet<Long>> det = new HashMap<String,HashSet<Long>>();
HashSet<Long> numb = new HashSet<Long>();
numb.add(Long.valueOf(9011936712l));
det.put("ankur",numb);
}
}
