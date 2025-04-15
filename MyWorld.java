import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero penguin = new Hero();
        addObject(penguin, 100, 100);
        
        Bomb bomb = new Bomb();
        addObject(bomb, 600, 100);
    }
}
