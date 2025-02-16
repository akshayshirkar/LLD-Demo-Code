package Multithreading.ThreadPool;

import java.util.concurrent.Callable;

public class callableExample implements Callable<Integer> {
public Integer call(){
int sum = 5+10;
return sum;
}
}
