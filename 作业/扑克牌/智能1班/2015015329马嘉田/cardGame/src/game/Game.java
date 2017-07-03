package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {

	//创建玩家
    //要对玩家ID的异常处理，要求用户只能输入整数ID，否则需要重新输入
    public Player setPlayer(){
        int id=0;
        String name="";
        Scanner console = new Scanner(System.in);
        boolean ready = true;
        do{
            try{
                System.out.println("输入ID：");
                id = console.nextInt();
                ready = true;
            }catch(Exception e){
                System.out.println("请输入整数类型的ID！");
                ready = false;
                console.nextLine();
            }
        }while(ready==false);

        System.out.println("输入姓名：");
        name = console.next();      
        return new Player(id, name);
    }

	
}
